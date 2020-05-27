package com.yan.googlecodelab044;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

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

        showOrder(mImageView01, "donut");

        showOrder(mImageView02, "ice cream");

        showOrder(mImageView03, "froyo");

        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
            }
        });
    }

    private void showOrder(ImageView imageView, final String s) {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMessage(s);
            }
        });
    }

    private void displayToastMessage(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
