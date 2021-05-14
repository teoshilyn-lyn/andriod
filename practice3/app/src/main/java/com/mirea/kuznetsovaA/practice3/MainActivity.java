package com.mirea.kuznetsovaA.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mirea.kuznetsovaA.intentapp.activity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickInFirstActivity(View view) {
        Intent intent = new Intent(this, activity2.class);
        intent.putExtra("key", "MIREA - Кузнецова Арина Андреевна");
        startActivity(intent);
    }
}