package com.example.adapterexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Name> names = new ArrayList<>();

        for (int i = 0; i < 100; ++i) {
            names.add(new Name("" + i, "" + i * i));
        }
        NameAdapter items = new NameAdapter(this, names);
        ListView listView = findViewById(R.id.rootView);
        listView.setAdapter(items);
    }
}