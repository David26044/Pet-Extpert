package co.edu.unipiloto.petexpert;

import java.util.ArrayList;
import java.util.List;

public class PetExpert {

    public List<String> getBreeds(String category) {
        List<String> breeds = new ArrayList<>();

        switch (category) {
            case "Terriers":
                breeds.add("Jack Russell Terrier");
                breeds.add("Bull Terrier");
                breeds.add("Airedale Terrier");
                breeds.add("Yorkshire Terrier");
                break;
            case "Cazadores":
                breeds.add("Golden Retriever");
                breeds.add("Labrador Retriever");
                breeds.add("Pointer");
                breeds.add("Beagle");
                break;
            case "Mastines":
                breeds.add("Gran Danés");
                breeds.add("Bóxer");
                breeds.add("Dogo de Burdeos");
                breeds.add("San Bernardo");
                break;
            default:
                breeds.add("No hay razas para esta categoría");
                break;
        }
        return breeds;
    }
}