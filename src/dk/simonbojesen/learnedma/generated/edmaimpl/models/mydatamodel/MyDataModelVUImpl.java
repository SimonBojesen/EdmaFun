package dk.simonbojesen.learnedma.generated.edmaimpl.models.mydatamodel;

import dk.simonbojesen.learnedma.generated.edmaimpl.models.mydatamodel.PersonVUImpl;
import dk.simonbojesen.learnedma.generated.mydatamodel.MyDataModelUpdater;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonKind;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonUpdater;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import dk.simonbojesen.learnedma.generated.valuedomains.Email;
import dk.simonbojesen.learnedma.generated.valuedomains.Name;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.Person;
import org.abstractica.edma.runtime.intf.IDataModelUpdate;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IEntity;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class MyDataModelVUImpl implements MyDataModelUpdater
{
    private IDataModelView edma_dmview;



    /**
     * Constructor
     * @param edma_dmview  The internal runtime interface
     */
    public MyDataModelVUImpl(IDataModelView edma_dmview)
    {
        this.edma_dmview = edma_dmview;
    }

    /**
     * Returns the interface to the kind Person
     * @return  The interface to the kind Person
     */
    public PersonKind getPersonKind()
    {
        return new PersonKindImpl(0, edma_dmview);
    }

    /**
     * Starts creation of a new Person entity.
     * @return  Builder interface to set the firstName attribute.
     */
    public PersonBuilderFirstName newPerson()
    {
        return new PersonBuilder(edma_dmview.getUpdateInterface(), null);
    }

    /**
     * Starts creation of a new Person entity.
     * @param ID  ID of the entity
     * @return    Builder interface to set the firstName attribute.
     */
    public PersonBuilderFirstName newPerson(Long ID)
    {
        return new PersonBuilder(edma_dmview.getUpdateInterface(), ID);
    }

    /**
     * Creates a new Person from a value in the value domain Person
     * @param person  The value for the new Person.
     * @return        The newly created Person
     */
    public PersonUpdater newPerson(Person person)
    {
        Object[] edma_tmpValues = (Object[]) ((IValueInstance) person).edma_getValue();
        Object[] edma_values = new Object[edma_tmpValues.length];
        for(int i = 0; i < edma_tmpValues.length; ++i)
        {
            edma_values[i] = edma_tmpValues[i];
        }
        IEntity edma_entity = edma_dmview.getUpdateInterface().entityNew(0, edma_values);
        return new PersonVUImpl(edma_entity, edma_dmview);
    }

    /**
     * Deletes an entity of kind Person
     * @param person  The Person to be deleted. All extensions to this entity
     *                will also be deleted.
     * @return        <tt>true</tt> if the entity existed and was deleted
     */
    public boolean delete(PersonViewer person)
    {
        IDataModelUpdate edma_dmupdate = edma_dmview.getUpdateInterface();
        //Delete the entity.
        return edma_dmupdate.entityDelete(0, person.getID().value());
    }

    /**
     * Updates an entity of kind: Person
     * @param person  The entity to update
     * @return        The updater interface for the entities of kind: Person
     */
    public PersonUpdater update(PersonViewer person)
    {
        return (PersonVUImpl) person;
    }


    /**
     * 
     */
    public class PersonBuilder implements PersonBuilderEmail, PersonBuilderFirstName, PersonBuilderLastName
    {
        private IDataModelUpdate edma_upd;
        private Object[] value;



        /**
         * Constructor
         * @param edma_upd  Internal runtime interface
         * @param edma_ID   ID of the entity
         */
        public PersonBuilder(IDataModelUpdate edma_upd, Long edma_ID)
        {
            this.edma_upd = edma_upd;
            value = new Object[4];
            value[0] = edma_ID;
        }

        /**
         * sets the firstName attribute.
         * @param firstName  The value to assign to the firstName attribute
         * @return           Builder interface for setting the lastName
         *                   attribute
         */
        public PersonBuilderLastName firstName(Name firstName)
        {
            if(firstName == null) throw new NullPointerException();
            value[1] = ((IValueInstance) firstName).edma_getValue();
            return this;
        }

        /**
         * sets the lastName attribute.
         * @param lastName  The value to assign to the lastName attribute
         * @return          Builder interface for setting the email attribute
         */
        public PersonBuilderEmail lastName(Name lastName)
        {
            if(lastName == null) throw new NullPointerException();
            value[2] = ((IValueInstance) lastName).edma_getValue();
            return this;
        }

        /**
         * sets the email attribute.
         * @param email  The value to assign to the email attribute
         * @return       The id of the created Person entity
         */
        public PersonUpdater email(Email email)
        {
            if(email == null) throw new NullPointerException();
            value[3] = ((IValueInstance) email).edma_getValue();
            IEntity edma_entity = edma_upd.entityNew(0, value);
            return new PersonVUImpl(edma_entity, edma_upd);
        }
    }

}
