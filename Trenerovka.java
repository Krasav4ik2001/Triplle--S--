package com.example.sprot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trenerovka extends AppCompatActivity {

public Button denn1,denn2,denn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trenerovka);
        denn3=(Button)findViewById(R.id.button6);
        denn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openden3();
            }
        });
        denn2=(Button)findViewById(R.id.button5);
        denn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openden2();
            }
        });
        denn1=(Button)findViewById(R.id.button4);
        denn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openden1();
            }
        }

        );
    }
    void openden1(){
        Intent intent1=new Intent(this,den1.class);
        startActivity(intent1);
    }
    void openden2(){
        Intent intent2=new Intent(this,den2.class);
        startActivity(intent2);
    }
    void openden3(){
        Intent intent3=new Intent(this,den3.class);
        startActivity(intent3);

    }
}