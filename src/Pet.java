public class Pet {
    int id;
    int age;
    double weight;
    String name;
    String color;
    String breed;
    boolean hungry;


    void play() {
        System.out.println("Pet is playing");
        weight -= 0.5;
        hungry = true;
    }

    void eat() {
        System.out.println("Pet is fed");
        weight += 0.5;
        hungry = false;
    }

    void sleep() {
        System.out.println("Pet is sleep");
    }
}
