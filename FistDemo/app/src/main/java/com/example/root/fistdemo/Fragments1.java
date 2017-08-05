package com.example.root.fistdemo;

import android.app.Activity;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragments1 extends Fragment {

    public Fragments1() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {


        View view =  inflater.inflate (R.layout.activity_fragments1, container, false);

        TextView txt = (TextView) view.findViewById(R.id.frg_View3);
        final String str = getArguments().getString("Fragment_Data");
        Log.w("Value" , str);
        txt.setText(str);

        return view;

    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
