package dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person;

import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonSet;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.PersonID;

/**
 * Interface for the kind: Person
 */
public interface PersonKind
{

    /**
     * Get an entity from its id.
     * @param id  The id of the entity to get
     * @return    A viewer on the entity with the given ID or null if none
     *            exists.
     */
    public PersonViewer getFromID(PersonID id);

    /**
     * Returns the set of all Person entities.
     * @return  The set of all Person entities.
     */
    public PersonSet getAll();

}
