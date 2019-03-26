package com.example.smashapi.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.example.smashapi.R;
import com.example.smashapi.model.Fighters;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    RequestOptions options ;
    private Context mContext ;
    private List<Fighters> mData ;


    public RecyclerViewAdapter(Context mContext, List lst) {


        this.mContext = mContext;
        this.mData = lst;
        options = new RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.loading_shape)
                .error(R.drawable.loading_shape);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.smash_row_item,parent,false);
        // click listener here
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holders, int position) {



        holder.tvserie.setText(mData.get(position).getName());
        holder.tv_firstApp.setText(mData.get(position).getFirstApparition());
        holder.tvChDescription.setText(mData.get(position).getCharacterDescription());
        holder.tvskillName.setText(mData.get(position).getSkillName());

    }




    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvserie,tv_firstApp,tvChDescription,tvskillName, tvdescription, tvImageToURL ,tvimageToUrlCh , tvimagetoSkills, tvname;
        ImageView AnimeThumbnail;


        public MyViewHolder(View itemView) {
            super(itemView);

            tvname= itemView.findViewById(R.id.name);
            tvimageToUrlCh = itemView.findViewById(R.id.ImageToUrlCh);

        }
    }


}


