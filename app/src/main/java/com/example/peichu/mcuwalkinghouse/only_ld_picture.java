package com.example.peichu.mcuwalkinghouse;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class only_ld_picture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_ld_picture);
    }
    public void onget(View v){
        Intent it;
        it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(it,100);
    }
protected void onActivityResult(int requestCode,int resultCode,Intent data)
{
    super.onActivityResult(requestCode,resultCode,data);
    if(resultCode== Activity.RESULT_OK&& resultCode==100)//有拍到照片時
    {
        Bundle bd1=data.getExtras();//將Intent的附加資料轉為bundle物件
        Bitmap bmp=(Bitmap)bd1.get("data");//由bundle取出名為data的Bitmap資料
        ImageView imv=(ImageView) findViewById(R.id.imageView);
        imv.setImageBitmap(bmp);

    }
    else//沒有拍到照片時
        {
        Toast.makeText(this,"沒有拍到照片",Toast.LENGTH_LONG).show();
    }

}
}
