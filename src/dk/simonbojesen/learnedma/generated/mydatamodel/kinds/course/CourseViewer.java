package dk.simonbojesen.learnedma.generated.mydatamodel.kinds.course;

import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonSet;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.teacher.TeacherViewer;
import dk.simonbojesen.learnedma.generated.valuedomains.Name;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.Course;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.CourseID;

/**
 * This is the viewing interface for Course
 */
public interface CourseViewer
{

    /**
     * Create a copy of this Course at this instance in time
     * @return  A copy of this Course entity as a value  from the value domain
     *          Course
     */
    public Course snapshot();

    /**
     * Returns the ID of this Course
     * @return  The ID of this Course
     */
    public CourseID getID();

    /**
     * Returns the attribute name of this Course
     * @return  The value of the attribute name
     */
    public Name getName();

    /**
     * This methods follows the relation CourseEnrollment
     * @return  The result of following the relation CourseEnrollment
     */
    public PersonSet getStudentSet();

    /**
     * This methods follows the relation TeacherAssignment
     * @return  The result of following the relation TeacherAssignment
     */
    public TeacherViewer getTeacher();

    /**
     * Returns <tt>true</tt> if this entity has the same ID as the provided
     * entity
     * @param o  The object to compare with
     * @return   <tt>true</tt> if this entity has the same ID as the provided
     *           entity
     */
    public boolean equals(Object o);

    /**
     * Returns the hash code of this entity
     * @return  The hash code of this entity
     */
    public int hashCode();

}
