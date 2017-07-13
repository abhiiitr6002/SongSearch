package example.songsearch.helper.retrofitImplementation;

import example.songsearch.helper.retrofitImplementation.SearchDataModel.ITuneResponseModel;
import retrofit2.Call;
import retrofit2.http.HTTP;
import retrofit2.http.Url;

/**
 * Created by abhishek on 12/7/17.
 */

public interface RetrofitInterface {

    @HTTP(method = "GET")
    Call<ITuneResponseModel> getData1(@Url String itune);
}
