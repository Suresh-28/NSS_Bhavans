package com.example.nssbhavans;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static android.content.Context.MODE_PRIVATE;

public class EventFragment extends Fragment {

Button events,rallys,drives,camps;
Button visit;

    public EventFragment(MainActivity mainActivity) {

    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event, container, false);
        Log.d("mylog", "Oncreate");

events=view.findViewById(R.id.event);
visit=view.findViewById(R.id.visit);
rallys=view.findViewById(R.id.rally);
drives=view.findViewById(R.id.drive);
camps=view.findViewById(R.id.camp);
events.setOnClickListener(new View.OnClickListener() {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
       Intent intent=new Intent( getActivity(), EventsActivity.class);

        View sharedView= events;
        String transitionNane=getString(R.string.events);
        ActivityOptions transiction= ActivityOptions.makeSceneTransitionAnimation(getActivity(),sharedView,transitionNane);

        startActivity(intent,transiction.toBundle());
    }
});
rallys.setOnClickListener(new View.OnClickListener() {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        Intent intent2=new Intent(getActivity(),RallyActivity.class);
        View sharedView2= rallys;
        String transitionNane2=getString(R.string.rally);
        ActivityOptions transiction2= ActivityOptions.makeSceneTransitionAnimation(getActivity(),sharedView2,transitionNane2);

        startActivity(intent2,transiction2.toBundle());
    }
});drives.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getActivity(),DriveActivity.class);
                View sharedView3= drives;
                String transitionNane3=getString(R.string.drive);
                ActivityOptions transiction3= ActivityOptions.makeSceneTransitionAnimation(getActivity(),sharedView3,transitionNane3);

                startActivity(intent3,transiction3.toBundle());
            }
        });
camps.setOnClickListener(new View.OnClickListener() {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        Intent intent4=new Intent(getActivity(),CampActivity.class);
        View sharedView4= camps;
        String transitionNane4=getString(R.string.camp);
        ActivityOptions transiction4= ActivityOptions.makeSceneTransitionAnimation(getActivity(),sharedView4,transitionNane4);

        startActivity(intent4,transiction4.toBundle());
    }
});
visit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Uri uri=Uri.parse("https://bhavansvc.ac.in/NSS.html");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
});



        return view;

    }



    @Override
    public void onResume() {
        super.onResume();
        Log.d("mylog", "Onresume");

    }

    public interface ClickListenerEvent {

    }
}
