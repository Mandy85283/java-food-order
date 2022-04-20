package com.example.eatorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();
    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.butterchicken,"Butter Chicken","0","CA$19.99","______________________"));
        userList.add(new ModelClass(R.drawable.dal_makhni,"Dal makhni","0","CA$12.99","______________________"));
        userList.add(new ModelClass(R.drawable.chillichicken,"Chili Chicken","0","CA$19.99","______________________"));
        userList.add(new ModelClass(R.drawable.malaikofta,"Malai Kofta","0","CA$13.99","______________________"));
        userList.add(new ModelClass(R.drawable.kadaipaneer,"Kadhai Paneer","0","CA$13.99","______________________"));
        userList.add(new ModelClass(R.drawable.chickenbiryani,"Chicken Biryani","0","CA$17.99","______________________"));
        userList.add(new ModelClass(R.drawable.chickencurry,"Chicken Curry","0","CA$19.99","______________________"));
        userList.add(new ModelClass(R.drawable.chickentikka,"Chicken Tikka","0","CA$18.99","______________________"));
        userList.add(new ModelClass(R.drawable.daltadka,"Dal Tadka","0","CA$13.99","______________________"));
        userList.add(new ModelClass(R.drawable.garlicnaan,"Garlic Naan","0","CA$2.99","______________________"));
        userList.add(new ModelClass(R.drawable.goatcurry,"Goat Curry","0","CA$19.99","______________________"));
        userList.add(new ModelClass(R.drawable.kadaichicken,"Kadai Chicken","0","CA$20.99","______________________"));
        userList.add(new ModelClass(R.drawable.keemanaan,"Keema Naan","0","CA$4.99","______________________"));
        userList.add(new ModelClass(R.drawable.malaikofta,"Malai Kofta","0","CA$13.99","______________________"));
        userList.add(new ModelClass(R.drawable.naan,"Naan","0","CA$1.99","______________________"));
        userList.add(new ModelClass(R.drawable.paneerbhurji,"Paneer Bhurji","0","CA$14.99","______________________"));
        userList.add(new ModelClass(R.drawable.paneermakhani,"Paneer Makhani","0","CA$13.99","______________________"));
        userList.add(new ModelClass(R.drawable.paneertikka,"Paneer Tikka","0","CA$15.99","______________________"));
        userList.add(new ModelClass(R.drawable.paneertikkamasala,"Paneer Tikka Masala","0","CA$17.99","______________________"));
        userList.add(new ModelClass(R.drawable.seekhkebabs,"Seekh Kebabs","0","CA$17.99","______________________"));
        userList.add(new ModelClass(R.drawable.tandoorisalmon,"Tandoori Salmon","0","CA$17.99","______________________"));
        userList.add(new ModelClass(R.drawable.tandooriroti,"Tandoori Roti","0","CA$1.99","______________________"));
        userList.add(new ModelClass(R.drawable.vegbiryani,"Veg Biryani","0","CA$12.99","______________________"));


    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}