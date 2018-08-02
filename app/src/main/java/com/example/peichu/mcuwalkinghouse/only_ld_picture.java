package com.example.peichu.mcuwalkinghouse;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class only_ld_picture extends AppCompatActivity {
    Uri imgUri;
    ImageView imv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_ld_picture);
        imv=(ImageView)findViewById(R.id.photo1);
    }
    
   
            
            
            
   
protected void onActivityResult(int requestCode,int resultCode,Intent data)
{
    super.onActivityResult(requestCode,resultCode,data);
    if(resultCode== Activity.RESULT_OK&& requestCode==100)//要求的intent成功了
    {
        Bitmap bmp = null;
        try {
            bmp = BitmapFactory.decodeStream(getContentResolver().openInputStream(imgUri), null, null);
        } catch (IOException e) {
            Toast.makeText(this, "無法讀取", Toast.LENGTH_LONG).show();
        }
        imv.setImageBitmap(bmp);
    }
    else {
        Toast.makeText(this,"沒有拍到照片",Toast.LENGTH_LONG).show();
    }
       /* switch (requestCode)
        {
            case 100://拍照

                Intent it=new Intent(Intent.ACTION_GET_CONTENT);
                it.setType("image/*");
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
*/

}

    public void onpick(View v){
        Intent it = new Intent(Intent.ACTION_GET_CONTENT);//建立動作為選取內容
        it.setType("image/*");
        startActivityForResult(it,101);//101為選取照片
    }

    /*public void onGet(View v){
        if(ActivityCompat.checkSelfPermission(this,
                only_ld_manage.permission.WRITE_EXTERNAL_STORAGE)!=
                PackageManager.PERMISSION_DENIED);{

            ActivityCompat.requestPermissions(this,new String[]{only_ld_manage.permission.WRITE_EXTERNAL_STORAGE},200);
        }

    }*/
    
    public void onRequestPermissionsResult(int requestCode,String[]ermissions,int[]grantResults){
        if(requestCode==200){
            if(grantResults[0]==getPackageManager().PERMISSION_GRANTED){
                savePhoto();
            }
            else{
                Toast.makeText(this,"程式需要權限才能操作",Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void savePhoto() {
        
        imgUri=getContentResolver().insert(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,new ContentValues()
        );
        Intent it=new Intent("android.media.action.IMAGE_CAPTURE");
        it.putExtra(MediaStore.EXTRA_OUTPUT,imgUri);
        startActivityForResult(it,100);
    }
}
