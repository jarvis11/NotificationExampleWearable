package com.sample.notficationexamplewearable;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;

/**
 * Created by bhaskarravi on 4/29/14.
 */
public class Notification extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
        CharSequence s = "Inside the activity of Notification one ";
        int id = 0;

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            s = "error";
        } else {
            id = extras.getInt("notificationId");
        }
        TextView t = (TextView) findViewById(R.id.text1);
        s = s + "with id = " + id;
        t.setText(s);
        NotificationManager myNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // remove the notification with the specific id
        myNotificationManager.cancel(id);
    }
}
