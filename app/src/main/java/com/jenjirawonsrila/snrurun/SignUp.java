package com.jenjirawonsrila.snrurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, userEditText, passEditText;
    private RadioGroup radioGroup;
    private RadioButton choice1RadioButton, choice2RadioButton, choice3RadioButton,
            choice4RadioButton, choice5RadioButton;
    private String nameString,uerString,passString,avataString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        bindWidget();

    }//Main Method

    private void bindWidget() {

        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passEditText = (EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup)findViewById(R.id.ragAvata);
        choice1RadioButton =(RadioButton)findViewById(R.id.radioButton);
        choice2RadioButton =(RadioButton)findViewById(R.id.radioButton2);
        choice3RadioButton =(RadioButton)findViewById(R.id.radioButton3);
        choice4RadioButton =(RadioButton)findViewById(R.id.radioButton4);
        choice5RadioButton =(RadioButton)findViewById(R.id.radioButton5);

    }

    public void clickSignUpSign(View view) {

        //Get Value From EditText
        nameString=nameEditText.getText().toString().trim();
        uerString = userEditText.getText().toString().trim();
        passString = passEditText.getText().toString().trim();

        //check Space
        if (nameString.equals("") ||uerString.equals("")  || passString.equals("") ){

            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง", "กรุณากรอกทุกช่องค่ะ");

        }else{

        }


    }

}//Main Class
