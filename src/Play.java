import dk.simonbojesen.learnedma.generated.valuedomains.Animal;
import dk.simonbojesen.learnedma.generated.valuedomains.Person;
import dk.simonbojesen.learnedma.generated.valuedomains.WetsuitSizeList;
import org.abstractica.edma.valuedomains.userinput.SimpleTerminal;

public class Play {
    public static void main(String[] args) {
        /*Person person = Person.create().firstName("Simon").noMiddleName().lastName("Bojesen").email("simon@schonberg.dk").phoneNumber("51197747");
        System.out.println("Persons name is: " + person.firstName() + " " + person.lastName());
        System.out.println("Persons email is: " + person.email());
        System.out.println("Persons phone number is: " + person.phoneNumber());

        Person person1 = Person.fromTerminal(new SimpleTerminal());
        System.out.println(person1);*/

        /*WetsuitSizeList mylist = WetsuitSizeList.begin()
                .add("XS")
                .add("L")
                .add("XL")
                .end();
        System.out.println(mylist);*/

        Animal animal = Animal.fromTerminal(new SimpleTerminal());
        System.out.println(animal);

    }
}
