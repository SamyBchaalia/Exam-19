package com.example.examandroidfinal;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class VehiclesFragment extends Fragment {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;


    public VehiclesFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_vehicles, container, false);


        dataList = (RecyclerView) v.findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("Airport Shuttle");
        titles.add("Bicycle");
        titles.add("Boat");
        titles.add("Bus");
        titles.add("Car");
        titles.add("another Item");
        titles.add("another Item");
        titles.add("another Item");
///////////////////////////////////////Soooooooorry for the Imaaaaaaaages Noo time
        images.add(R.drawable.ic_airline_seat_flat_angled_black_24dp);
        images.add(R.drawable.ic_airplanemode_active_black_24dp);
        images.add(R.drawable.ic_brightness_1_black_24dp);
        images.add(R.drawable.ic_build_black_24dp);
        images.add(R.drawable.ic_airline_seat_flat_angled_black_24dp);
        images.add(R.drawable.ic_airplanemode_active_black_24dp);
        images.add(R.drawable.ic_brightness_1_black_24dp);
        images.add(R.drawable.ic_build_black_24dp);

        adapter = new Adapter(getContext(),titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);

     return v;   // Inflate the layout for this fragment
    }
}