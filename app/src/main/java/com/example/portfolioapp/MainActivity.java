package com.example.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.portfolioapp.books.BookFragment;
import com.example.portfolioapp.cv.CVFragment;
import com.example.portfolioapp.home.HomeFragment;
import com.example.portfolioapp.menu.Callback;
import com.example.portfolioapp.menu.MenuAdapter;
import com.example.portfolioapp.menu.MenuItem;
import com.example.portfolioapp.menu.MenuUtil;
import com.example.portfolioapp.menu.Callback;

import com.example.portfolioapp.portfolio.PortfolioFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Callback {


    RecyclerView RecMenu;
    MenuAdapter adapter;
    List<MenuItem> menuItems;
    int selectMenu = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setCVFragment();
        setHomeFragment();
        setBookFragment();
        setPortfolioFragment();
        setRecMenu();

    }



    private void setRecMenu(){
        RecMenu = findViewById(R.id.recv_menu);
        menuItems = MenuUtil.getMenuList();
        adapter = new MenuAdapter(menuItems, this);
        RecMenu.setLayoutManager(new LinearLayoutManager(this));
        RecMenu.setAdapter(adapter);

    }

    void setPortfolioFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new PortfolioFragment()).commit();
    }

    void setBookFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new BookFragment()).commit();
    }
    void setCVFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new CVFragment()).commit();
    }

    void setHomeFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
    }

    @Override
    public void onSideMenuItem(int i) {
        switch (menuItems.get(i).getCode()){
            case MenuUtil.HOME_FRAGMENT_CODE: setHomeFragment();
            break;
            case MenuUtil.CV_FRAGMENT_CODE: setCVFragment();
            break;
            case MenuUtil.BOOK_FRAGMENT_CODE: setBookFragment();
            break;
            case MenuUtil.PORTFOLIO_FRAGMENT_CODE: setPortfolioFragment();
            break;
            default:setHomeFragment();
        }

        menuItems.get(selectMenu).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectMenu = i;
        adapter.notifyDataSetChanged();

    }

}