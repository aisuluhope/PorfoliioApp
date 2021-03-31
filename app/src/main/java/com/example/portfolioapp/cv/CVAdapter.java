package com.example.portfolioapp.cv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolioapp.R;

import java.util.List;

public class CVAdapter  extends RecyclerView.Adapter<CVAdapter.CVViewHolder> {

    List<CVitems> mdata;

    public CVAdapter(List<CVitems> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public CVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_cv, parent, false);

        return new CVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CVViewHolder holder, int position) {
        holder.cvTitle.setText(mdata.get(position).getTitle());
        holder.cvDescription.setText(mdata.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class CVViewHolder extends RecyclerView.ViewHolder{
        TextView cvTitle, cvDescription;
        public CVViewHolder(@NonNull View itemView) {
            super(itemView);
            cvTitle = itemView.findViewById(R.id.cvtitle);
            cvDescription = itemView.findViewById(R.id.cvdes);
        }
    }
}
