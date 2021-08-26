package com.androidapp.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class playerSetup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);

        player1 = findViewById(R.id.player1Name);
        player2 = findViewById(R.id.player2Name);
    }

    public void submitButtonClick(View v){
        String palyer1Name = player1.getText().toString();
        String palyer2Name = player2.getText().toString();

        Intent intent = new Intent(this, GameDisplay.class);
        intent.putExtra("PLAYERS_NAMES", new String[]{palyer1Name, palyer2Name});
        startActivity(intent);
    }
}