package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class FireSafetyActivity extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES={
            R.drawable.fire1,
            R.drawable.fire2,
            R.drawable.fire3,
            R.drawable.fire4,
            R.drawable.fire5

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_safety);
        adapterViewFlipper=findViewById(R.id.adapterViewFlipper);
        CustomAdapter1 customAdapter=new CustomAdapter1(getApplicationContext(), IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}