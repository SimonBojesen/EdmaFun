package dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person;

import dk.simonbojesen.learnedma.generated.valuedomains.Email;
import dk.simonbojesen.learnedma.generated.valuedomains.Name;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.Person;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.PersonID;

/**
 * This is the viewing interface for Person
 */
public interface PersonViewer
{

    /**
     * Create a copy of this Person at this instance in time
     * @return  A copy of this Person entity as a value  from the value domain
     *          Person
     */
    public Person snapshot();

    /**
     * Returns the ID of this Person
     * @return  The ID of this Person
     */
    public PersonID getID();

    /**
     * Returns the attribute firstName of this Person
     * @return  The value of the attribute firstName
     */
    public Name getFirstName();

    /**
     * Returns the attribute lastName of this Person
     * @return  The value of the attribute lastName
     */
    public Name getLastName();

    /**
     * Returns the attribute email of this Person
     * @return  The value of the attribute email
     */
    public Email getEmail();

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
