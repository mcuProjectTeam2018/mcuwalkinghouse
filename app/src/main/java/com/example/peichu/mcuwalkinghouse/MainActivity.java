package com.example.peichu.mcuwalkinghouse;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity

        implements DialogInterface.OnClickListener{

        Button Login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login=(Button) findViewById(R.id.upload);
        Login.setOnClickListener((View.OnClickListener)this);//監聽按一下事件

        AlertDialog.Builder Log_Landload_Dia=new AlertDialog.Builder(this);
        Log_Landload_Dia.setMessage("此功能需要登入會員後才可使用，請點選「登入」後繼續")
        .setTitle("登入會員")//加入標題
        .setIcon(android.R.drawable.presence_audio_away)//加入圖示
        .setCancelable(true);//可按任意處返回

        Log_Landload_Dia.setPositiveButton("登入", (DialogInterface.OnClickListener) this);//加入肯定按鈕並監聽事件
        Log_Landload_Dia.setNegativeButton("取消", (DialogInterface.OnClickListener) this);//加入否定按鈕並監聽事件
        Log_Landload_Dia.show();
    }


    public void gotoitem(View v)//按下加號跳至房東注意事項
    {
        Intent it=new Intent(this,item.class);
        startActivity(it);
    }
    public void gotodetail(View v)//按下詳細跳至完整的房型資料(詳細)
    {
        Intent it=new Intent(this,Details.class);
        startActivity(it);
    }
    public void gotomenu1(View v)//按下詳細跳至完整的房型資料(詳細)
    {
        Intent it=new Intent(this,Menu1.class);
        startActivity(it);
    }



    @Override
    public void onClick(DialogInterface dialogInterface, int which)
    {
        if(which==DialogInterface.BUTTON_POSITIVE){//如果按下登入
            Intent it=new Intent(this,item.class);
            startActivity(it);
        }
        else//如果按下取消
        {
            Intent it=new Intent(this,MainActivity.class);
            startActivity(it);
        }


    }
}
