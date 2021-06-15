package com.example.examandroidfinal;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class VehicleDetailFragment extends Fragment {


    String Title;
    int image;
    public VehicleDetailFragment(String title,int I) {
        Title=title;
        image=I;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_vehicle_detail, container, false);
        TextView T=v.findViewById(R.id.title);
        T.setText(Title);
        ImageView I=v.findViewById(R.id.image);
        I.setImageResource(image);
        return v;
    }
}