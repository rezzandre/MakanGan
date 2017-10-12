package rezzandre.example.com.tastindo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView resep;
    LinearLayoutManager Linear;

    List<Item> pola;
    WhatIsThis adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resep = (RecyclerView) findViewById(R.id.resep);

        Linear = new LinearLayoutManager(this);
        resep.setLayoutManager(Linear);

        pola = new ArrayList<>();
        pola.add(new Item(0,"Ghatani", "What the Fuck is This !!?","anjing","loe"));

        adapter = new WhatIsThis(this, pola);

        resep.setAdapter(adapter);
    }
}