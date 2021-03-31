package com.example.portfolioapp.books;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolioapp.R;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    List<BookItems> mdata;

    public BookAdapter(List<BookItems> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_book,parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {

        holder.book_name.setText(mdata.get(position).getTitle());
        holder.book_des.setText(mdata.get(position).getDescription());
        holder.image.setImageResource(mdata.get(position).getImage());



    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder{
        TextView book_name, book_des;
        ImageView image;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

            book_name =  itemView.findViewById(R.id.book_title);
            book_des = itemView.findViewById(R.id.description_book);
            image = itemView.findViewById(R.id.book_img);
        }
    }
}
