package com.pansijing.life;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.pansijing.life.bean.ColumnAndPerson;
import com.pansijing.life.bean.DiscoverContent;
import com.pansijing.life.http.ColumnHttp;
import com.pansijing.life.http.RetrofitManager;

import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;


/**
 * @author: pighead
 * @time: 2017/9/16-下午9:35.
 * @desc:
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_discover);
                    getCookies();
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_column);
                    getColumns();
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_collection);
                    return true;
            }
            return false;
        }
    };

    private void getCookies() {
        RetrofitManager.getRetrofit().create(ColumnHttp.class)
                .findNewContent(10, 0)
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<List<DiscoverContent>>() {
                    @Override
                    public void accept(List<DiscoverContent> discoverContents) throws Exception {
                        Log.e(TAG, "accept: ");
                    }
                });
    }

    private void getColumns() {
        RetrofitManager.getRetrofit().create(ColumnHttp.class)
                .findNewColumns(10, 0)
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<List<ColumnAndPerson>>() {
                    @Override
                    public void accept(List<ColumnAndPerson> columnAndPeople) throws Exception {
                        Log.e(TAG, "accept: column-person");
                    }
                });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
