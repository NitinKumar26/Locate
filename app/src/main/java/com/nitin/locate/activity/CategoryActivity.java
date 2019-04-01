package com.nitin.locate.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nitin.locate.R;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView student, driver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        student = findViewById(R.id.student);
        driver = findViewById(R.id.driver);


        student.setOnClickListener(this);
        driver.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.student:
                intent = new Intent(CategoryActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.driver:
                intent = new Intent(CategoryActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
        }
    }
}
