package com.example.portfolioapp.books;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolioapp.R;

import java.util.ArrayList;
import java.util.List;


public class BookFragment extends Fragment {

    RecyclerView RVBook;
    BookAdapter adapter;
    List<BookItems> mdata;



    public BookFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RVBook = view.findViewById(R.id.recv_book);
        BookItems item1 = new BookItems("Narnia 1",getString(R.string.cvlorem), R.drawable.narnia1);
        BookItems item2 = new BookItems("Narnia 2",getString(R.string.cvlorem), R.drawable.narnia2);
        BookItems item3 = new BookItems("Narnia 3",getString(R.string.cvlorem), R.drawable.narnia2);
        BookItems item4 = new BookItems("Educated",getString(R.string.cvlorem), R.drawable.educated);


        mdata = new ArrayList<>();
        mdata.add(item1);
        mdata.add(item2);
        mdata.add(item3);
        mdata.add(item4);


        RVBook.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new BookAdapter(mdata);
        RVBook.setAdapter(adapter);
    }

}