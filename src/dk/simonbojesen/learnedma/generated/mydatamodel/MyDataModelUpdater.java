package dk.simonbojesen.learnedma.generated.mydatamodel;

import dk.simonbojesen.learnedma.generated.mydatamodel.MyDataModelViewer;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonUpdater;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import dk.simonbojesen.learnedma.generated.valuedomains.Email;
import dk.simonbojesen.learnedma.generated.valuedomains.Name;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.Person;

/**
 * This is the updating interface for the MyDataModel data model.
 */
public interface MyDataModelUpdater extends MyDataModelViewer
{

    /**
     * Starts creation of a new Person entity.
     * @return  Builder interface to set the firstName attribute.
     */
    public PersonBuilderFirstName newPerson();

    /**
     * Starts creation of a new Person entity.
     * @param ID  ID of the entity
     * @return    Builder interface to set the firstName attribute.
     */
    public PersonBuilderFirstName newPerson(Long ID);

    /**
     * Creates a new Person from a value in the value domain Person
     * @param person  The value for the new Person.
     * @return        The newly created Person
     */
    public PersonUpdater newPerson(Person person);

    /**
     * Deletes an entity of kind Person
     * @param person  The Person to be deleted. All extensions to this entity
     *                will also be deleted.
     * @return        <tt>true</tt> if the entity existed and was deleted
     */
    public boolean delete(PersonViewer person);

    /**
     * Updates an entity of kind: Person
     * @param person  The entity to update
     * @return        The updater interface for the entities of kind: Person
     */
    public PersonUpdater update(PersonViewer person);

    /**
     * Builder interface for setting the firstName attribute
     */
    public interface PersonBuilderFirstName
    {

        /**
         * sets the firstName attribute.
         * @param firstName  The value to assign to the firstName attribute
         * @return           Builder interface for setting the lastName
         *                   attribute
         */
        public PersonBuilderLastName firstName(Name firstName);

    }

    /**
     * Builder interface for setting the lastName attribute
     */
    public interface PersonBuilderLastName
    {

        /**
         * sets the lastName attribute.
         * @param lastName  The value to assign to the lastName attribute
         * @return          Builder interface for setting the email attribute
         */
        public PersonBuilderEmail lastName(Name lastName);

    }

    /**
     * Builder interface for setting the email attribute
     */
    public interface PersonBuilderEmail
    {

        /**
         * sets the email attribute.
         * @param email  The value to assign to the email attribute
         * @return       The id of the created Person entity
         */
        public PersonUpdater email(Email email);

    }

}
