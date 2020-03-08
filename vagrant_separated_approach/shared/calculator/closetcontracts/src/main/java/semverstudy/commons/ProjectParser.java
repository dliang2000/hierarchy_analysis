package semverstudy.commons;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.IOException;

/**
 * Simple json parser based on automatically mapping json to objects.
 * @author jens dietrich
 */

public class ProjectParser {

    public static final org.apache.log4j.Logger LOGGER = Logging.getLogger("projectspec-parser");

    public static Project[] parseProjects(File projectDescriptors) throws IOException {
        Preconditions.checkArgument(projectDescriptors.exists());
        ObjectMapper objectMapper = new ObjectMapper();
        LOGGER.info("Parsing project specs: " + projectDescriptors.getAbsolutePath());
        Project[] projects = objectMapper.readValue(projectDescriptors,Project[].class);
        LOGGER.info("Successfully parsed " + projects.length + " project specs");
        return projects;
    }
}
