package com.example.two_activites_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Credits_Screen extends AppCompatActivity {
Intent getcred;
Intent back;
TextView text;
int finalresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits__screen);
        getcred = getIntent();
        back = new Intent(this,MainActivity.class);
        text = findViewById(R.id.textView2);
        finalresult = getcred.getIntExtra("finalresult",0);
        text.setText(Integer.toString(finalresult));
    }


    public void back(View view) {
        back.putExtra("sameresult", finalresult);
        startActivity(back);


    }
}