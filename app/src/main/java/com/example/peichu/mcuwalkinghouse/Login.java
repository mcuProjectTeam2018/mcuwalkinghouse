package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void gotomain(View v)//按下登入鈕跳至主畫面瀏覽
    {
        Intent it=new Intent(this,MainActivity.class);
        startActivity(it);
    }

    public void gotoreg(View v)//按下註冊鈕跳至註冊畫面
    {
        Intent it=new Intent(this,Register.class);
        startActivity(it);
    }

}
