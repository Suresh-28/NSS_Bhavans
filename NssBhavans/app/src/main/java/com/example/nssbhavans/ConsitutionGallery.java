package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ConsitutionGallery extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consitution_gallery);


        gridView=(GridView)findViewById(R.id.grid_view);
        gridView.setAdapter(new ImageAdapterconstitution(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent intent=new Intent(getApplicationContext(),FullscreenActivity.class);
                intent.putExtra("id",position);
                startActivity(intent);
            }
        });
    }
}