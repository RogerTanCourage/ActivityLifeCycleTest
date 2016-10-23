package com.example.kttan.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static  final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        final Button startDialogActiviyy = (Button) findViewById(R.id.start_dialog_activity);

        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialogActiviyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ondestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onrestart");
    }
}
