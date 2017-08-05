package com.example.root.fistdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ActivityGridView extends AppCompatActivity {

    MyAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<String> arr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        arr = new ArrayList<String>();
        for (int i=1; i<=10; i++)
        {
            arr.add("Image"+i);
        }
        recyclerView = (RecyclerView) findViewById(R.id.recycler_View);
        adapter = new MyAdapter(arr,this);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,1,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    public void display2(View view)
    {
        Intent i = new Intent(this, MainFragments.class);
        startActivity(i);
    }
}
