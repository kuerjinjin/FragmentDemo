package com.cyou.kenny.fragmentdemo;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by kenny on 2015/11/12.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class TitleFragment extends Fragment {
    private ImageButton imageButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.titlefragment, container, false);

        imageButton = (ImageButton) view.findViewById(R.id.title_left_btn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Hi,I am kenny!",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
