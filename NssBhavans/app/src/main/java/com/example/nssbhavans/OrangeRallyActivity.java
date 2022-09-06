package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

public class OrangeRallyActivity extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES={
            R.drawable.orange1,
            R.drawable.orange2,
            R.drawable.orange3,
            R.drawable.orange4,
            R.drawable.orange5

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange_rally);
        adapterViewFlipper=findViewById(R.id.adapterViewFlipper);
        CustomAdapter1 customAdapter=new CustomAdapter1(getApplicationContext(), IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2000);
        adapterViewFlipper.setAutoStart(true);
    }
}