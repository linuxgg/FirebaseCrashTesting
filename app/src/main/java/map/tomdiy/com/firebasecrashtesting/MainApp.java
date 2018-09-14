package map.tomdiy.com.firebasecrashtesting;

import android.app.Application;
import android.util.Log;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

public class MainApp extends Application {
    @Override
    public void onCreate() {

        Fabric.with(this, new Crashlytics());
        Log.d("start", "start from here");
        super.onCreate();
    }
}
