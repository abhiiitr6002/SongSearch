package example.songsearch.helper.retrofitImplementation.SearchDataModel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abhishek on 12/7/17.
 */

public class ITuneResult {

    @SerializedName("wrapperType")
    private String mWrapperType;

    @SerializedName("kind")
    private String mKind;

    @SerializedName("artistId")
    private String mArtistId;

    @SerializedName("collectionId")
    private String mCollectionId;

    @SerializedName("trackId")
    private String mTrackId;

    @SerializedName("artistName")
    private String mArtistName;

    @SerializedName("collectionName")
    private String mCollectionName;

    @SerializedName("trackName")
    private String mTrackName;

    @SerializedName("collectionCensoredName")
    private String mCollectionCensoredName;

    @SerializedName("trackCensoredName")
    private String mTrackCensoredName;

    @SerializedName("artworkUrl60")
    private String mArtWorkUrl60;

    @SerializedName("artworkUrl100")
    private String mArtworkUrl100;

    @SerializedName("collectionPrice")
    private String mCollectionPrice;

    @SerializedName("trackPrice")
    private String mTrackPrice;

    @SerializedName("collectionExplicitness")
    private String mCollectionExplicitness;

    @SerializedName("trackExplicitness")
    private String mTrackExplicitness;

    @SerializedName("discCount")
    private String mDiscCount;

    @SerializedName("discNumber")
    private String mDiscNumber;

    @SerializedName("trackCount")
    private String mTrackCount;

    @SerializedName("trackTimeMillis")
    private String mTrackTime;

    @SerializedName("country")
    private String mCountry;

    @SerializedName("currency")
    private String mCurrency;

    @SerializedName("primaryGenreName")
    private String mPrimaryGenre;

    public ITuneResult(String mWrapperType, String mKind, String mArtistId,
                       String mCollectionId, String mTrackId, String mArtistName,
                       String mCollectionName, String mTrackName, String mCollectionCensoredName,
                       String mTrackCensoredName, String mArtWorkUrl60, String mArtworkUrl100,
                       String mCollectionPrice, String mTrackPrice, String mCollectionExplicitness,
                       String mTrackExplicitness, String mDiscCount, String mDiscNumber, String mTrackCount,
                       String mTrackTime, String mCountry, String mCurrency, String mPrimaryGenre) {
        this.mWrapperType = mWrapperType;
        this.mKind = mKind;
        this.mArtistId = mArtistId;
        this.mCollectionId = mCollectionId;
        this.mTrackId = mTrackId;
        this.mArtistName = mArtistName;
        this.mCollectionName = mCollectionName;
        this.mTrackName = mTrackName;
        this.mCollectionCensoredName = mCollectionCensoredName;
        this.mTrackCensoredName = mTrackCensoredName;
        this.mArtWorkUrl60 = mArtWorkUrl60;
        this.mArtworkUrl100 = mArtworkUrl100;
        this.mCollectionPrice = mCollectionPrice;
        this.mTrackPrice = mTrackPrice;
        this.mCollectionExplicitness = mCollectionExplicitness;
        this.mTrackExplicitness = mTrackExplicitness;
        this.mDiscCount = mDiscCount;
        this.mDiscNumber = mDiscNumber;
        this.mTrackCount = mTrackCount;
        this.mTrackTime = mTrackTime;
        this.mCountry = mCountry;
        this.mCurrency = mCurrency;
        this.mPrimaryGenre = mPrimaryGenre;
    }

    public String getmWrapperType() {
        return mWrapperType;
    }

    public void setmWrapperType(String mWrapperType) {
        this.mWrapperType = mWrapperType;
    }

    public String getmArtworkUrl100() {
        return mArtworkUrl100;
    }

    public void setmArtworkUrl100(String mArtworkUrl100) {
        this.mArtworkUrl100 = mArtworkUrl100;
    }

    public String getmKind() {
        return mKind;
    }

    public void setmKind(String mKind) {
        this.mKind = mKind;
    }

    public String getmArtistId() {
        return mArtistId;
    }

    public void setmArtistId(String mArtistId) {
        this.mArtistId = mArtistId;
    }

    public String getmCollectionId() {
        return mCollectionId;
    }

    public void setmCollectionId(String mCollectionId) {
        this.mCollectionId = mCollectionId;
    }

    public String getmTrackId() {
        return mTrackId;
    }

    public void setmTrackId(String mTrackId) {
        this.mTrackId = mTrackId;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public void setmArtistName(String mArtistName) {
        this.mArtistName = mArtistName;
    }

    public String getmCollectionName() {
        return mCollectionName;
    }

    public void setmCollectionName(String mCollectionName) {
        this.mCollectionName = mCollectionName;
    }

    public String getmTrackName() {
        return mTrackName;
    }

    public void setmTrackName(String mTrackName) {
        this.mTrackName = mTrackName;
    }

    public String getmCollectionCensoredName() {
        return mCollectionCensoredName;
    }

    public void setmCollectionCensoredName(String mCollectionCensoredName) {
        this.mCollectionCensoredName = mCollectionCensoredName;
    }

    public String getmTrackCensoredName() {
        return mTrackCensoredName;
    }

    public void setmTrackCensoredName(String mTrackCensoredName) {
        this.mTrackCensoredName = mTrackCensoredName;
    }

    public String getmArtWorkUrl60() {
        return mArtWorkUrl60;
    }

    public void setmArtWorkUrl60(String mArtWorkUrl60) {
        this.mArtWorkUrl60 = mArtWorkUrl60;
    }

    public String getmCollectionPrice() {
        return mCollectionPrice;
    }

    public void setmCollectionPrice(String mCollectionPrice) {
        this.mCollectionPrice = mCollectionPrice;
    }

    public String getmTrackPrice() {
        return mTrackPrice;
    }

    public void setmTrackPrice(String mTrackPrice) {
        this.mTrackPrice = mTrackPrice;
    }

    public String getmCollectionExplicitness() {
        return mCollectionExplicitness;
    }

    public void setmCollectionExplicitness(String mCollectionExplicitness) {
        this.mCollectionExplicitness = mCollectionExplicitness;
    }

    public String getmTrackExplicitness() {
        return mTrackExplicitness;
    }

    public void setmTrackExplicitness(String mTrackExplicitness) {
        this.mTrackExplicitness = mTrackExplicitness;
    }

    public String getmDiscCount() {
        return mDiscCount;
    }

    public void setmDiscCount(String mDiscCount) {
        this.mDiscCount = mDiscCount;
    }

    public String getmDiscNumber() {
        return mDiscNumber;
    }

    public void setmDiscNumber(String mDiscNumber) {
        this.mDiscNumber = mDiscNumber;
    }

    public String getmTrackCount() {
        return mTrackCount;
    }

    public void setmTrackCount(String mTrackCount) {
        this.mTrackCount = mTrackCount;
    }

    public String getmTrackTime() {
        return mTrackTime;
    }

    public void setmTrackTime(String mTrackTime) {
        this.mTrackTime = mTrackTime;
    }

    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public String getmCurrency() {
        return mCurrency;
    }

    public void setmCurrency(String mCurrency) {
        this.mCurrency = mCurrency;
    }

    public String getmPrimaryGenre() {
        return mPrimaryGenre;
    }

    public void setmPrimaryGenre(String mPrimaryGenre) {
        this.mPrimaryGenre = mPrimaryGenre;
    }
}
