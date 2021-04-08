import org.abstractica.edma.generator.EdmaGenerator;

public class Make {
    public static void main(String[] args) {
        String projectDir = "C:/Users/simon/IdeaProjects/Learn_EDMA2";
        EdmaGenerator generator = new EdmaGenerator("LearnEDMA2", projectDir + "/edmasrc", projectDir+"/src", "dk.simonbojesen.learnedma");
        generator.make();
    }
}
