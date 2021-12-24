package com.example.dtiapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Dalseogu extends Fragment {

    ImageButton imagebutton;
    ImageButton imagebutton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dalseogu,container,false);

        imagebutton = (ImageButton) view.findViewById(R.id.imageButton);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),DalseoguTour1.class);  //프래그먼트에서 액티비티로 화면 전환을 해줄 때는 getActivity() 사용 getApplicationContext() X
                startActivity(intent);
            }
        });

        imagebutton2 = (ImageButton) view.findViewById(R.id.imageButton3);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),DalseoguTour2.class);  //프래그먼트에서 액티비티로 화면 전환을 해줄 때는 getActivity() 사용 getApplicationContext() X
                startActivity(intent);
            }
        });

        imageButton3 = (ImageButton) view.findViewById(R.id.imageButton5);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),DalseoguTour3.class);  //프래그먼트에서 액티비티로 화면 전환을 해줄 때는 getActivity() 사용 getApplicationContext() X
                startActivity(intent);
            }
        });

        imageButton4 = (ImageButton) view.findViewById(R.id.imageButton7);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),DalseoguTour4.class);  //프래그먼트에서 액티비티로 화면 전환을 해줄 때는 getActivity() 사용 getApplicationContext() X
                startActivity(intent);
            }
        });

        imageButton5 = (ImageButton) view.findViewById(R.id.imageButton9);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),DalseoguTour5.class);  //프래그먼트에서 액티비티로 화면 전환을 해줄 때는 getActivity() 사용 getApplicationContext() X
                startActivity(intent);
            }
        });

        return view;
    }
}
