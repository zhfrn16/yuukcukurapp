package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Model.GetBarber;

public class BabershopAdapter extends RecyclerView.Adapter<BabershopAdapter.BabershopViewHolder> {

    private final Context context;
    private final List<GetBarber> barberList;


    //konstruktor
    public BabershopAdapter(Context context , List<GetBarber> barberList){
        this.context = context;
        this.barberList = barberList;
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

        final GetBarber getBarber = barberList.get(position);

        Integer id_barber = getBarber.getIdBarber();
        String nama_barber = getBarber.getNamaBarber();
        String status = getBarber.getStatus();


        holder.tvNama.setText(nama_barber);
        holder.tvDetail.setText(status);

//        Glide.with(holder.itemView.getContext())
//                .load(gambar_fitnes)
//                .apply(new RequestOptions().fitCenter())
//                .into(holder.gambar_fitnes);

        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),BarberMenu.class);
//                intent.putExtra("GetBarber", (Parcelable) getBarber);
                holder.itemView.getContext().startActivity(intent);

            }
        });


    }


    @Override
    public int getItemCount() {
        return barberList.size();
    }

    public class BabershopViewHolder extends RecyclerView.ViewHolder {

        TextView tvNama, tvDetail;

        public BabershopViewHolder (View itemView){
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvDetail = itemView.findViewById(R.id.tvDetail);


        }
    }


}
