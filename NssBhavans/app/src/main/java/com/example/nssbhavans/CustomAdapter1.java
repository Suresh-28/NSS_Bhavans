package com.example.nssbhavans;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter1  extends BaseAdapter {

    Context context;
    int[] images;
    LayoutInflater layoutInflater;
    public CustomAdapter1(Context appcontext, int[]images){
        this.context=appcontext;
        this.images=images;
        layoutInflater=(LayoutInflater.from(appcontext));

    }
    @Override
    public int getCount() {
        return images.length;
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
        convertView=layoutInflater.inflate(R.layout.sample,null);
        ImageView imageView=convertView.findViewById(R.id.imageView7);
        imageView.setImageResource(images[position]);

        return convertView;
    }
}
