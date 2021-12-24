package com.example.dtiapplication;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DonguTour4 extends AppCompatActivity implements OnMapReadyCallback {
    private  FragmentManager fragmentManager;
    private  MapFragment mapFragment;

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dongu_tour4);

        Button button = findViewById(R.id.Backbutton);   //되돌아가기 버튼
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish(); // 화면 종료
            }
        });
        editText =findViewById(R.id.editText);

        Button callbutton = findViewById(R.id.callbutton);
        callbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:053-980-7900"));
                startActivity(intent);
            }
        });

        fragmentManager = getFragmentManager();      //구글맵 설정
        mapFragment = (MapFragment)fragmentManager.findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {  //구글맵 마커
        LatLng location = new LatLng(35.993253, 128.704160);       //위도경도 지정
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("동화사");
        markerOptions.position(location);
        googleMap.addMarker(markerOptions);   //생성한 마커 옵션 실행
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,16)); //줌 설정

    }
}
