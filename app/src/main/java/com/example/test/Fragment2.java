package com.example.test;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
<<<<<<< HEAD

import java.util.ArrayList;

public class Fragment2 extends Fragment {
=======
>>>>>>> a99d49e8bd8495db773436717a0b29f37caae58e

import java.util.ArrayList;

public class Fragment2 extends Fragment {

    Button addButton;



    private View view;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_2,container,false);

        return view;
    }



}

<<<<<<< HEAD






=======
>>>>>>> a99d49e8bd8495db773436717a0b29f37caae58e
