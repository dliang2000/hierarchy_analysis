package semverstudy.commons;

import com.google.common.base.Preconditions;
import org.apache.commons.io.FileUtils;
import org.codehaus.plexus.archiver.AbstractUnArchiver;
import org.codehaus.plexus.archiver.tar.TarGZipUnArchiver;
import org.codehaus.plexus.archiver.zip.ZipUnArchiver;
import org.codehaus.plexus.logging.Logger;
import org.codehaus.plexus.logging.console.ConsoleLoggerManager;
import java.io.File;
import java.net.URL;

/**
 * Utility to easily access and cache resources.
 * Archives are downloaded and unpacked.
 * @author jens dietrich
 */
public class Downloader {

    public static final File CACHE = new File(".cache");
    public static final int CONNECT_TIMEOUT = 60 * 1000;
    public static final int READ_TIMEOUT = 60 * 60 * 1000;

    public static final org.apache.log4j.Logger LOGGER = Logging.getLogger("archive-downloader");

    static {
        if (!CACHE.exists()) {
            CACHE.mkdirs();
            LOGGER.info("Cache folder initialised: " + CACHE.getAbsolutePath());
        }
    }

    public static void main(String[] args) throws Exception {
        Preconditions.checkArgument(args.length==1,"one argument is required: the data url");
        URL url = new URL(args[0]);
        download(url);
        System.out.println("done");
    }

    /**
     * Download data from a URL, unpack it into a local dir and return this.
     * @param url  -- the URL must and in a string corresponding to a supported archive format, see source code for what is supported
     * @return a local folder containing the data downloaded, if the folder already exists, it will be interpreted as cache and not be replaced
     * @throws Exception
     */
    public static File download (URL url) throws Exception {
        String cachedFileName = url.toString()
                .replaceAll("://","__")
                .replaceAll("/","__");

        String targetFolderName = null;
        ArchiveType archiveType = null;
        if (url.toString().endsWith(".tar.gz") || url.toString().endsWith(".tgz")) {
            archiveType = ArchiveType.tgz;
            targetFolderName = cachedFileName.substring(0,cachedFileName.length()-7);
        }
        else if (url.toString().endsWith(".zip")) {
            archiveType = ArchiveType.zip;
            targetFolderName = cachedFileName.substring(0,cachedFileName.length()-4);
        } else if(url.toString().endsWith(".jar")) {
        	// do nothing here
        }
        else {
            throw new IllegalArgumentException("Cannot infer archive format from URL " + url);
        }

        // Copy URL to cached file
        File cachedFile = new File(CACHE,cachedFileName);
        LOGGER.info("Fetching data from URL: " + url);
        FileUtils.copyURLToFile(url, cachedFile, CONNECT_TIMEOUT, READ_TIMEOUT);
        LOGGER.info("Done, temp archive created: " + cachedFile);
        //
        if(targetFolderName == null) {
        	// Must be jar
        	return cachedFile;
        } else {
            // Expand into target folder
        	File targetFolder = new File(CACHE,targetFolderName);
        	//
        	if (!targetFolder.exists()) {
        		// unzip
        		ConsoleLoggerManager manager = new ConsoleLoggerManager();
        		Logger plexusLogger = manager.getLoggerForComponent("archive-downloader");

        		targetFolder.mkdir();
        		AbstractUnArchiver unarchiver = null;
        		if (archiveType==ArchiveType.tgz) {
        			unarchiver = new TarGZipUnArchiver();
        		}
        		else if (archiveType==ArchiveType.zip) {
        			unarchiver = new ZipUnArchiver();
        		}
        		unarchiver.setSourceFile(cachedFile);
        		unarchiver.setDestDirectory(targetFolder);
        		unarchiver.enableLogging(plexusLogger);
        		unarchiver.extract();
        		LOGGER.info("Done, temp archive unpacked into: " + targetFolder);

        		cachedFile.delete();
        	}
        	else {
        		LOGGER.info("Using cached data: " + targetFolder.getAbsolutePath());
        	}
            return targetFolder;
        }
    }
}
