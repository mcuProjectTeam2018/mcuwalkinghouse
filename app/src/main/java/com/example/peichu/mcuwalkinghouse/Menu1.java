package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
    }

    public void gotomanage(View v){//按下跳至管理房屋
        Intent it=new Intent(this,only_ld_manage.class);
        startActivity(it);
    }
    public void gotoupload(View v){//按下跳至上傳房屋
        Intent it=new Intent(this,only_ld_upload.class);
        startActivity(it);
    }
    public void gotomain_stu(View v) {//註冊填寫完姓名在main會出現名字
        EditText name = (EditText) findViewById(R.id.regstu_name);
        TextView txv = (TextView)findViewById(R.id.main_hi);
        txv.setText("Hi!"+name.getText().toString());
    }
    public void onclick(View v){//按下跳至我的收藏
        Intent it=new Intent(this,Favorite.class);
        startActivity(it);
    }

}
