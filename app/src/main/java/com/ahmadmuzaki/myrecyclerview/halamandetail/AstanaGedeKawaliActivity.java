package com.ahmadmuzaki.myrecyclerview.halamandetail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmadmuzaki.myrecyclerview.R;

public class AstanaGedeKawaliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astana_gede_kawali);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Astana Gede Kawali");
        }
    }
}