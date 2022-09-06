package com.example.nssbhavans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NotificationActivtiy extends AppCompatActivity {
EditText tit, dis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_activtiy);
        tit=findViewById(R.id.title);
        dis=findViewById(R.id.desc);
        findViewById(R.id.btnShowNotification).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title1=tit.getText().toString();
                String desc1=dis.getText().toString();
                showNotification(title1,desc1);
            }
        });
    }

    private void showNotification(String title1, String desc1) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("n", "n", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);

            NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "n")
                    .setContentTitle(title1)
                    .setContentText(desc1)
                    .setSmallIcon(R.drawable.logo)
                    .setAutoCancel(true);

            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);

            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound);
            mediaPlayer.start();


            PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                    new Intent(this, NotificationActivtiy.class), PendingIntent.FLAG_UPDATE_CURRENT);

            builder.setContentIntent(contentIntent);



            managerCompat.notify(999, builder.build());
        }
    }
}