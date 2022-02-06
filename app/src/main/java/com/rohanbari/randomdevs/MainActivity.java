package com.rohanbari.randomdevs;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;

import androidx.appcompat.app.AppCompatActivity;

import com.rohanbari.randomdevs.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.fab.setOnClickListener(v -> updateName());
    }

    /**
     * Update to a random name with random text size and color properties.
     */
    void updateName() {
        Random random = new Random();

        List<String> names = Arrays.asList(
                "Annyce Davis", "Donn Felker", "Jake Wharton",
                "Jesse Wilson", "Kristin Marsicano", "Nick Butcher",
                "Philippe Breault", "Rebecca Franks", "Reto Meier",
                "Rohan Bari"
        );
        int totalSize = names.size();

        final int MIN_FONT_SIZE = 16;
        final int MAX_COLOR_CODE = 255;

        binding.textView.setText(names.get(random.nextInt(totalSize)));
        binding.textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,
                random.nextInt(36) + MIN_FONT_SIZE);
        binding.textView.setTextColor(Color.rgb(random.nextInt(MAX_COLOR_CODE),
                random.nextInt(MAX_COLOR_CODE),
                random.nextInt(MAX_COLOR_CODE)));
    }
}