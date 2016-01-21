package com.magdusz.thingstobuy;

import android.content.Context;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Zuofer on 2016-01-19.
 */
public class MyCustomAdapter extends BaseAdapter implements ListAdapter {
    private ArrayList<String> list = new ArrayList<String>();
    private Context context;


    public MyCustomAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
        //return list.get(position).getId();   <---TUTEJ--->
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.custom_list_layout, null);   ///TUTAJ SIE DZIEJA CUDA jak jest activity_main :D
        }

        //Textview and display string from list
//        TextView listItemText = (TextView) view.findViewById(R.id.list_item); //tutaj list_item
//        listItemText.setText(list.get(position));

        return view;
    }
}
