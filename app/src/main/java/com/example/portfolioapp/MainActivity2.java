package com.example.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private Button backButton;
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<String> movieList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        backButton = findViewById(R.id.backbutton);
        movieList = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(movieList);

        //recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(recyclerAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        movieList.add("Iron Man");
        movieList.add("The Incredible Hulk");
        movieList.add("Iron Man 2");
        movieList.add("Thor");
        movieList.add("Captain America: The First Avenger");
        movieList.add("The Avengers");
        movieList.add("Iron Man 3");
        movieList.add("Thor: The Dark World");
        movieList.add("Captain America: The Winter Soldier");
        movieList.add("Guardians of the Galaxy");
        movieList.add("Avengers: Age of Ultron");
        movieList.add("Ant-Man");
        movieList.add("Captain America: Civil War");
        movieList.add("Doctor Strange");
        movieList.add("Guardians of the Galaxy Vol. 2");
        movieList.add("Spider-Man: Homecoming");
        movieList.add("Thor: Ragnarok");
        movieList.add("Black Panther");
        movieList.add("Avengers: Infinity War");
        movieList.add("Ant-Man and the Wasp");
        movieList.add("Captain Marvel");
        movieList.add("Avengers: Endgame");
        movieList.add("Spider-Man: Far From Home");


        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            if (bundle.getString("some") != null){
                Toast.makeText(getApplicationContext(), "Data: " + bundle.getString("some"), Toast.LENGTH_SHORT).show();
            }
        }
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);

        return super.onPrepareOptionsMenu(menu);
    }


}