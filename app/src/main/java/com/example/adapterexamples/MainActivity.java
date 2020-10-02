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
        int i = 1;
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_one));
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_two));
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_three));
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_four));
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_five));
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_six));
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_seven));
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_eight));
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_nine));
        names.add(new Name("Square of " + i + "  is :", "" + i * i, R.drawable.number_ten));

        NameAdapter items = new NameAdapter(this, names);
        ListView listView = findViewById(R.id.rootView);
        listView.setAdapter(items);
    }
}