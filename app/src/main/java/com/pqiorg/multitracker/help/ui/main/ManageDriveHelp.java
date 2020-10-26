package com.pqiorg.multitracker.help.ui.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.pqiorg.multitracker.R;
import com.synapse.Utility;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ManageDriveHelp extends Fragment {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_help_drive, container, false);
        ButterKnife.bind(this, view);


        return view;
    }

    @OnClick({
            R.id.screenshot_1,R.id.screenshot_2,
            R.id.screenshot_3,
            R.id.screenshot_4,
            R.id.screenshot_5,
            R.id.screenshot_6,
            R.id.screenshot_7,
            R.id.screenshot_8,


    })
    public void onClick(@NonNull View view) {
        if (view instanceof ImageView) {
            ImageView iv = (ImageView) view;
            Drawable myDrawable = iv.getDrawable();
            Utility.show_preview(getActivity(),myDrawable);
        }}

}