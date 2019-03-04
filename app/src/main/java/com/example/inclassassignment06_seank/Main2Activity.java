package com.example.inclassassignment06_seank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Student stu = (Student) intent.getSerializableExtra(Keys.STUDENT);

        TextView res =(TextView)findViewById(R.id.result_textView);
        res.setText(stu.toString());
    }
}
