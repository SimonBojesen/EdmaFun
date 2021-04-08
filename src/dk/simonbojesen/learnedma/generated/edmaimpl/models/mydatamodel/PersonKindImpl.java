package dk.simonbojesen.learnedma.generated.edmaimpl.models.mydatamodel;

import dk.simonbojesen.learnedma.generated.edmaimpl.models.mydatamodel.PersonSetImpl;
import dk.simonbojesen.learnedma.generated.edmaimpl.models.mydatamodel.PersonVUImpl;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonKind;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonSet;
import dk.simonbojesen.learnedma.generated.mydatamodel.kinds.person.PersonViewer;
import dk.simonbojesen.learnedma.generated.valuedomains.mydatamodel.PersonID;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IEntity;

/**
 * 
 */
public class PersonKindImpl implements PersonKind
{
    private int edma_kindIndex;
    private IDataModelView edma_dmview;



    /**
     * Constructor
     * @param edma_kindIndex  kind index
     * @param edma_dmview     Internal runtime interface
     */
    public PersonKindImpl(int edma_kindIndex, IDataModelView edma_dmview)
    {
        this.edma_kindIndex = edma_kindIndex;
        this.edma_dmview = edma_dmview;
    }

    /**
     * Get an entity from its id.
     * @param id  The id of the entity to get
     * @return    A viewer on the entity with the given ID or null if none
     *            exists.
     */
    public PersonViewer getFromID(PersonID id)
    {
        IEntity res = edma_dmview.kindGetFromID(edma_kindIndex, id.value());
        if(res == null) return null;
        return new PersonVUImpl(res, edma_dmview);
    }

    /**
     * Returns the set of all Person entities.
     * @return  The set of all Person entities.
     */
    public PersonSet getAll()
    {
        int newSetID = edma_dmview.kindGetAll(0);
        return new PersonSetImpl(newSetID, edma_dmview);
    }
}
