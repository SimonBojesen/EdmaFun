package dk.simonbojesen.learnedma.generated.mydatamodel.remote;

import dk.simonbojesen.learnedma.generated.mydatamodel.MyDataModel;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.runtime.remote.IServerInstance;

/**
 * 
 */
public class MyDataModelServerInstance implements IServerInstance
{
    private MyDataModel edma_inst;



    /**
     * Constructor
     * @param edma_inst  The data model instance
     */
    public MyDataModelServerInstance(MyDataModel edma_inst)
    {
        this.edma_inst = edma_inst;
    }

    /**
     * call a method
     * @param methodID  ID of the method to call
     * @param edma_in   Stream to read input parameters from
     * @param edma_out  Stream to write output parameters to
     */
    public void call(int methodID, DataInput edma_in, DataOutput edma_out) throws IOException
    {
        switch(methodID)
        {
            default:
                throw new RuntimeException("Invalid method ID: " + methodID);
        }
    }
}
