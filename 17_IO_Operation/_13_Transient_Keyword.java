import java.io.*;

class Person implements Serializable {
    private String name;
    private transient String password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        // do not write the password to the stream
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        // set password to null since it was not written to the stream
        password = null;
    }
}

public class _13_Transient_Keyword {

    public static void main(String[] args) {
        // create a Person object
        Person person = new Person("Alice", "secret");

        // serialize the object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Hey/hey.txt"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Hey/hey.txt"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Password: " + deserializedPerson.getPassword());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
