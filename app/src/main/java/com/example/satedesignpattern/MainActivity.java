package com.example.satedesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.satedesignpattern.productorder.delivery.PackageDelivery;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PackageDelivery packageDelivery= new PackageDelivery(null,"1112-1111-21222");
        packageDelivery.update();
        packageDelivery.update();
        packageDelivery.update();
        packageDelivery.update();
        packageDelivery.update();
    }
}
