package com.example.shubhammishra.layoutwithimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewAdapter extends BaseAdapter {
    ArrayList<Profile> profiles;

    public NewAdapter(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }
    @Override
    public int getCount() {
     return profiles.size();
    }

    @Override
    public Profile getItem(int position) {
        return profiles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater lf=(LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=lf.inflate(R.layout.list_view_imageincluded,parent,false);
        Profile pf=getItem(position);
        TextView name=view.findViewById(R.id.Name);
        TextView address=view.findViewById(R.id.Address);
        TextView phone=view.findViewById(R.id.Phone_Number);
        TextView city=view.findViewById(R.id.City);
        TextView pincode=view.findViewById(R.id.pincode);
        ImageView imageView=view.findViewById(R.id.imageView);
        imageView.setImageResource(pf.getImageResource());
        name.setText(pf.getName());
        address.setText(pf.getAddress());
        phone.setText(String.valueOf(pf.getPhone_number()));
        city.setText(pf.getCity());
        pincode.setText(String.valueOf(pf.getPincode()));
        return view;
    }
}
