package dk.simonbojesen.learnedma.generated.mydatamodel.kinds.course;

import dk.simonbojesen.learnedma.generated.valuedomains.Name;
import org.abstractica.edma.runtime.intf.exceptions.UniqueException;

/**
 * This is the update interface for Course
 */
public interface CourseUpdater extends CourseViewer
{

    /**
     * Begin attribute updates on this Course
     * @return  An attribute update interface for chaining attribute updates
     */
    public CourseAttUpd beginUpdate();

    /**
     * Interface for updating attributes on an entity of kind: Course
     */
    public interface CourseAttUpd
    {

        /**
         * Sets the attribute name on this Course
         * @param name  The value to set
         * @return      Interface for chaining attribute updates
         */
        public CourseAttUpdUnique setName(Name name);

        /**
         * Saves the changes to the data model.
         * @return  
         */
        public boolean save();

    }

    /**
     * Interface for updating attributes on an entity of kind: Course
     */
    public interface CourseAttUpdUnique
    {

        /**
         * Sets the attribute name on this Course
         * @param name  The value to set
         * @return      Interface for chaining attribute updates
         */
        public CourseAttUpdUnique setName(Name name);

        /**
         * Saves the changes to the data model.
         * @return  
         */
        public boolean save() throws UniqueException;

    }

}
