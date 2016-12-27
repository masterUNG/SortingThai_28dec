package com.example.nrru.panthaisong.trakarn.sortingthai;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by 27iT_ASUS on 28/9/2559.
 */

public class SortAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private String[] strings;

    public SortAdapter(Context context, String[] strings) {
        this.context = context;
        this.strings = strings;
    } // Constructor

    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View view1 = layoutInflater.inflate(R.layout.sort_listview, viewGroup, false);

        TextView textView = (TextView) view1.findViewById(R.id.textView);
        textView.setText(strings[i]);


        return view1;
    }
} // Main Class
