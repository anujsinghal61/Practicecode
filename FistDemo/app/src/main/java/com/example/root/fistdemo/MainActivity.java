package com.example.root.fistdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendName (View view)
    {
        String str = new String();
        EditText edit = (EditText) findViewById(R.id.editText_Name);
        str = edit.getText().toString();
        Intent i= new Intent(this, Main2Activity.class);
        Bundle bund = new Bundle();
        bund.putString("value", str);
        i.putExtras(bund);
        startActivity(i);
    }
}
