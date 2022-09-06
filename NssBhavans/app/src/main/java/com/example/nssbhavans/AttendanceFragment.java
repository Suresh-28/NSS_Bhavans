package com.example.nssbhavans;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AttendanceFragment extends Fragment {

    TextView logistics;
    TextView finearts;
    TextView cultural;
    TextView photography;
    TextView documentation;
    TextView digital;
    TextView publicrelations;
    TextView reportwriting;
    TextView literature;
    TextView sports;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attendance, container, false);
        finearts=view.findViewById(R.id.finearts);


        finearts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getActivity(),FineArtsActivity.class);
                startActivity(intent1);
            }
        });
        cultural=view.findViewById(R.id.cultural);
        cultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getActivity(),CulturalActivity.class);
                startActivity(intent2);
            }
        });
        photography=view.findViewById(R.id.photography);
        photography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getActivity(),PhotographActivity.class);
                startActivity(intent3);
            }
        });
        documentation=view.findViewById(R.id.documentation);
        documentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(getActivity(),DocumentationActivity.class);
                startActivity(intent4);
            }
        });
        digital=view.findViewById(R.id.digital);
        digital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(getActivity(),DigitalActivity.class);
                startActivity(intent5);
            }
        });
        publicrelations=view.findViewById(R.id.publicrelations);
        publicrelations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(getActivity(),PublicrelarionActivity.class);
                startActivity(intent6);
            }
        });
        reportwriting=view.findViewById(R.id.reportwriting);
        reportwriting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(getActivity(),ReportActivity.class);
                startActivity(intent7);
            }
        });
        literature=view.findViewById(R.id.literature);
        literature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(getActivity(),LiteratureActivity.class);
                startActivity(intent8);
            }
        });
        sports=view.findViewById(R.id.sports);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(getActivity(),SportsActivity.class);
                startActivity(intent9);
            }
        });
        logistics=view.findViewById(R.id.logistics);
        logistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),LogisticActivity.class);
                startActivity(intent);
            }
        });




        return view;
    }


    }
