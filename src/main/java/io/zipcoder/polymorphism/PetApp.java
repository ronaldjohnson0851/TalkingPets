package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetApp {
    private int petCount;
    private List<String> petNames = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();

    public int getPetCount() {
        return petCount;
    }

    public <T> List<String> getPetNames() {
        return petNames;
    }

    public void collectPetData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int petCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < petCount; i++) {
            System.out.println("What kind of pet is pet #" + (i + 1) + "?");
            String petType = scanner.nextLine();
            System.out.println("What is the name of your " + petType + "?");
            String petName = scanner.nextLine();

            Pet pet;
            switch (petType.toLowerCase()) {
                case "dog":
                    pet = new Dog(petName);
                    break;
                case "cat":
                    pet = new Cat(petName);
                    break;
                case "bird":
                    pet = new Snake(petName);
                    break;
                default:
                    pet = new Pet(petName);
                    break;
            }
            pets.add(pet);
        }
    }


    public void displayPets() {
        System.out.println("Your pets:");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " says: " + pet.speak());
        }
    }


    public List<Pet> getPets(){
        return pets;
    }
}
