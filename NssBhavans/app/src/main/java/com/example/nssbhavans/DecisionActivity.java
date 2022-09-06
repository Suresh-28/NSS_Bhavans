package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DecisionActivity extends AppCompatActivity {
Button skp;
Button join;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision);
        skp=findViewById(R.id.skip);
        skp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DecisionActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        join=findViewById(R.id.join);
        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScJTk7q8e1oTT_BFiXUZwb2jsIicYqBzaRCWb3e9KTxB5OM6w/viewform?usp=sf_link");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }
}