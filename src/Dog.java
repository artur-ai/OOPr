public class Dog extends Pet {
    void voice(){
        System.out.println("Gaavvv");
    }

    String Protection;
    String Cooperation;

    PetFactory petFactory = new PetFactory();
    Dog[] dogs = petFactory.getDogs();
    PetServiсe petServise = new PetServiсe(dogs);
    Dog dog = petServise.findDogById(1);


    Dog dog1 = petServise.removeDogById(1);
    Dog dog2 = petServise.randomDog();

    public static void print(Dog pet) {
        System.out.print(" name: " + pet.name + ";");
        System.out.print(" breed: " + pet.breed + ";");
        System.out.print(" age: " + pet.age + ";");
        System.out.println(" color: " + pet.color + ";");
    }
}
