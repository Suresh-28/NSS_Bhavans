package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class AidsRallyActivity extends AppCompatActivity {

    AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES={
            R.drawable.logistics,
            R.drawable.finearts,
            R.drawable.documentation,
            R.drawable.photography1,
            R.drawable.sports

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aids);
        adapterViewFlipper=findViewById(R.id.adapterViewFlipper);
        CustomAdapter1 customAdapter=new CustomAdapter1(getApplicationContext(), IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}