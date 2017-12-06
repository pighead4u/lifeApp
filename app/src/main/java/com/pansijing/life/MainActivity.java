package com.pansijing.life;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.pansijing.life.discover.DiscoverFragment;

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
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

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
