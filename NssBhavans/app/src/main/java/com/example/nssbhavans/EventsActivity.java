package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class EventsActivity extends AppCompatActivity {
ScrollView scrollView;
    ImageView bathukamma,greenweek,constitution,oreintation,firesafety,farmer,naac,republic,orphange,ugc,poshan,cycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        scrollView=findViewById(R.id.scroll);
        scrollView.fullScroll(View.FOCUS_DOWN);
        scrollView.setSmoothScrollingEnabled(true);
        bathukamma=findViewById(R.id.bathukamma);
        greenweek=findViewById(R.id.greenweek);
        constitution=findViewById(R.id.constitution);
        oreintation=findViewById(R.id.orientation);
        firesafety=findViewById(R.id.firesafety);
        farmer=findViewById(R.id.farmer);
        naac=findViewById(R.id.naac);
        republic=findViewById(R.id.republic);
        orphange=findViewById(R.id.orphange);
        ugc=findViewById(R.id.ugc);
        poshan=findViewById(R.id.poshan);
        cycle=findViewById(R.id.cycle);
        bathukamma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(EventsActivity.this,BathukammaActivity.class);
                startActivity(intent1);
            }
        });
        greenweek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(EventsActivity.this,GreenWeekActivity.class);
                startActivity(intent1);
            }
        });
        constitution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(EventsActivity.this,ConstitutionDayActivity.class);
                startActivity(intent2);
            }
        });
        oreintation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(EventsActivity.this,OrientationDayActivity.class);
                startActivity(intent3);
            }
        });
        firesafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(EventsActivity.this,FireSafetyActivity.class);
                startActivity(intent4);
            }
        });
        farmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(EventsActivity.this, FarmerDayActivity.class );
                startActivity(intent5);
            }
        });
        naac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(EventsActivity.this,NaacActivity.class);
                startActivity(intent6);
            }
        });
        republic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(EventsActivity.this,RepublicDayActivity.class);
                startActivity(intent7);
            }
        });
        orphange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(EventsActivity.this,OrphanVisitActivity.class);
                startActivity(intent8);
            }
        });
        ugc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(EventsActivity.this,UgcExpertCommitte.class);
                startActivity(intent9);
            }
        });
        poshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(EventsActivity.this,PoshanPhakwada.class);
                startActivity(intent10);
            }
        });
        cycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11=new Intent(EventsActivity.this,CycleAndNutritionActivity.class);
                startActivity(intent11);
            }
        });
    }
}