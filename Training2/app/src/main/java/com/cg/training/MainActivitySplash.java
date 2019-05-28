package com.example.vk.bsk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.provider.SyncStateContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.cg.training.Constants;
import com.cg.training.MainActivity;
import com.cg.training.R;

public class MainActivitySplash extends Activity {
    public Intent mIntentStartViewPager,i;
    public PreferenceManager pm;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

//                if(pm.)){
//                    i=new Intent(MainActivitySplash.this,ActivitySplashViewPager.class);
//                    pm.setFirstTimeLaunch(false);
//                }
                mIntentStartViewPager=new Intent(MainActivitySplash.this,MainActivity.class);
                startActivity(mIntentStartViewPager);
            }
        }, Constants.SPLASH_TIME);
    }
}
