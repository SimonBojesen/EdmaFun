import dk.simonbojesen.learnedma.generated.LearnEDMA2;
import dk.simonbojesen.learnedma.generated.mydatamodel.MyDataModel;
import dk.simonbojesen.learnedma.generated.mydatamodel.MyDataModelFactory;
import dk.simonbojesen.learnedma.generated.mydatamodel.MyDataModelInstance;
import dk.simonbojesen.learnedma.generated.mydatamodel.test.MyDataModelTest;
import org.abstractica.edma.runtime.implementations.common.collectionfactory.java.JavaCollectionFactory;
import org.abstractica.edma.runtime.implementations.mem.RuntimeFactory;
import org.abstractica.edma.valuedomains.userinput.SimpleTerminal;

import java.io.IOException;

public class Play {
    public static void main(String[] args) throws IOException {
        LearnEDMA2 learnEDMA2 = new LearnEDMA2(new RuntimeFactory("C:/tmp", new JavaCollectionFactory()));
        MyDataModelFactory mdmf = learnEDMA2.getMyDataModelFactory();
        MyDataModelInstance inst = null;

        if(mdmf.exists("MyInstance")){
            System.out.println("Loading instance data...");
            inst = mdmf.getInstance("MyInstance");
        }
        else
        {
            System.out.println("Creating instance data...");
            inst = mdmf.newInstance("MyInstance");
        }

        inst.start();
        MyDataModelTest test = new MyDataModelTest(inst.getAPI(), new SimpleTerminal());
        test.start();
        inst.stop();
    }
}
