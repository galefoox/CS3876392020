package com.example.asynctaskproject.ui.main;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;

import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asynctaskproject.ImageDownloader;
import com.example.asynctaskproject.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance()
    {
        return new MainFragment();
    }

    String web_link = "https://cdn.vox-cdn.com/thumbor/-9R2vwfc7bBnrkcxkuM9PqsBiQ4=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19542759/170929_07_02_44_5DSR0571.jpg";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.main_fragment, container, false);

        ImageView remote_image = (ImageView) root.findViewById(R.id.remote_image);

        ImageDownloader async_task = new ImageDownloader(this.getActivity());
        async_task.execute(web_link);

        return root;
    }



}