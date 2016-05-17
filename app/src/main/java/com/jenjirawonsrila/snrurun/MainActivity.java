package com.jenjirawonsrila.snrurun;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyManage myManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManage = new MyManage(MainActivity.this);

        //Test Add user
        //myManage.addUser("เจนจิรา","janejira", "000000","2");

        //Delete All SQLite
        deleteAllSQLite();


    }//Main Method

    private void deleteAllSQLite() {

        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE,null);
        sqLiteDatabase.delete(MyManage.user_table,null,null);
    }

    public void clickSignUpMain(View view){
        startActivity(new Intent(MainActivity.this,SignUp.class));    }

}//Main Class นี่คือคลาสหลัก
