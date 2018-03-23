package com.example.andriod.skius_sample.Community;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andriod.skius_sample.R;

/**
 * Created by Nick0917 on 2018-03-22.
 */

public class communityFragment extends Fragment {

    public static communityFragment newInstance() {
        return new communityFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.community_fragment, container, false); // 여기서 UI를 생성해서 View를 return
    }


}
