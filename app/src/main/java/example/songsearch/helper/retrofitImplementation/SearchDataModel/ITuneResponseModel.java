package example.songsearch.helper.retrofitImplementation.SearchDataModel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by abhishek on 12/7/17.
 */

public class ITuneResponseModel {
    @SerializedName("resultCount")
    private int mResultCount;

    @SerializedName("results")
    private ArrayList<ITuneResult> mITuneResult;

    public ITuneResponseModel(int mResultCount, ArrayList<ITuneResult> mITuneResult) {
        this.mResultCount = mResultCount;
        this.mITuneResult = mITuneResult;
    }

    public int getmResultCount() {
        return mResultCount;
    }

    public void setmResultCount(int mResultCount) {
        this.mResultCount = mResultCount;
    }

    public ArrayList<ITuneResult> getmITuneResult() {
        return mITuneResult;
    }

    public void setmITuneResult(ArrayList<ITuneResult> mITuneResult) {
        this.mITuneResult = mITuneResult;
    }
}
