package example.songsearch.helper.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

import example.songsearch.R;
import example.songsearch.helper.dataModel.ArtistDetail;

/**
 * Created by abhishek on 13/7/17.
 */

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.MyViewHolder>  {

    private ArrayList<ArtistDetail> mList;
    private Context mContext;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTrackName;
        public TextView mArtistName;
        public TextView mGenre;
        public TextView mDuration;
        public TextView mPrice;
        public ImageView mCoverImage;

        public MyViewHolder(View view) {
            super(view);
            mTrackName = (TextView)view.findViewById(R.id.text_track_name);
            mArtistName = (TextView)view.findViewById(R.id.text_artist_name);
            mGenre = (TextView)view.findViewById(R.id.text_genre);
            mDuration = (TextView)view.findViewById(R.id.text_duration);
            mPrice = (TextView)view.findViewById(R.id.text_price);
            mCoverImage = (ImageView)view.findViewById(R.id.image_card);
        }
    }

    public ArtistAdapter(ArrayList<ArtistDetail> mList, Context context) {
        this.mList = mList;
        this.mContext = context;
    }

    @Override
    public ArtistAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_design,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ArtistAdapter.MyViewHolder holder, int position) {
        Picasso.with(mContext)
                .load(mList.get(position).getmArtWorkImageurl())
                .into(holder.mCoverImage);
        holder.mTrackName.setText(mList.get(position).getmTrackName());
        holder.mArtistName.setText(mList.get(position).getmArtistName());
        holder.mDuration.setText(mList.get(position).getmDuration());
        holder.mPrice.setText("$ "+mList.get(position).getmPrice());
        holder.mGenre.setText(mList.get(position).getmGenre());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
