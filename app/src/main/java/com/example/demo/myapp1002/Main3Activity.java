package com.example.demo.myapp1002;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    public void start4th (View view){
        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {}
            String s = data.getStringExtra("TEXT");
            Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
        }
        //super.onActivityResult(requestCode, resultCode, data);
    }
}
