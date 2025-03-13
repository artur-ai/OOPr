public class Test {
    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();
        Cat[] cats = petFactory.getCats();
        PetServiсe petServiсe = new PetServiсe(cats);


        Cat cat = new Cat(5, 4, 3.6, "Kit");
        cat.sleep();


    }
}
