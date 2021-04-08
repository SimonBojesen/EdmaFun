package dk.simonbojesen.learnedma.generated.edmaimpl.models.mydatamodel;

import dk.simonbojesen.learnedma.generated.mydatamodel.MyDataModel;
import org.abstractica.edma.runtime.intf.IDataModelInstance;

/**
 * 
 */
public class MyDataModelAPIImpl implements MyDataModel
{
    private IDataModelInstance edma_dmi;



    /**
     * Constructor
     * @param edma_dmi  Data model instance runtime interface
     */
    public MyDataModelAPIImpl(IDataModelInstance edma_dmi)
    {
        this.edma_dmi = edma_dmi;
    }

    /**
     * Access to the internal data model instance
     * @return  The internal data model instance
     */
    public IDataModelInstance edma_getDMI()
    {
        return edma_dmi;
    }
}
