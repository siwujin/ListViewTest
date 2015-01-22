package com.example.listviewtest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitAdapter extends ArrayAdapter<Fruit> {

   private int resourceId;
    public FruitAdapter(Context context, int textViewResourceId,
	    List<Fruit> objects) {
	super(context, textViewResourceId, objects);
	resourceId=textViewResourceId;
	
    }
   
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
	Fruit fruit=getItem(position);
	//获得Fruit类型的Item实例
	View view;
	if(convertView==null){
		view=LayoutInflater.from(getContext()).inflate(resourceId, null);
	}
	else{
		view=convertView;
	}
	ImageView fruitImage=(ImageView) view.findViewById(R.id.fruit_image);
	TextView fruitName=(TextView) view.findViewById(R.id.fruit_name);
	fruitImage.setImageResource(fruit.getImageId());
	fruitName.setText(fruit.getName());
	return view;
	
    }
    

}
