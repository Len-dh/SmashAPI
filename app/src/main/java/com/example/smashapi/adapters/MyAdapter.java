package com.example.smashapi.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smashapi.R;
import com.example.smashapi.model.Fighters;
import com.example.smashapi.model.OnClickListener;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Fighters> values;
    private OnClickListener listener;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvname;
        public ImageView tvimageToUrlCh;
        public View layout;

        public MyViewHolder(View view) {
            super(view);
            layout = view;
            tvname= view.findViewById(R.id.name);
            tvimageToUrlCh = view.findViewById(R.id.imToUrlCh);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<Fighters> myDataset, OnClickListener listener) {
        this.listener = listener;
        values = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.smash_row_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final Fighters fighters = values.get(position);
        holder.tvname.setText(fighters.getName());
        holder.tvname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClickListener(fighters);
            }
        });

        Picasso.get().load(values.get(position).getImageToUrl()).resize(250,100).into(holder.tvimageToUrlCh);

        holder.tvimageToUrlCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClickListener(fighters);
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}