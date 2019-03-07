package com.e.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

EditText edit ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = findViewById(R.id.edit);


    }

    @Override
    protected void onPause()
    {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("gla.Akash.sharedprefdemo", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", edit.getText().toString().trim());
        editor.putBoolean("bool",true);
        editor.apply();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = getSharedPreferences("gla.Akash.sharedpref", MODE_PRIVATE);
        String s1 = sharedPreferences.getString("name", "user");
    }
}
