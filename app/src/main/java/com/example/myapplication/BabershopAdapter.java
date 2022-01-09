package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BabershopAdapter extends RecyclerView.Adapter<BabershopAdapter.BabershopViewHolder> implements View.OnClickListener{

    private ArrayList<Babershop> ListBabershop = new ArrayList<>();

    public BabershopAdapter(ArrayList<Babershop> listBabershop) {
        this.ListBabershop = listBabershop;
    }

    @NonNull
    @Override
    public BabershopAdapter.BabershopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemlistbaber, parent, false);
        return new BabershopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BabershopAdapter.BabershopViewHolder holder, int position) {

        holder.tvNama.setText(ListBabershop.get(position).getNama());
        holder.tvDetail.setText(ListBabershop.get(position).getDetail());

    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick();
        }
    }


    //onclicklistener
    OnBarberHolderClickListener listener = null;

    public interface OnBarberHolderClickListener{
        void onClick();
    }

    public void setListener(OnBarberHolderClickListener listener) {
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        return (ListBabershop!=null) ? ListBabershop.size() : 0;
    }

    public class BabershopViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvNama, tvDetail;

        public BabershopViewHolder (View view){
            super(view);
            tvNama = view.findViewById(R.id.tvNama);
            tvDetail = view.findViewById(R.id.tvDetail);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "berhasil",
                    Toast.LENGTH_SHORT).show();
        }
    }


}
