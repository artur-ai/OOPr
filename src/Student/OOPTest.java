package Student;

public class OOPTest {
    public static void main(String[] args) {
        NAU nauStudent = new NAU();
        Student student = nauStudent;
        Person person = nauStudent;
        if (person instanceof NAU){
            nauStudent = (NAU) person;
        }
    }
}
