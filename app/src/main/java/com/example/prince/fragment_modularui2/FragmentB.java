package com.example.prince.fragment_modularui2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Prince on 04-07-2017.
 */

public class FragmentB extends Fragment {
TextView t;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        t= (TextView) getActivity().findViewById(R.id.textView);
        return inflater.inflate(R.layout.fragment_b, container, false);
    }
    public void clickclick(int s){

        String[] ss=getResources().getStringArray(R.array.descr);

        t.setText(ss[s]);
    }
}
