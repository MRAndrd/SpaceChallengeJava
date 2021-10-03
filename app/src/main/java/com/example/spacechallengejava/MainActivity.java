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
    Simulation mainSimulation = new Simulation(this);
    int totalBudgetU1 = 0;
    int totalBudgetU2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        U1TextView = (TextView) findViewById(R.id.U1TextView);
        U2TextView = (TextView) findViewById(R.id.U2TextView);
    }
  public void runTheSimulation(View view) throws Exception {
        //не розумію чому (mainSimulation.loadItems()) - 'loadU1(java.util.ArrayList , java.util.ArrayList )' in 'com.example.spacechallengejava.Simulation' cannot be applied to '(java.util.ArrayList )'
      totalBudgetU1 = mainSimulation.runSimulation(mainSimulation.loadU1(mainSimulation.loadItems()));
      totalBudgetU2 = mainSimulation.runSimulation(mainSimulation.loadU2(mainSimulation.loadItems()));
      U1TextView.setText(totalBudgetU1 + "millions");
      U2TextView.setText(totalBudgetU2 + "millions");
  }
}
