package com.example.wisatabandung;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ListViewHolder> {

    private ArrayList<model> listWst;

    public ListWisataAdapter(ArrayList<model> list){
        this.listWst = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder Holder, int position) {
        final model mmodel = listWst.get(position);

        Glide.with(Holder.itemView.getContext())
                .load(mmodel.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(Holder.Foto);

        Holder.Nama.setText(mmodel.getNama());
        Holder.Detail.setText(mmodel.getDetail());

        Holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("foto", mmodel.getFoto());
                intent.putExtra("nama", mmodel.getNama());
                intent.putExtra("detail", mmodel.getDetail());
                Holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWst.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView Foto;
        TextView Nama, Detail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            Foto = itemView.findViewById(R.id.Imgfoto);
            Nama = itemView.findViewById(R.id.tvNama);
            Detail = itemView.findViewById(R.id.tvDetail);
        }
    }
}
