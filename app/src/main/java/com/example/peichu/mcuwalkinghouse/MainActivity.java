package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String test="test";
String test2="test2";


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
    public void gotolandlord(View v){
        Intent it=new Intent(this,Only_landlord.class);
        startActivity(it);
    }
    public void gotomain_stu(View v) {
        EditText name = (EditText) findViewById(R.id.regstu_name);
        TextView txv = (TextView)findViewById(R.id.main_hi);
        txv.setText("Hi!"+name.getText().toString());
    }
}
