package com.example.ibrahim.collapsingtoolbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ibrahim on 4/7/2017.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {

    ArrayList<Album> arrayList;
    Context context;

    public MyRecyclerAdapter(Context context,ArrayList<Album> arrayList) {
        this.arrayList = arrayList;
        this.context=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Toast.makeText(context, "onCreateViewHolder", Toast.LENGTH_SHORT).show();
        View row= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        MyViewHolder holder=new MyViewHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Toast.makeText(context, "onBindViewHolder", Toast.LENGTH_SHORT).show();
        Album album=arrayList.get(position);
        holder.imageView.setImageResource(album.getImg_id());
    }

    @Override
    public int getItemCount() {
        Toast.makeText(context,arrayList.size()+ "getItemCount", Toast.LENGTH_SHORT).show();
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            Toast.makeText(context, "inside the Holder", Toast.LENGTH_SHORT).show();
            imageView=(ImageView)itemView.findViewById(R.id.album);
        }
    }
}
