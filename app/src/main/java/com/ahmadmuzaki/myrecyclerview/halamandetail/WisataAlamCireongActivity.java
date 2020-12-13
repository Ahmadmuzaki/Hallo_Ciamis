package com.ahmadmuzaki.myrecyclerview.halamandetail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmadmuzaki.myrecyclerview.R;

public class WisataAlamCireongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam_cireong);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Wisata Alam Cireong");
        }
    }
}