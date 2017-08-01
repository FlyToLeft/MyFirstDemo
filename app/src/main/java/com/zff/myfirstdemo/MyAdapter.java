package com.zff.myfirstdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by 76598 on 2017/6/16.
 */

public class MyAdapter extends BaseAdapter {

    private List listData;

    public MyAdapter(List listData) {
        this.listData = listData;
    }


    @Override
    public int getCount() {
        return 0;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder = new MyViewHolder();


        return null;
    }

    private class MyViewHolder {
    }
}
