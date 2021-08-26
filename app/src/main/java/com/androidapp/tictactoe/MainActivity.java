package com.androidapp.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }

    public void playButtonClick(View v){

        //load up playerSetup activity when hitting click paly button on the home page
        Intent intent = new Intent(this, playerSetup.class);
        startActivity(intent);
    }
}