package dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person;

import dk.simonbojesen.learnedma.generated.valuedomains.Email;
import dk.simonbojesen.learnedma.generated.valuedomains.Name;

/**
 * This is the update interface for Person
 */
public interface PersonUpdater extends PersonViewer
{

    /**
     * Begin attribute updates on this Person
     * @return  An attribute update interface for chaining attribute updates
     */
    public PersonAttUpd beginUpdate();

    /**
     * Interface for updating attributes on an entity of kind: Person
     */
    public interface PersonAttUpd
    {

        /**
         * Sets the attribute firstName on this Person
         * @param firstName  The value to set
         * @return           Interface for chaining attribute updates
         */
        public PersonAttUpd setFirstName(Name firstName);

        /**
         * Sets the attribute lastName on this Person
         * @param lastName  The value to set
         * @return          Interface for chaining attribute updates
         */
        public PersonAttUpd setLastName(Name lastName);

        /**
         * Sets the attribute email on this Person
         * @param email  The value to set
         * @return       Interface for chaining attribute updates
         */
        public PersonAttUpd setEmail(Email email);

        /**
         * Saves the changes to the data model.
         * @return  
         */
        public boolean save();

    }

}
