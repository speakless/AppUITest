package org.speakless.test;

import org.apache.cordova.DroidGap; 

import android.app.Activity;
import android.os.Bundle;

public class AppUITest extends DroidGap
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.loadUrl("file:///android_asset/www/index.html", 10000);
    }
}
