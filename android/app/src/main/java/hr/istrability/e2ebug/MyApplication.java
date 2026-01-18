package hr.istrability.e2ebug;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class MyApplication extends Application {

    private static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
    }

    public static PendingIntent getPendingIntentToStartView() {
        Intent intent = new Intent(applicationContext, MainActivity.class); // Replace MainActivity with your desired activity
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(
            applicationContext,
            0 /* Request code */,
            intent,
            PendingIntent.FLAG_ONE_SHOT | PendingIntent.FLAG_IMMUTABLE // FLAG_IMMUTABLE is important for Android 12+
        );
        return pendingIntent;
    }

    public static Context getMyApplicationContext() {
        return applicationContext;
    }
}