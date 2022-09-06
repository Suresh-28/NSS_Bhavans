package com.example.nssbhavans;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Aboutactivity extends AppCompatActivity {
    ImageView fb;
    ImageView yt;
    ImageView insta;
    ImageView twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutactivity);
        fb=findViewById(R.id.fb);
        yt=findViewById(R.id.yt);
        insta=findViewById(R.id.insta);
        twitter=findViewById(R.id.twitter);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri1=Uri.parse("https://www.facebook.com/Nss-Bhavans-104176535471869/");
                Intent intent1=new Intent(Intent.ACTION_VIEW,uri1);
                startActivity(intent1);
            }
        });
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri2=Uri.parse("https://youtube.com/channel/UCpepSzZJA6b-d03tlnEzn5g");
                Intent intent2=new Intent(Intent.ACTION_VIEW,uri2);
                startActivity(intent2);
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri3=Uri.parse("https://instagram.com/nss_bhavans?utm_medium=copy_link");
                Intent intent3=new Intent(Intent.ACTION_VIEW,uri3);
                startActivity(intent3);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri4=Uri.parse("https://twitter.com/NssBhavans?t=yrvr2GV4UJCYWyAxiwjzhQ&s=08");
                Intent intent4=new Intent(Intent.ACTION_VIEW,uri4);
                startActivity(intent4);
            }
        });
    }
}