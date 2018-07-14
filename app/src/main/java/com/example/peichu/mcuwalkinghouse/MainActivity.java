package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
String test="test";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoRegister(View v){
        Intent it=new Intent(this,Register.class);
        startActivity(it);
    }
    public void gotologin(View v){
        Intent it=new Intent(this,Login.class);
        startActivity(it);
    }
    public void gotofind(View v){
        Intent it=new Intent(this,Find_house.class);
        startActivity(it);
    }
}
