package com.example.android.tabbedpages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create the pager adapter and specify which method to control it
        ViewPager pager = findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    /**
     * Method for the pager adapter
     */
    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * The switch statement that provides which fragment to switch to when swiping across
         * views in the app
         *
         * @param pos
         * @return
         */
        @Override
        public Fragment getItem(int pos) {
            switch (pos) {
                case 0:
                    return FirstFragment.newInstance("FirstFragment");
                case 1:
                    return SecondFragment.newInstance("SecondFragment");
                default:
                    return SecondFragment.newInstance("Default");
            }
        }

        /**
         * Method that returns how many pages there will be
         *
         * @return
         */
        @Override
        public int getCount() {
            return 2;
        }
    }
}