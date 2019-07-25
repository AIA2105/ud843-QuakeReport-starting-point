package com.example.android.quakereport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import android.graphics.drawable.GradientDrawable;

public class EarthquakeAdapter extends BaseAdapter {
    static ArrayList<Earthquake> list;


    public EarthquakeAdapter(Context context,ArrayList<Earthquake> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i).getLocation();
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        TextView  magnitude = view.findViewById(R.id.magnitude);
        magnitude.setText(list.get(i).getMagnitude());
        TextView  location = view.findViewById(R.id.location);
        location.setText(list.get(i).getLocation());
        TextView  address = view.findViewById(R.id.address);
        address.setText(list.get(i).getAddress());
        TextView  date = view.findViewById(R.id.date);
        date.setText(list.get(i).getDate());




        return view;
    }
}


