package com.example.nssbhavans;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterorange extends BaseAdapter {

    private Context mcontext;
    public int[] imageArray={
            R.drawable.orange5,R.drawable.orange4,R.drawable.orange3,R.drawable.orange2,R.drawable.orange1

    };
    public ImageAdapterorange(Context mcontext){this.mcontext=mcontext;}

    @Override
    public int getCount() {return imageArray.length;}

    @Override
    public Object getItem(int position ) {return imageArray[position];}

    @Override
    public long getItemId(int position){return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        ImageView imageView=new ImageView(mcontext);
        imageView.setImageResource(imageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));

        return imageView;
    }
}

