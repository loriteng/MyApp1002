package com.example.demo.myapp1002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //接收基本資料
        String u = getIntent().getStringExtra("user");
        String p = getIntent().getStringExtra("password");
        Toast.makeText(this, "User:"+u+"\nPassword"+p ,Toast.LENGTH_SHORT).show();

        //接收複雜資料(bundle)
        Bundle bundle = super.getIntent().getExtras();
        Serializable serializable = bundle.getSerializable("MyProduct");
        Toast.makeText(this, serializable.toString(), Toast.LENGTH_SHORT).show();

    }

    public void goto1st(View view){
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        super.startActivity(intent);
    }
}
