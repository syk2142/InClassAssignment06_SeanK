package com.example.inclassassignment06_seank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mStuName,mStuAge,mStuInfo;
    CheckBox mGraduated;
    RadioGroup gender;
    String maleOrFemale;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViewControls();

        gender =(RadioGroup) findViewById(R.id.radioGroup);
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.male_radioButton){
                    maleOrFemale = "Gender: Male";
                }
                if(checkedId==R.id.female_radioButton){
                    maleOrFemale = "Gender: Female";
                }
            }
        });
    }


    private void initializeViewControls(){
        mStuName = findViewById(R.id.stuName);
        mStuAge = findViewById(R.id.stuAge);
        mStuInfo = findViewById(R.id.stuInfo);
        mGraduated= findViewById(R.id.graduated_checkBox);

        findViewById(R.id.submit_button).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        String stuName = mStuName.getText().toString();
        int stuAge = Integer.valueOf(mStuAge.getText().toString());
        String stuInfo = mStuInfo.getText().toString();
        boolean graduated = mGraduated.isChecked();

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        Student mStudent = new Student(stuName,stuAge,stuInfo,graduated,maleOrFemale);
        intent.putExtra(Keys.STUDENT,mStudent);

        startActivity(intent);
    }



}