package com.example.tesst;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends ArrayAdapter<exx>
{
    private ArrayList<exx> arrayList;
    private Context ctx;
    private int item;


    public adapter(@NonNull Context context, int resource, ArrayList<exx> listt )
    {
        super(context, resource, listt);
        this.arrayList=listt;
        this.ctx= context;
        this.item=resource;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        convertView= LayoutInflater.from(ctx).inflate(item, parent, false);


        TextView nom=convertView.findViewById(R.id.part1);
        TextView prix=convertView.findViewById(R.id.part2);

        nom.setText(arrayList.get(position).getAchat());
        prix.setText(arrayList.get(position).getPrix());
        return convertView;
    }
}

