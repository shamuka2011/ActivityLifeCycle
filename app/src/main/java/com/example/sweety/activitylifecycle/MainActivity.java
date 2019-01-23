package com.example.sweety.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button button ;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        System.out.println("activity is loaded");
        System.out.println("oncreate method is called");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Secondactivity.class);
                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onstart method is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("activity is in running state");
        System.out.println("onresume method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("another activity comes into foreground");
        System.out.println("onpause method is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("activity is no longer visible");
        System.out.println("onstop method is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("called after onstop when user navigates to the activity");
        System.out.println("onRestart method is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("ondestroy method is called");
        System.out.println("the activity is finishing or being destroyed by the system");
    }
}
