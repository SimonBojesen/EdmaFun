package dk.simonbojesen.learnedma.generated.mydatamodel.actions;

import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.CourseID;
import org.abstractica.edma.runtime.intf.IResult;

/**
 * Access to the result of the method: createCourse
 */
public interface CreateCourseResult extends IResult
{

    /**
     * Returns the output id:CourseID
     * @return  The output id:CourseID
     */
    public CourseID getId();

}
