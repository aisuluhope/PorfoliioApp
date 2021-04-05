package com.example.portfolioapp.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.portfolioapp.MainActivity2;
import com.example.portfolioapp.R;

public class HomeFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button buttonOpenNext  = (Button) view.findViewById(R.id.buttonOpenNext);
        buttonOpenNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =  new Intent(getActivity(), MainActivity2.class);
                in.putExtra("some", "some data");
                startActivity(in);
            }
        });
        return view;


    }
}
