package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
    public void onClickSignIn(View v){

        Intent intent2 = new Intent(signin.this, signup.class);
        startActivity(intent2);

    }
}
