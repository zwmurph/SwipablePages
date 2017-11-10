package com.example.android.tabbedpages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Class that controls the creation of the first fragment
 */
public class FirstFragment extends Fragment {

    public static FirstFragment newInstance(String text) {
        FirstFragment f = new FirstFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_frag, container, false);
        return v;
    }
}