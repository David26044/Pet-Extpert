package co.edu.unipiloto.petexpert;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();

        switch (color) {
            case "Clara":
                brands.add("Corona");
                brands.add("Águila Light");
                break;
            case "Ámbar":
                brands.add("Poker");
                brands.add("Club Colombia");
                break;
            case "Oscura":
                brands.add("BBC Stout");
                brands.add("Andes Negra");
                break;
            case "Rubia":
                brands.add("Heineken");
                brands.add("Stella Artois");
                break;
            default:
                brands.add("No hay cervezas para este color");
                break;
        }
        return brands;
    }
}

