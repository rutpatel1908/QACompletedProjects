package FileReadingProject;

/**
 * Created by Profile on 12/05/2017.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    List<Person> persons = new ArrayList<Person>();
    List<Person>personread=new ArrayList<Person>();

    public void addPerson(Person p){

        persons.add(p);

    }

    public List<Person> getPersons(){
        return persons;
    }


    public static void main(String [] args){

        FileReader persons = new FileReader();
        persons.addPerson(new Person("John Clark","Java Developer",35));
        persons.addPerson(new Person("Stuart Johnson","Scala Developer",32));
        persons.addPerson(new Person("Anna Smith","Automation Tester",37));
        persons.addPerson(new Person("Steave Arnold","DevOps Engineer",39));

        persons.writeToFile(persons.persons,"dataset.ser");

        persons.readFromFile("dataset.ser");

    }

    public void writeToFile(List<Person> persons,String fileName){

        try{
            FileOutputStream saveFile=new FileOutputStream(fileName);
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            save.writeObject(persons);
            save.close();
        }catch(Exception exc){
            exc.printStackTrace();
        }

        System.out.println("Data written to file");

    }

    public void readFromFile(String fileName){

        try{
            FileInputStream readFile = new FileInputStream(fileName);
            ObjectInputStream read = new ObjectInputStream(readFile);
            personread =(List<Person>) read.readObject();
            read.close();
            System.out.println("Data printed from file");
        }catch(Exception exc){
            exc.printStackTrace();
        }

        for(Person p: personread){
            System.out.println(p);
        }

    }
}
