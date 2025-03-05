import java.util.Random;

public class PetServise {
    Cat[] cats;
    Dog[] dogs;

    public PetServise(Cat cats[]) {
        this.cats = cats;
    }

    public PetServise(Dog dogs[]) {
        this.dogs = dogs;
    }

    Cat findCatById(int id) {
        for (int i = 0; i < cats.length; i++) {
            Cat currentCat = cats[i];
            if (currentCat.id == id) {
                System.out.println("Cat by id " + id + ":");
                return currentCat;
            }
        }
        return null;
    }

    Dog findDogById(int id) {
        for (int i = 0; i < dogs.length; i++) {
            Dog currentDog = dogs[i];
            if (currentDog.id == id) ;
            System.out.println("Dog by id " + id + ": ");
            return currentDog;
        }
        return null;
    }

    Cat removeCatById(int id) {
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].id == id) {
                Cat removedCat = cats[i];
                Cat[] newCats = new Cat[cats.length - 1];
                for (int j = 0; j < i; j++) {
                    newCats[j] = cats[j];
                }
                for (int j = i + 1; j < cats.length; j++) {
                    newCats[j - 1] = cats[j];
                }
                cats = newCats;
                System.out.println("Cat with id " + id + " removed ");
                return removedCat;
            }
        }
        System.out.println("Cat with id " + id + " not found ");
        return null;
    }

    Dog removeDogById(int id) {
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].id == id) {
                Dog removedDog = dogs[i];
                Dog[] newDogs = new Dog[dogs.length - 1];
                for (int j = 0; j < i; i++) {
                    newDogs[j] = dogs[j];
                }
                for (int j = i + 1; j < dogs.length; j++) {
                    newDogs[j - 1] = dogs[j];
                }
                dogs = newDogs;
                System.out.println("Dog with id " + id + " removed ");
                return removedDog;
            }
        }
        System.out.println("Dog with id " + id + " not found ");
        return null;
    }


    Cat randomCat() {
        if (cats.length == 0) {
            System.out.println("No cats");
            return null;
        }
        Random random = new Random();
        int randomCat = random.nextInt(cats.length);
        System.out.println("Random cat - " + cats[randomCat].name);
        return cats[randomCat];
    }

    Dog randomDog() {
        if (dogs.length == 0) {
            System.out.println("No dogs");
            return null;
        }
        Random random = new Random();
        int randomDog = random.nextInt(dogs.length);
        System.out.println("Random dog - " + dogs[randomDog].name);
        return dogs[randomDog];
    }


}
