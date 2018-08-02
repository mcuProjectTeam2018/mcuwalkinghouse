package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
    }
    public void gotoup(View v)//按下開始上傳房屋
    {
        Intent it=new Intent(this,only_ld_upload.class);
        startActivity(it);
    }
}
