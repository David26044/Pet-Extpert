package co.edu.unipiloto.petexpert;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import co.edu.unipiloto.petexpert.BeerExpert;
import co.edu.unipiloto.petexpert.PetExpert;

public class MainActivity extends AppCompatActivity {

    private BeerExpert beerExpert = new BeerExpert();
    private PetExpert petExpert = new PetExpert();

    private Spinner spinnerCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerCategory = findViewById(R.id.spinner_category);
    }

    // 🔹 Beer Adviser
    public void onClickFindBeer(View view) {
        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.beer_color);

        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandList = beerExpert.getBrands(beerType);

        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandList) {
            brandsFormatted.append(brand).append("\n");
        }
        brands.setText(brandsFormatted.toString());
    }

    // 🔹 Pet Adviser
    public void onClickShowSelection(View view) {
        TextView result = findViewById(R.id.result);
        String category = spinnerCategory.getSelectedItem().toString();

        List<String> breeds = petExpert.getBreeds(category);

        StringBuilder breedsFormatted = new StringBuilder();
        for (String breed : breeds) {
            breedsFormatted.append(breed).append("\n");
        }
        result.setText(breedsFormatted.toString());
    }
}
