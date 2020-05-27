package com.yan.googlecodelab044;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView01,mImageView02,mImageView03;
    private FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView01 = (ImageView)findViewById(R.id.main_image_donut);
        mImageView02 = (ImageView)findViewById(R.id.main_image_ice_cream);
        mImageView03 = (ImageView)findViewById(R.id.main_image_froyo);
        mFloatingActionButton = (FloatingActionButton)findViewById(R.id.main_fab);

        mImageView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "donut", Toast.LENGTH_SHORT).show();
            }
        });

        mImageView02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ice cream", Toast.LENGTH_SHORT).show();
            }
        });

        mImageView03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "froyo", Toast.LENGTH_SHORT).show();
            }
        });

        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
            }
        });
    }
}
