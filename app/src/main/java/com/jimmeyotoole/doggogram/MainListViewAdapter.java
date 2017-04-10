package com.jimmeyotoole.doggogram;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jimmeyotoole on 9/4/17.
 */

public class MainListViewAdapter extends ArrayAdapter<Doggo>{

    Context mContext;
    int layoutResourceId;
    ArrayList <Doggo> data = null;


    public MainListViewAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Doggo> objects) {
        super(context, resource, objects);
        mContext=context;
        layoutResourceId=resource;
        data=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
        }

        //Get the doggo in the list
        Doggo doggo= data.get(position);

        //Set visual elements
        TextView name = (TextView) convertView.findViewById(R.id.item_name);
        name.setText(doggo.name);

        return convertView;
    }
}
