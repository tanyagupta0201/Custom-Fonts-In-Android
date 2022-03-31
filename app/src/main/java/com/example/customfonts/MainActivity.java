package com.example.customfonts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView hindi, english, turkish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        hindi = findViewById(R.id.tvHindi);
        turkish = findViewById(R.id.tvTurkish);
        english = findViewById(R.id.tvEnglish);

        // name of Typeface and text View should be different, otherwise error will pop up
        Typeface hindiFont = Typeface.createFromAsset(getAssets(), "fonts/hindi.TTF");
        hindi.setTypeface(hindiFont);

        Typeface turkishFont = Typeface.createFromAsset(getAssets(), "fonts/turkish.ttf");
        turkish.setTypeface(turkishFont);

        Typeface englishFont = Typeface.createFromAsset(getAssets(), "fonts/english.ttf");
        english.setTypeface(englishFont);

        /*
             To use custom font in recycler view write this code in Adaptor in onbindViewHolder aur
             getAssets in context use karna hai
         */
    }
}