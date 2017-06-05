package com.example.administrator.test.Presenter.Activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.administrator.test.Presenter.DrawerInterface;
import com.example.administrator.test.Presenter.Fragment.Calendar_Fragment;
import com.example.administrator.test.Presenter.Fragment.Decision_Fragment;
import com.example.administrator.test.Presenter.Fragment.List_Fragment;
import com.example.administrator.test.Presenter.Fragment.QT_Fragment;
import com.example.administrator.test.Presenter.Fragment.Words_Fragment;
import com.example.administrator.test.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, DrawerInterface {

    Fragment fragment;
//    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_main);

        init();
        getSupportFragmentManager().beginTransaction().addToBackStack("back").replace(R.id.fragment_container, new QT_Fragment()).commit();

    }

//--------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------

    public void init(){
        findAddress();
        setListener();
        setFirst();

//        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        toggle.syncState();
    }

    public void findAddress(){
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
    }

    public void setListener(){
        drawerLayout.setDrawerListener(toggle);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void setFirst(){
//        setSupportActionBar(toolbar);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            Toast.makeText(this, "한번 더 누르면 앱이 종료됩니다", Toast.LENGTH_SHORT).show();

        }
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.menu_add_qt:
                fragment = new QT_Fragment();
                getSupportFragmentManager().beginTransaction().addToBackStack("back").replace(R.id.fragment_container, fragment).commit();
                break;
            case R.id.menu_add_words:
                fragment = new Words_Fragment();
                getSupportFragmentManager().beginTransaction().addToBackStack("back").replace(R.id.fragment_container, fragment).commit();
                break;
            case R.id.menu_add_decision:
                fragment = new Decision_Fragment();
                getSupportFragmentManager().beginTransaction().addToBackStack("back").replace(R.id.fragment_container, fragment).commit();
                break;
            case R.id.menu_list:
                fragment = new List_Fragment();
                getSupportFragmentManager().beginTransaction().addToBackStack("back").replace(R.id.fragment_container, fragment).commit();
                break;
            case R.id.menu_calendar:
                fragment = new Calendar_Fragment();
                getSupportFragmentManager().beginTransaction().addToBackStack("back").replace(R.id.fragment_container, fragment).commit();
                break;
            case R.id.menu_settings:
//                TODO 스택 처리 안 해주면 계속 쌓인다
//                int index = getSupportFragmentManager().getBackStackEntryCount() -1 ;
//                Log.e("Main", index+"");
//                String tag = getSupportFragmentManager().getBackStackEntryAt(index).getName();
//                Log.e("Main", tag);
//                fragment = getSupportFragmentManager().findFragmentByTag(tag);
//                Log.e("Main", "확인1");
//                getSupportFragmentManager().beginTransaction().remove(fragment).commit();
//                Log.e("Main", "확인2");

//                getFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragment_container, new Settings_Fragment()).commit();
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void openDrawer() {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    @Override
    public void closeDrawer() {
        drawerLayout.closeDrawer(GravityCompat.START);
    }
}
