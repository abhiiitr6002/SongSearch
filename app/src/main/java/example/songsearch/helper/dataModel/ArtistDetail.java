package example.songsearch.helper.dataModel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by abhishek on 13/7/17.
 */

public class ArtistDetail implements Parcelable{
    private String mTrackName;
    private String mArtistName;
    private String mGenre;
    private String mDuration;
    private String mPrice;
    private String mArtWorkImageurl;

    public ArtistDetail(String mTrackName, String mArtistName, String mGenre,
                        String mDuration, String mPrice, String mArtWorkImageurl) {
        this.mTrackName = mTrackName;
        this.mArtistName = mArtistName;
        this.mGenre = mGenre;
        this.mDuration = mDuration;
        this.mPrice = mPrice;
        this.mArtWorkImageurl = mArtWorkImageurl;
    }

    public ArtistDetail(Parcel in){
        String[] data = new String[6];

        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        this.mTrackName = data[0];
        this.mArtistName = data[1];
        this.mGenre = data[2];
        this.mDuration = data[3];
        this.mPrice = data[4];
        this.mArtWorkImageurl = data[5];
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[] {this.mTrackName,
                this.mArtistName,
                this.mGenre,
                this.mDuration,
                this.mPrice,
                this.mArtWorkImageurl});
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public ArtistDetail createFromParcel(Parcel in) {
            return new ArtistDetail(in);
        }

        public ArtistDetail[] newArray(int size) {
            return new ArtistDetail[size];
        }
    };

    public String getmTrackName() {
        return mTrackName;
    }

    public void setmTrackName(String mTrackName) {
        this.mTrackName = mTrackName;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public void setmArtistName(String mArtistName) {
        this.mArtistName = mArtistName;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmDuration() {
        return mDuration;
    }

    public void setmDuration(String mDuration) {
        this.mDuration = mDuration;
    }

    public String getmPrice() {
        return mPrice;
    }

    public void setmPrice(String mPrice) {
        this.mPrice = mPrice;
    }

    public String getmArtWorkImageurl() {
        return mArtWorkImageurl;
    }

    public void setmArtWorkImageurl(String mArtWorkImageurl) {
        this.mArtWorkImageurl = mArtWorkImageurl;
    }


    @Override
    public int describeContents() {
        return 0;
    }


}
