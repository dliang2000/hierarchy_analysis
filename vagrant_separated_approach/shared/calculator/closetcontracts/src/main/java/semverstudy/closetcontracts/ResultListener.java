package semverstudy.closetcontracts;

import semverstudy.commons.Project;
import semverstudy.commons.ProjectVersion;

/**
 * Abstraction for how to process results.
 * @author jens dietrich
 */
public interface ResultListener {

    void resultFound(Project project, ProjectVersion projectVersion1, ProjectVersion projectVersion2, String location, String violationType, String detail);
}
