package dk.simonbojesen.learnedma.generated.mydatamodel.remote;

import dk.simonbojesen.learnedma.generated.mydatamodel.MyDataModel;

/**
 * 
 */
public class MyDataModelClientInstance implements MyDataModel
{
    private String edma_hostname;
    private int edma_port;



    /**
     * Constructor
     * @param edma_hostname  Name of the server host
     * @param edma_port      port to connect to
     */
    public MyDataModelClientInstance(String edma_hostname, int edma_port)
    {
        this.edma_hostname = edma_hostname;
        this.edma_port = edma_port;
    }
}
