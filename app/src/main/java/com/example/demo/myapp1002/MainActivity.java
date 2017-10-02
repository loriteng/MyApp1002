package com.example.demo.myapp1002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goto2nd (View view) {

        //設定一個跳頁mathod
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        //設定基本資料類型
        intent.putExtra("user", "Anne");
        intent.putExtra("password", "a123456");

        //設定複雜資料類型(Bundle)
        Product  product = new Product("Apple", 60);
        Bundle bundle = new Bundle();
        bundle.putSerializable("MyProduct",product);
        intent.putExtras(bundle);

        super.startActivity(intent);
        MainActivity.this.finish();
    }


}
