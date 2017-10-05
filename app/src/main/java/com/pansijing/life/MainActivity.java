package com.pansijing.life;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.pansijing.life.bean.ColumnAndPerson;
import com.pansijing.life.discover.DiscoverFragment;
import com.pansijing.life.http.ColumnHttp;
import com.pansijing.life.http.RetrofitManager;
import com.pansijing.life.utils.DaoManager;

import java.util.List;

import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * @author: pighead
 * @time: 2017/9/16-下午9:35.
 * @desc:
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    DiscoverFragment mDiscoverFragment;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if (mDiscoverFragment.isAdded()) {
                        getFragmentManager().beginTransaction()
                                .replace(R.id.main_content, mDiscoverFragment)
                                .commit();
                    } else {
                        getFragmentManager().beginTransaction()
                                .add(R.id.main_content, mDiscoverFragment)
                                .commit();
                    }

                    return true;
                case R.id.navigation_dashboard:
                    getColumns();
                    return true;
                case R.id.navigation_notifications:
//                    List<DiscoverContent> data = new Select().from(DiscoverContent.class)
//                            .cursorList()
//                            .getAll();
                    return true;
            }
            return false;
        }
    };



    private void getColumns() {
        RetrofitManager.getRetrofit().create(ColumnHttp.class)
                .findNewColumns(10, 0)
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<List<ColumnAndPerson>>() {
                    @Override
                    public void accept(List<ColumnAndPerson> columnAndPeople) throws Exception {
                        for (ColumnAndPerson item : columnAndPeople) {
                            DaoManager.getColumnAndPersonDao().insert(item);
                        }
                        Log.e(TAG, "accept: zhiHuColumn-person");
                    }
                });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void initView() {
        mDiscoverFragment = new DiscoverFragment();

        getFragmentManager().beginTransaction()
                .add(R.id.main_content, mDiscoverFragment).commit();

    }

    private void initData() {
    }

}
