package com.example.root.fistdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

/**
 * Created by root on 29/7/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView iview;
        public MyViewHolder(View view)
        {
            super(view);
            iview = (ImageView) view.findViewById(R.id.img);

        }
    }

    ArrayList<String> arr2;
    Context mContext;

    public MyAdapter (ArrayList<String> arr, Context mContext)
    {
        this.arr2 =arr;
        this.mContext = mContext;
    }

    public int getItemCount()
    {
        return arr2.size();
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.recycle_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        switch(position)
        {
            case 1: holder.iview.setImageResource(R.drawable.download);
                    break;
            case 2: holder.iview.setImageResource(R.drawable.download);
                    break;
            case 3: holder.iview.setImageResource(R.drawable.download);
                break;
            case 4: holder.iview.setImageResource(R.drawable.images);
                break;
            case 5: holder.iview.setImageResource(R.drawable.images);
                break;
            case 6: holder.iview.setImageResource(R.drawable.images9);
                break;
            case 7: holder.iview.setImageResource(R.drawable.images9);
                break;
            case 8: holder.iview.setImageResource(R.drawable.images9);
                break;
            case 9: holder.iview.setImageResource(R.drawable.images9);
                break;
            case 10: holder.iview.setImageResource(R.drawable.images9);
                break;
            default: holder.iview.setImageResource(R.drawable.download);
                    break;
        }
    }

}

