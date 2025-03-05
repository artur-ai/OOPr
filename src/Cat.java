public class Cat extends Pet {
    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();
        Cat[] cats = petFactory.getCats();

        PetServise petServise = new PetServise(cats);

        Cat cat = petServise.findCatById(1);
        print(cat);

        Cat cat1 = petServise.removeCatById(2);
        Cat cat2 = petServise.randomCat();
        System.out.println("----------------------------");
    }

    public static void print(Cat pet) {
        System.out.print(" name: " + pet.name + ";");
        System.out.print(" breed: " + pet.breed + ";");
        System.out.print(" age:" + pet.age + ";");
        System.out.println(" color: " + pet.color + ";");
    }
}
