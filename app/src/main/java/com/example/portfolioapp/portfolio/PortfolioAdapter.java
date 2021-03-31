package com.example.portfolioapp.portfolio;

import android.text.style.AlignmentSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolioapp.R;

import java.util.List;

public class PortfolioAdapter extends RecyclerView.Adapter<PortfolioAdapter.PortfolioViewHolder> {

    List<PortfolioItem> mdata;
    PortfolioCallback listener;

    public PortfolioAdapter(List<PortfolioItem> mdata, PortfolioCallback listener) {

        this.mdata = mdata;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PortfolioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_portfolio,parent,false);
        return new PortfolioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PortfolioViewHolder holder, int position) {
        holder.tvPosition.setText(String.valueOf(position));

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class PortfolioViewHolder extends RecyclerView.ViewHolder{

        TextView tvPosition;


        public PortfolioViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPosition  = itemView.findViewById(R.id.item_portfoliotext);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onPortfolioItemClick(getAdapterPosition());
                }
            });

        }
    }
}
