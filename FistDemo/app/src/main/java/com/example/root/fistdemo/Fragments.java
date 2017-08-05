package com.example.root.fistdemo;

import android.app.Activity;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragments extends Fragment {

    public Fragments()
    {
        //Default Constructor
    }

    public void onAttach (Activity activity)
    {
        super.onAttach (activity);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {



        return inflater.inflate (R.layout.activity_fragments, container, false);

    }

}
