package com.example.portfolioapp.portfolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolioapp.R;

import java.util.ArrayList;
import java.util.List;


public class PortfolioFragment extends Fragment implements PortfolioCallback{
    List<PortfolioItem> mdata;
    RecyclerView recview_portfolio;
    PortfolioAdapter PortfolioAdapter;


    public PortfolioFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recview_portfolio = view.findViewById(R.id.recview_portfolio);

        mdata = new ArrayList<>();
        mdata.add(new PortfolioItem(R.drawable.educated));
        mdata.add(new PortfolioItem(R.drawable.educated));
        mdata.add(new PortfolioItem(R.drawable.educated));
        mdata.add(new PortfolioItem(R.drawable.educated));
        mdata.add(new PortfolioItem(R.drawable.educated));
        mdata.add(new PortfolioItem(R.drawable.educated));
        mdata.add(new PortfolioItem(R.drawable.educated));
        mdata.add(new PortfolioItem(R.drawable.educated));


        PortfolioAdapter = new PortfolioAdapter(mdata, this);

        recview_portfolio.setLayoutManager(new GridLayoutManager(getActivity(),3));
        recview_portfolio.setAdapter(PortfolioAdapter);

    }

    @Override
    public void onPortfolioItemClick(int pos) {


        PortfolioFragmentDetails portfolioFragmentDetails =
                new PortfolioFragmentDetails();

        Bundle bundle = new Bundle();
        bundle.putSerializable("object", mdata.get(pos));
        portfolioFragmentDetails.setArguments(bundle);

        portfolioFragmentDetails.show(getActivity().getSupportFragmentManager(), "tagname");


    }
}