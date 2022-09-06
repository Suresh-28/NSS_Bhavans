package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class BloodDriveActivity extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;
/*replace with blood*/
    int[] IMAGES={
            R.drawable.vaccine5,
            R.drawable.vaccine4,
            R.drawable.vaccine3,
            R.drawable.vaccine2,
            R.drawable.vaccine1

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_drive);
        adapterViewFlipper=findViewById(R.id.adapterViewFlipper);
        CustomAdapter1 customAdapter=new CustomAdapter1(getApplicationContext(), IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}