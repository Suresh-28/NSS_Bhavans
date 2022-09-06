package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DriveActivity extends AppCompatActivity {
ImageView blood,vaccine,blanket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);
        blood=findViewById(R.id.blooddonation);
        vaccine=findViewById(R.id.vaccination);
        blanket=findViewById(R.id.vaccinedrive);
        blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(DriveActivity.this,BloodDriveActivity.class);
                startActivity(intent1);
            }
        });
        vaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(DriveActivity.this,VaccineDriveActivity.class);
                startActivity(intent2);
            }
        });
        blanket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(DriveActivity.this,BlanketDriveActivity.class);
                startActivity(intent3);
            }
        });
    }
}