package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Find_house extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_house);
    }


    public void onclick(View v){
        Intent it=new Intent(Intent.ACTION_VIEW);//建立intent並指定預設動作
        switch(v.getId())//讀取按鈕的id來做不同相關處理 // v等同於第一行的v
        {
            case R.id.btn_gps:
                it.setData(Uri.parse("geo:25.08722,121.52694"));
                break;



        }
        startActivity(it);


    }

}
