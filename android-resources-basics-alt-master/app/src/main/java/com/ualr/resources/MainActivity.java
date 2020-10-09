package com.ualr.resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import com.ualr.resources.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;



// TODO 3: Define the alternative resources needed to have different content and look n feel depending on the device language.
// TODO 4: Get the description string value from resources
// TODO 5: Initialize the text property of the TextView element with the "country_description_text" id by using the value retrieved in the previous TODO point

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivityMainBinding binding=ActivityMainBinding.inflate(getLayoutInflater());
       setContentView(R.layout.activity_main);
        Resources res=this.getResources();

        binding.countryDescriptionText.setText(res.getText(R.string.country_description).toString());
        binding.lessonLearntButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {


            }
        });

    }

}
