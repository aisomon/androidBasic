package com.example.myfragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = {"Sumon","Ashik","Jesan","Tuhin","Alamgir","Samiul","Zawad","Jubayer"};
        listView =(ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;
        if(position==0){
            fragment = new SumonFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId,fragment);
            fragmentTransaction.commit();

        }
        else if(position==1){
            fragment = new AshikFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId,fragment);
            fragmentTransaction.commit();
        }

    }
}
