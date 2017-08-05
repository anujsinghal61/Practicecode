package com.example.root.fistdemo;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainFragments extends AppCompatActivity {
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragments);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        Fragments obj = new Fragments();
        fragmentTransaction.add(R.id.fragment_Container, obj);
        fragmentTransaction.commit();

    }


        public void btnClick(View view)
    {
        Fragments1 obj1 = new Fragments1();
        final Bundle bundle = new Bundle();
        final EditText eText = (EditText) findViewById(R.id.edit_Frag);
        String str = eText.getText().toString();
        bundle.putString("Fragment_Data", str);
        obj1.setArguments(bundle);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_Container, obj1);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        }

    }
