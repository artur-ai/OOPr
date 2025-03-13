public class Cat extends Pet {
    void voice(){
        System.out.println("Мяяяууу");
    }
    String Jumpiness;
    String night_vision;
    String Manipulating_people;

    public Cat(int id, int age, double weight, String name){
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.name = name;
    }



    PetFactory petFactory = new PetFactory();
    Cat[] cats = petFactory.getCats();

    PetServiсe petServise = new PetServiсe(cats);

    Cat cat = petServise.findCatById(1);

    Cat cat1 = petServise.removeCatById(2);
    Cat cat2 = petServise.randomCat();




    public static void print(Cat pet) {
        System.out.print(" name: " + pet.name + ";");
        System.out.print(" breed: " + pet.breed + ";");
        System.out.print(" age:" + pet.age + ";");
        System.out.println(" color: " + pet.color + ";");
    }
}
