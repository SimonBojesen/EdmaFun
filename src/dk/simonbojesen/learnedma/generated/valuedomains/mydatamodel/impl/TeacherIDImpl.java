package dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.impl;

import dk.simonbojesen.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.TeacherID;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * The implementation of TeacherID
 */
public class TeacherIDImpl extends TeacherID implements IValueInstance
{
    private Object value;



    /**
     * Check if a value is valid
     * @param value  The value to validate
     */
    public static void edma_validate(Object value) throws InvalidValueException
    {
        edma_domain.validate(value, EDMA_ExternalConstraints.instance);
    }

    /**
     * create value without checking
     * @param value  The value to check and create
     * @return       <tt>true</tt> The new created value
     */
    public static Object edma_create(Object value)
    {
        return edma_domain.newValue(value);
    }

    /**
     * Constructor
     * @param value  The internal value
     */
    public TeacherIDImpl(Object value)
    {
        this.value = value;
    }

    /**
     * Gets the value domain for this value instance
     * @return  The value domain for this value instance
     */
    public IMetaValueDomain edma_getDomain()
    {
        return edma_domain;
    }

    /**
     * Access to the general Object value
     * @return  The value as a general Object
     */
    public Object edma_getValue()
    {
        return value;
    }

    /**
     * Returns <tt>true</tt> if this value equals the given value
     * @param o  Object to test equality with
     * @return   <tt>true</tt> if this value equals the given value
     */
    public boolean equals(Object o)
    {
        if(!(o instanceof IValueInstance)) return false;
        IValueInstance inst = (IValueInstance) o;
        if(25 != inst.edma_getDomain().getIndex()) return false;
        return edma_domain.valueEqual(value, inst.edma_getValue());
    }

    /**
     * Gets the value hash for this value instance
     * @return  The hash for this value instance
     */
    public int hashCode()
    {
        return value.hashCode();
    }

    /**
     * Returns this value instance as a string
     * @return  this value instance as a string
     */
    public String toString()
    {
        return edma_domain.valueToString(value);
    }

    /**
     * Compare this TeacherID to another TeacherID
     * @param teacherID  The TeacherID to compare with
     * @return           A negative integer, zero, or a positive integer as
     *                   this TeacherID is less than, equal to, or greater than
     *                   the specified TeacherID
     */
    public int compareTo(TeacherID teacherID)
    {
        return edma_domain.valueCompare(value, ((TeacherIDImpl) teacherID).value);
    }

    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public void toStream(DataOutput out) throws IOException
    {
        edma_domain.writeValue(((IValueInstance) this).edma_getValue(), out);
    }

    /**
     * returns the Long value that is stored in this TeacherID
     * @return  The Long value stored in this TeacherID
     */
    public Long value()
    {
        return (Long) value;
    }
}
