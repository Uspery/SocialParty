package dev.uspery.socialparty.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import dev.uspery.socialparty.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // While the app is under development you can choose what
        //  Screen will open here, all that you need to do is change
        //  the variable intent
        Class<?> intent = SplashActivity.class;
        if(intent != SplashActivity.class)
            startActivity(new Intent(this, intent));
    }
}