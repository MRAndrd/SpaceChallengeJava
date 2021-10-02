package com.example.spacechallengejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView U1TextView;
    TextView U2TextView;
    public int totalBudgetU1 = 0;
    public int totalBudgetU2 = 0;
    Simulation mainSimulation = new Simulation();
    private Object Simulation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        U1TextView = (TextView) findViewById(R.id.U1TextView);
        U2TextView = (TextView) findViewById(R.id.U2TextView);
        Button button = findViewById(R.id.launchButton);
        button.setOnClickListener((View.OnClickListener) this);
    }
// не так
   // public void onClick(View view) {
       //mainSimulation.getClass(Simulation);
  //  }
}