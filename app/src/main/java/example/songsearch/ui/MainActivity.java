package example.songsearch.ui;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import example.songsearch.Constants;
import example.songsearch.R;
import example.songsearch.helper.adapter.ArtistAdapter;
import example.songsearch.helper.adapter.ArtistAdapterListener;
import example.songsearch.helper.dataModel.ArtistDetail;
import example.songsearch.helper.retrofitImplementation.RetrofitInterface;
import example.songsearch.helper.retrofitImplementation.SearchDataModel.ITuneResponseModel;
import example.songsearch.helper.retrofitImplementation.SearchDataModel.ITuneResult;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SearchView searchView;
    ArrayList<ArtistDetail> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        mList  = new ArrayList<ArtistDetail>();

        handleIntent(getIntent());
        rv.addOnItemTouchListener(new ArtistAdapterListener(getApplicationContext(), rv, new ArtistAdapterListener.RecyclerTouchListener() {
            @Override
            public void onClickItem(View v, int position) {
                Intent in = new Intent(MainActivity.this,TrackDetails.class);
                in.putExtra("parcel", (Parcelable) mList.get(position));
                startActivity(in);
            }

            @Override
            public void onLongClickItem(View v, int position) {

            }
        }));
    }

    public void getResults(String query){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitInterface service = retrofit.create(RetrofitInterface.class);
        Call<ITuneResponseModel> call2 = service.getData1(Constants.BASE_URL + "search?term="+query);
        call2.enqueue(new Callback<ITuneResponseModel>() {
            @Override
            public void onResponse(Call<ITuneResponseModel> call, Response<ITuneResponseModel> response) {
                if (response.isSuccessful()){

                    ArrayList<ITuneResult> list = response.body().getmITuneResult();
                    for (int i=0;i<list.size();i++){
                        ArtistDetail d = new ArtistDetail(list.get(i).getmTrackName(),
                                list.get(i).getmArtistName(),list.get(i).getmPrimaryGenre(),
                                list.get(i).getmTrackTime(),list.get(i).getmTrackPrice(),
                                list.get(i).getmArtworkUrl100());
                        mList.add(d);
                    }
                    ArtistAdapter artistAdapter = new ArtistAdapter(mList,getApplicationContext());
                    rv.setAdapter(artistAdapter);
                }
            }

            @Override
            public void onFailure(Call<ITuneResponseModel> call, Throwable t) {

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.menu_search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));

        return true;
    }

    @Override
    protected void onNewIntent(Intent intent) {
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            //use the query to search

            getResults(modifiedQuery(query));
        }
    }
    private String modifiedQuery(String query){
        String modify = query.trim();
        String []array = modify.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<array.length-1;i++){
            builder.append(array[i]);
            builder.append("+");
        }
        builder.append(array[array.length-1]);
        return builder.toString();
    }
}
