package com.example.johanolsson.testcal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.Objects;

import static com.example.johanolsson.testcal.R.id.button0;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Add all the buttons
        Button button0 = (Button) findViewById(button0);
        button0.setOnClickListener(this);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonComma = (Button) findViewById(R.id.buttonComma);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        Button buttonMulti = (Button) findViewById(R.id.buttonMulti);
        Button buttonDel = (Button) findViewById(R.id.buttonDel);

        //Add the editText box
        EditText numfield = (EditText) findViewById(R.id.numField);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

        }


    }

}

