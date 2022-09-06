package com.example.nssbhavans;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import java.util.Objects;


import static android.content.Context.MODE_PRIVATE;

public class ProfileFragment extends Fragment {

TextView logout;
TextView name;
TextView phn;
TextView mail;
ImageView imageView;
ImageView notifi;
ImageView about;
ImageView activity;

    @Override
    public void onStart() {
        super.onStart();
        name.setText(Prevalent.currentOnlineUser.getName());
        phn.setText(Prevalent.currentOnlineUser.getPhone());
        mail.setText(Prevalent.currentOnlineUser.getMail());

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_profile, container, false);
       logout=view.findViewById(R.id.logout);
       name=view.findViewById(R.id.userProfileName);
       phn=view.findViewById(R.id.userProfileNumber);
       notifi=view.findViewById(R.id.editProfile);
       notifi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent user=new Intent(getActivity(),UsersDataActivity.class);
               startActivity(user);
           }
       });
       mail=view.findViewById(R.id.userProfileAddressText);
       imageView=view.findViewById(R.id.userProfileImage);
       activity=view.findViewById(R.id.activities);
       activity.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent1=new Intent(getActivity(),NssActivities.class);
               startActivity(intent1);
           }
       });
       about=view.findViewById(R.id.about);
       about.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent1=new Intent(getActivity(),Aboutactivity.class);
               startActivity(intent1);
           }
       });


       logout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent=new Intent(getActivity(),LoginActivity.class);
               intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |Intent.FLAG_ACTIVITY_CLEAR_TASK );
               startActivity(intent);
               requireActivity().finish();

           }
       });
        return view;

    }


        }
