package com.example.demo.myapp1002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void back2Previous (View view){
        Intent intent = new Intent();
        String text = "4th Activity send back!";
        intent.putExtra("TEXT", text);
        setResult(RESULT_OK, intent);
        finish();
    }

}
