package dk.simonbojesen.learnedma.generated.mydatamodel.test;

import dk.simonbojesen.learnedma.generated.mydatamodel.MyDataModel;
import java.io.IOException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;

/**
 * 
 */
public class MyDataModelTest
{
    private MyDataModel edma_dm;
    private ITerminal edma_terminal;



    /**
     * Constructor
     * @param edma_dm        Interface to an instance of the MyDataModel data
     *                       model
     * @param edma_terminal  Terminal to get value domains from
     */
    public MyDataModelTest(MyDataModel edma_dm, ITerminal edma_terminal)
    {
        this.edma_dm = edma_dm;
        this.edma_terminal = edma_terminal;
    }

    /**
     * Starts the test
     */
    public void start() throws IOException
    {
        while(true)
        {
            menu();
            String val = readInputLine();
            if("exit".equalsIgnoreCase(val)) break;
            try
            {
                int choice = Integer.parseInt(val);
                switch(choice)
                {
                    default:
                        edma_terminal.put(choice + " does not exist! Please try again!\n");
                }
            }
            catch(NumberFormatException e)
            {
                edma_terminal.put(val + " is not a valid input! Please try again!\n");
            }
        }
    }

    /**
     * Prints the menu
     */
    private void menu()
    {
        edma_terminal.put("Welcome to the MyDataModel interactive test!\n");
        edma_terminal.put("************************************************************************\n");
        edma_terminal.put("  Actions\n  -------\n");
        edma_terminal.put("  Views\n  -----\n");
        edma_terminal.put("Please choose a transaction to call (or type exit to exit):\n");
    }

    /**
     * Reads a line from stdin
     * @return  
     */
    private String readInputLine()
    {
        edma_terminal.put(": ");
        return edma_terminal.getString();
    }
}
