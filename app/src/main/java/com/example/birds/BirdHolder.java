package com.example.birds;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BirdHolder extends RecyclerView.ViewHolder {
    private TextView tvname;
    private ImageView ivbird;
    private RelativeLayout recycle;
    private ClickListener clickListener;


    public BirdHolder(@NonNull View itemView, ClickListener clickListener) {
        super(itemView);
        this.clickListener=clickListener;
        init(itemView);
    }

    private void init(View itemView){
        tvname=itemView.findViewById(R.id.tvName);
        ivbird=itemView.findViewById(R.id.ivBirdImg);
        recycle=itemView.findViewById(R.id.relative);

    }
    public void setData(BirdModel model){
        ivbird.setImageResource(model.getImage());
        tvname.setText(model.getName());
        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             clickListener.onitemclicked(model,getAdapterPosition());
            }
        });
    }
}
