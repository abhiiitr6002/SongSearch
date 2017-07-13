package example.songsearch.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import example.songsearch.R;
import example.songsearch.helper.adapter.ArtistAdapter;
import example.songsearch.helper.dataModel.ArtistDetail;

public class TrackDetails extends AppCompatActivity {

    public TextView mTrackName;
    public TextView mArtistName;
    public TextView mGenre;
    public TextView mDuration;
    public TextView mPrice;
    public ImageView mCoverImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_details);
        Bundle data = getIntent().getExtras();

        mTrackName = (TextView)findViewById(R.id.text_track_name);
        mArtistName = (TextView)findViewById(R.id.text_artist_name);
        mGenre = (TextView)findViewById(R.id.text_genre);
        mDuration = (TextView)findViewById(R.id.text_duration);
        mPrice = (TextView)findViewById(R.id.text_price);
        mCoverImage = (ImageView)findViewById(R.id.image_artist);
        if (data!=null) {
            ArtistDetail artist = (ArtistDetail) data.getParcelable("parcel");
            Picasso.with(getApplicationContext())
                    .load(artist.getmArtWorkImageurl())
                    .into(mCoverImage);
            mTrackName.setText(artist.getmTrackName());
            mArtistName.setText(artist.getmArtistName());
            int duration = Integer.parseInt(artist.getmDuration())/1000;
            mDuration.setText(duration+" sec");
            mGenre.setText("Genre : "+artist.getmGenre());
            mPrice.setText("$ "+artist.getmPrice());
        }
    }
}
