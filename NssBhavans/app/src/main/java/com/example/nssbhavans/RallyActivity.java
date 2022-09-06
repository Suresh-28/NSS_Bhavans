package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RallyActivity extends AppCompatActivity {
 ImageView aids,orange,diabetes,malaria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rally);
        aids=findViewById(R.id.aids);
        orange=findViewById(R.id.orange);
        diabetes=findViewById(R.id.diabetes);
        malaria=findViewById(R.id.malaria);
        aids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(RallyActivity.this,AidsRallyActivity.class);
                startActivity(intent1);
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(RallyActivity.this,OrangeRallyActivity.class);
                startActivity(intent2);
            }
        });
        diabetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(RallyActivity.this,DiabetesrallyActivity.class);
                startActivity(intent3);
            }
        });
                malaria.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent4=new Intent(RallyActivity.this,MalariarallyActivity.class);
                        startActivity(intent4);
                    }
                });
    }
}