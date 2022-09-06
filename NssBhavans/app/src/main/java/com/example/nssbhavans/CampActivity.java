package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CampActivity extends AppCompatActivity {
 ImageView camp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camp);
        camp=findViewById(R.id.camp);
        camp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CampActivity.this,SpecialCampActivity.class);
                startActivity(intent);
            }
        });
    }
}