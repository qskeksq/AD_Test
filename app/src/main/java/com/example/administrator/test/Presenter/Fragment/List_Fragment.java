package com.example.administrator.test.Presenter.Fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.test.Presenter.Activity.MainActivity;
import com.example.administrator.test.Presenter.DrawerInterface;
import com.example.administrator.test.R;


public class List_Fragment extends Fragment {

    DrawerInterface di;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar_list);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        TabLayout tab = (TabLayout) view.findViewById(R.id.tab);
        tab.addTab(tab.newTab().setText("QT"));
        tab.addTab(tab.newTab().setText("Words"));
        tab.addTab(tab.newTab().setText("Decision"));


        di = (MainActivity) getActivity();
        toolbar.setNavigationIcon(R.drawable.ic_action_hamburgur);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                di.openDrawer();
            }
        });

        return view;
    }

}
