package com.example.peichu.mcuwalkinghouse;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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

}
