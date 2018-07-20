package com.example.peichu.mcuwalkinghouse;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class only_ld_picture extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_ld_picture);
    }
   
protected void onActivityResult(int requestCode,int resultCode,Intent data)
{
    super.onActivityResult(requestCode,resultCode,data);
    if(resultCode== Activity.RESULT_OK)//要求的intent成功了
    {
        switch (requestCode)
        {
            case 100://拍照

                Intent it=new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,imgUri);
                sendBroadcast(it);
                break;
            case 101://選取照片
                imgUri=data.getData();
                
                break;
                }
        showImg();

    }
    else//沒有拍到照片時
        {
        Toast.makeText(this,requestCode==100?"沒有拍到照片":"沒有選取照片",Toast.LENGTH_LONG).show();
    }


}

    public void onpick(View v){
        Intent it = new Intent(Intent.ACTION_GET_CONTENT);//建立動作為選取內容
        it.setType("image/*");
        startActivityForResult(it,101);//101為選取照片
    }
}
