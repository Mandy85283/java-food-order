package com.example.eatorderingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public Adapter (List<ModelClass>userList){
        this .userList=userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdesign,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resourse= userList.get(position).getImageview1();
        String name=userList.get(position).getTextview1();
        String description=userList.get(position).getTextview3();
        String add= userList.get(position).getTextview2();
        String line=userList.get(position).getDivider();

        holder.setdata(resourse,name,description,add,line);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
        private TextView divider;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview1);
            textView=itemView.findViewById(R.id.textview);
            textView2=itemView.findViewById(R.id.textview2);
           itemView.findViewById(R.id.textview2).setOnClickListener(view -> {

            });
            textView3=itemView.findViewById(R.id.textview3);
            divider=itemView.findViewById(R.id.divider);
        }

        public void setdata(int resourse, String name, String description, String add, String line) {
            imageView.setImageResource(resourse);
            textView.setText(name);
            textView3.setText(description);
            textView2.setText(add);
            divider.setText(line);
        }
    }
}
