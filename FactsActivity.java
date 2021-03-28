package com.example.diamondapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FactsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_rdm_fct;

    TextView tv_fact;
    private RandomFacts fact= new RandomFacts();

    private int numberOfFacts = fact.facts.length;
    private int currentFact = 0;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        btn_rdm_fct = (Button)findViewById(R.id.btn_rdm_fct);
        btn_rdm_fct.setOnClickListener(this);

        tv_fact = (TextView)findViewById(R.id.tv_fact);
        //NextQuestion(currentFact++);

        random = new Random();
        NextFact(random.nextInt(numberOfFacts));

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_facts){
            NextFact(random.nextInt(numberOfFacts));
        }
    }


    private void NextFact(int num){
            tv_fact.setText(fact.getFact(num));

        }
}