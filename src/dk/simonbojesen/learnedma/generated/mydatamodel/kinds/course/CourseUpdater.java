package dk.simonbojesen.learnedma.generated.mydatamodel.kinds.course;

import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.teacher.TeacherViewer;
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
     * Connects the student to this Course, if it is not already connected.
     *  This method has been generated from the relation:
     *  CourseEnrollment
     * @param student  The student to be added. May NOT be null.
     * @return         <tt>true</tt> if this course was not already connected
     *                 to the specified student
     */
    public boolean addStudent(PersonViewer student);

    /**
     * Removes the student from this Course, if it is connected.
     *  This method has been generated from the relation:
     *  CourseEnrollment
     * @param student  The student to be connected to this course. May NOT be
     *                 null.
     * @return         <tt>true</tt> if the specified student was connected to
     *                 this course
     */
    public boolean removeStudent(PersonViewer student);

    /**
     * Sets the teacher for this Course. If another teacher is already set, it
     * will be replaced.
     *  This method has been generated from the relation:
     *  TeacherAssignment
     * @param teacher  The teacher to be set. Use null to remove any previous
     *                 connection.
     * @return         The previous teacher connected to this course or null if
     *                 none was connected.
     */
    public TeacherViewer setTeacher(TeacherViewer teacher);

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
