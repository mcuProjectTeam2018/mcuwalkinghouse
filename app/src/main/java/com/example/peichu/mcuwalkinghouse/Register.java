package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }
       public void gobackmain(View v) {
       finish();
    }
    public void gotoreg_stu(View v){
        Intent it=new Intent(this,reg_student.class);
        startActivity(it);
    }
    public void gotoreg_land(View v){
        Intent it=new Intent(this,reg_landlord.class);
        startActivity(it);
    }
    public void reg_login(View v){
        Intent it=new Intent(this,Login.class);
        startActivity(it);
    }
    }

