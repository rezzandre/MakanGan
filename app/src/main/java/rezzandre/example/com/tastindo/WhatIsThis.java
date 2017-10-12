package rezzandre.example.com.tastindo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sam on 10/12/2017.
 */

public class WhatIsThis extends RecyclerView.Adapter<WhatIsThis.Holder> {

    Context context;

    public WhatIsThis(Context context, List<Item> item) {
        this.context = context;
        this.item = item;
    }

    List<Item> item;

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, null);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {
        holder.txtJudul.setText(item.get(position).getJudul());
        holder.txtDeskripsi.setText(item.get(position).getDeskripsi());

        holder.cardItemResep.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i= new Intent(v.getContext(), DetailActivity.class);
                i.putExtra("id_judul", item.get(position).getJudul());
                i.putExtra("id_desc", item.get(position).getDeskripsi());
                v.getContext().startActivity(i);
            }

        });

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        CardView cardItemResep;
        ImageView imgImage;
        TextView txtJudul, txtDeskripsi;

        public Holder(View itemView) {
            super(itemView);
            cardItemResep = (CardView) itemView.findViewById(R.id.card_item);
            imgImage = (ImageView)itemView.findViewById(R.id.img_detail_image);
            txtJudul = (TextView)itemView.findViewById(R.id.txt_detail_judul);
            txtDeskripsi = (TextView)itemView.findViewById(R.id.txt_detail_deskripi);

        }
    }
}
