package com.example.test;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter extends PagerAdapter {

    private int[] images = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
    private LayoutInflater inflater;
    private Context context;
    private View view;
    private Object object;


    public Adapter(Context context){
        this.context = context;

    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        this.view = view;
        this.object = object;
        return view == ((LinearLayout)object);

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v =inflater.inflate(R.layout.slider, container,false);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);

        imageView.setImageResource(images[position]);

        container.addView(v);
        return v;



    }

    @Override
    public void  destroyItem(ViewGroup container, int position, Object object){
        container.invalidate();
    }

}
