package com.example.notification;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;

public class ChannelClass extends Application {
    public static final String ChannelId = "ChannelId";

    @Override
    public void onCreate() {
        super.onCreate();
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    ChannelId,"notificationChannel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            NotificationManager notificationManager=getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
    }


    }
}
