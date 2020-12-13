package com.ahmadmuzaki.myrecyclerview.halamandetail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmadmuzaki.myrecyclerview.R;

public class SituLengkongPanjaluActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situ_lengkong_panjalu);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Situ Lengkong Panjalu");
        }
    }
}