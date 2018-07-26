package com.viviannecristina.santanderproject.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.viviannecristina.santanderproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InvestimentoFragment extends Fragment {

    private Toolbar toolbar;
    private TextView title;

    public InvestimentoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_investimento, container, false);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        TextView text = (TextView) view.findViewById(R.id.title);


        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_investimento, container, false);
    }
}
