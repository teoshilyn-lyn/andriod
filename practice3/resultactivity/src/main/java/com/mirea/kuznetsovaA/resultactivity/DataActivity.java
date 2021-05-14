package com.mirea.kuznetsovaA.resultactivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity {
    private EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        ed = findViewById(R.id.personname1);
    }

    public void sendResult(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", ed.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }

}