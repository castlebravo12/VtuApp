package com.example.pankaj.vtuapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import model.ListItem;
import vtuFirst.Adap;

public class Main3Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
   private List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView =(RecyclerView)findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItems = new ArrayList<>();
       // for(int i = 0;i<10;i++) {
            ListItem listItem;
            listItem = new ListItem(new String[]{"                 Computer Science"}, "Description");

            ListItem listItem1 = new ListItem(new String[]{"      Electroncis And Communications"},"Description");
            ListItem listItem2 = new ListItem(new String[]{"                Civil Engineering"}, "Description");
            ListItem listItem3 = new ListItem(new String[]{"      Electrical And Electronics Engineering"} ,"Description");
            ListItem listItem4 = new ListItem(new String[]{"             Mechanical Engineering"},"Description");
            ListItem listItem5 = new ListItem(new String[]{"            Aeronautical Engineering"}, "Description");
            listItems.add(listItem);
            listItems.add(listItem1);
            listItems.add(listItem2);
            listItems.add(listItem3);
            listItems.add(listItem4);
            listItems.add(listItem5);


        //}
        adapter = new Adap(this,listItems);
        recyclerView.setAdapter(adapter);

            }



}
