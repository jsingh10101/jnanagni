package cse.fet.gurukul.Technical;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import cse.fet.gurukul.EventDetail1.ItemClickListner;
import cse.fet.gurukul.R;
import cse.fet.gurukul.TechActivity;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class TechnicalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    public ImageView ImgIcon;
    public TextView txttitle;
    public TextView txtsummary;
    private ItemClickListner itemClickListner;

    public TechnicalViewHolder(@NonNull View itemView) {
        super(itemView);


        txttitle = itemView.findViewById(R.id.Technical_title);
        ImgIcon = itemView.findViewById(R.id.Technical_image);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }

    @Override
    public void onClick(View v) {
        itemClickListner.onClick(v, getAdapterPosition(), false);

    }

    @Override
    public boolean onLongClick(View v) {
        itemClickListner.onClick(v, getAdapterPosition(), false);
        return true;
    }
}


public class TechnicalAdapter extends RecyclerView.Adapter<TechnicalViewHolder> {

    private ArrayList<Technical> technicals;
    private Context c;

    public TechnicalAdapter(Context c, ArrayList<Technical> technicals) {
        this.technicals = technicals;
        this.c = c;
    }

    @NonNull
    @Override
    public TechnicalViewHolder onCreateViewHolder(@NonNull ViewGroup Parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(Parent.getContext());
        View view = inflater.inflate(R.layout.technical_item_layout, Parent, false);
        return new TechnicalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TechnicalViewHolder holder, int position) {
        final Technical s = technicals.get(position);

        holder.txttitle.setText(s.getTitle());
        holder.ImgIcon.setImageResource(s.getImage());

        holder.setItemClickListner(new ItemClickListner() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {


                Intent i = new Intent(c, TechActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("image", s.getImage());
                i.putExtras(bundle);

                i.putExtra("summary", s.getSummary());
                i.putExtra("code", s.getCode());
                i.putExtra("name", s.getTitle());
                c.startActivity(i);


            }
        });

    }

    @Override
    public int getItemCount() {
        return technicals.size();
    }
}