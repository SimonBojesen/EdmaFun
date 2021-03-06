package dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel;

import dk.simonbojesen.learnedma.generated.LearnEDMA2;
import dk.simonbojesen.learnedma.generated.valuedomains.Email;
import dk.simonbojesen.learnedma.generated.valuedomains.Name;
import dk.simonbojesen.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.PersonID;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.impl.PersonBuilderImpl;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.impl.PersonImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Person
 */
public abstract class Person implements Comparable<Person>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA2.environment.getValueDomainDefinitions().getValueDomain(24);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Person from the terminal
     */
    public static Person fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new PersonImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Person from the string representation
     */
    public static Person fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new PersonImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Person read from the stream
     */
    public static Person fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new PersonImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Person read from the stream
     */
    public static Person fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new PersonImpl(res);
    }

    /**
     * Starts creation of a new Person
     * @return  Builder interface to set the ID field
     */
    public static PersonBuilderID create()
    {
        return new PersonBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field ID
     * @return  The value of the field ID
     */
    public abstract PersonID ID();

    /**
     * returns the value of the field firstName
     * @return  The value of the field firstName
     */
    public abstract Name firstName();

    /**
     * returns the value of the field lastName
     * @return  The value of the field lastName
     */
    public abstract Name lastName();

    /**
     * returns the value of the field personalMail
     * @return  The value of the field personalMail
     */
    public abstract Email personalMail();


    /**
     * Builder interface for setting the ID field of Person
     */
    public interface PersonBuilderID
    {

        /**
         * sets the ID field.
         * @param ID  The value to assign to the ID field
         * @return    Builder interface for setting the firstName field
         */
        public PersonBuilderFirstName ID(PersonID ID);

        /**
         * sets the ID field.
         * @param ID  The value to assign to the ID field
         * @return    Builder interface for setting the firstName field
         */
        public PersonBuilderFirstName ID(Long ID) throws InvalidValueException;

        /**
         * sets the fieldID to null.
         * @return  Builder interface for setting the firstName field
         */
        public PersonBuilderFirstName noID();

    }



    /**
     * Builder interface for setting the firstName field of Person
     */
    public interface PersonBuilderFirstName
    {

        /**
         * sets the firstName field.
         * @param firstName  The value to assign to the firstName field
         * @return           Builder interface for setting the lastName field
         */
        public PersonBuilderLastName firstName(Name firstName);

        /**
         * sets the firstName field.
         * @param firstName  The value to assign to the firstName field
         * @return           Builder interface for setting the lastName field
         */
        public PersonBuilderLastName firstName(String firstName) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the lastName field of Person
     */
    public interface PersonBuilderLastName
    {

        /**
         * sets the lastName field.
         * @param lastName  The value to assign to the lastName field
         * @return          Builder interface for setting the personalMail field
         */
        public PersonBuilderPersonalMail lastName(Name lastName);

        /**
         * sets the lastName field.
         * @param lastName  The value to assign to the lastName field
         * @return          Builder interface for setting the personalMail field
         */
        public PersonBuilderPersonalMail lastName(String lastName) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the personalMail field of Person
     */
    public interface PersonBuilderPersonalMail
    {

        /**
         * sets the personalMail field.
         * @param personalMail  The value to assign to the personalMail field
         * @return              The created Person value
         */
        public Person personalMail(Email personalMail);

        /**
         * sets the personalMail field.
         * @param personalMail  The value to assign to the personalMail field
         * @return              The created Person value
         */
        public Person personalMail(String personalMail) throws InvalidValueException;

    }

}
