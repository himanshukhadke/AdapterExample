package com.example.adapterexamples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NameAdapter extends ArrayAdapter<Name> {


    public NameAdapter(@NonNull Context context, ArrayList<Name> names) {
        super(context, 0, names);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View text_item_view = convertView;
        if (text_item_view == null) {
            text_item_view = LayoutInflater.from(getContext()).inflate(
                    R.layout.text_item, parent, false);
        }
        Name current_name = getItem(position);

        TextView first_nameTextView = (TextView) text_item_view.findViewById(R.id.first_name);
        first_nameTextView.setText(current_name.getFirst_name());


        TextView numberTextView = (TextView) text_item_view.findViewById(R.id.last_name);
        numberTextView.setText(current_name.getLast_name());

        ImageView imageView = (ImageView) text_item_view.findViewById(R.id.img);
        imageView.setImageResource(current_name.getImagerResourseId());

        return text_item_view;
    }
}
