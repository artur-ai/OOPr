public class Dog extends Pet {
    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();
        Dog[] dogs = petFactory.getDogs();
        PetServise petServise = new PetServise(dogs);

        Dog dog = petServise.findDogById(1);
        print(dog);

        Dog dog1 = petServise.removeDogById(1);
        Dog dog2 = petServise.randomDog();
    }

    public static void print(Dog pet) {
        System.out.print(" name: " + pet.name + ";");
        System.out.print(" breed: " + pet.breed + ";");
        System.out.print(" age: " + pet.age + ";");
        System.out.println(" color: " + pet.color + ";");
    }
}
