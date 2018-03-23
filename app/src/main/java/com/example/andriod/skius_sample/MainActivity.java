package com.example.andriod.skius_sample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.andriod.skius_sample.Community.communityFragment;
import com.example.andriod.skius_sample.Control.controlFragment;
import com.example.andriod.skius_sample.Mypage.mypageFragment;
import com.example.andriod.skius_sample.Shop.shopFragment;
import com.example.andriod.skius_sample.SnowTrack.snowtrackFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_community:
                    replaceFragment(communityFragment.newInstance());
                    return true;
                case R.id.navigation_control:
                    replaceFragment(controlFragment.newInstance());
                    return true;
                case R.id.navigation_snowtrack:
                    replaceFragment(snowtrackFragment.newInstance());
                    return true;
                case R.id.navigation_shop:
                    replaceFragment(shopFragment.newInstance());
                    return true;
                case R.id.navigation_mypage:
                    replaceFragment(mypageFragment.newInstance());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_fragment_container, fragment).commit();
    }

}
