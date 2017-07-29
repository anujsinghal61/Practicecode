package com.example.root.fistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bund2 = getIntent().getExtras();
        String Name = bund2.getString("value");
        TextView txt = (TextView) findViewById(R.id.textView_Name);
        txt.setText("Hey " + Name + "! Let's check out some Images");
    }

    public void display(View view) {
        Intent i = new Intent(this, ActivityGridView.class);
        Bundle bundle = new Bundle();
        startActivity(i);

    }
}
