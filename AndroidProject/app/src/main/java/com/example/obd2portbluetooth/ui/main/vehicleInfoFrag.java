package com.example.obd2portbluetooth.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.obd2portbluetooth.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link vehicleInfoFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class vehicleInfoFrag extends Fragment {

    public vehicleInfoFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment vehicleInfoFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static vehicleInfoFrag newInstance() {
        vehicleInfoFrag fragment = new vehicleInfoFrag();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vehicle_info, container, false);
    }
}
