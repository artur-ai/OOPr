public class PetFactory {
    Cat[] getCats() {
        Cat miki = new Cat();
        miki.age = 1;
        miki.id = 1;
        miki.name = "Miki";
        miki.color = "Grey";
        miki.weight = 1.4;
        miki.breed = "Alley cat";
        miki.eat();
        print(miki);

        Cat melisa = new Cat();
        melisa.weight = 4.2;
        melisa.breed = "British Shorthair";
        melisa.name = "Melisa";
        melisa.id = 2;
        melisa.age = 7;
        melisa.color = "White";
        melisa.play();
        print(melisa);

        Cat casper = new Cat();
        casper.name = "Casper";
        casper.breed = "American bobtail";
        casper.weight = 4.1;
        casper.id = 3;
        casper.age = 9;
        casper.color = "grey";
        casper.sleep();
        print(casper);

        Cat bonya = new Cat();
        bonya.name = "Bonya";
        bonya.color = "White";
        bonya.weight = 4.5;
        bonya.breed = "Persian cat";
        bonya.id = 4;
        bonya.age = 7;
        bonya.eat();
        print(bonya);

        Cat[] cats = {miki, melisa, casper, bonya};
        return cats;
    }

    Dog[] getDogs() {
        Dog lui = new Dog();
        lui.age = 4;
        lui.breed = "french bulldog";
        lui.id = 1;
        lui.color = "White and Balck";
        lui.name = "Lui";
        lui.weight = 7;
        lui.sleep();
        print(lui);

        Dog jack = new Dog();
        jack.name = "Jack";
        jack.weight = 6.3;
        jack.id = 2;
        jack.age = 5;
        jack.breed = "shepherd";
        jack.color = "Brown";
        jack.eat();
        print(jack);

        Dog archi = new Dog();
        archi.name = "Archi";
        archi.weight = 3.1;
        archi.id = 3;
        archi.age = 2;
        archi.breed = "spaniel";
        archi.color = "Gold";
        archi.play();

        Dog[] dogs = {lui, jack, archi};
        return dogs;

    }

    public static void print(Dog pet) {
        System.out.println("This is a dog");
        System.out.print(" id: " + pet.id + ";");
        System.out.print(" name: " + pet.name + ";");
        System.out.print(" weight: " + pet.weight + ";");
        System.out.print(" breed: " + pet.breed + ";");
        System.out.print(" age: " + pet.age + ";");
        System.out.println(" color: " + pet.color + ";");
    }

    public static void print(Cat pet) {
        System.out.println("This is a cat");
        System.out.print(" id: " + pet.id + ";");
        System.out.print(" name: " + pet.name + ";");
        System.out.print(" weight: " + pet.weight + ";");
        System.out.print(" breed: " + pet.breed + ";");
        System.out.print(" age:" + pet.age + ";");
        System.out.println(" color:" + pet.color + ";");
    }
}
