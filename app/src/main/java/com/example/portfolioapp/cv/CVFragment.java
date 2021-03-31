package com.example.portfolioapp.cv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolioapp.R;

import java.util.ArrayList;
import java.util.List;


public class CVFragment extends Fragment {

    RecyclerView RecView;
    CVAdapter adapter;
    List<CVitems> items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecView = view.findViewById(R.id.recyclerview_cv);

        items = new ArrayList<>();
        items.add(new CVitems("20 March 2013", getString(R.string.lorem_text)));
        items.add(new CVitems("21 March 2013", getString(R.string.lorem_text)));
        items.add(new CVitems("22 March 2013", getString(R.string.cvlorem)));
        items.add(new CVitems("23 March 2013", getString(R.string.lorem_text)));
        items.add(new CVitems("24 March 2013", getString(R.string.cvlorem)));
        items.add(new CVitems("25 March 2013", getString(R.string.lorem_text)));
        items.add(new CVitems("26 March 2013", getString(R.string.cvlorem)));

        adapter = new CVAdapter(items);

        RecView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecView.setAdapter(adapter);

    }

    public CVFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c_v, container, false);
    }
}