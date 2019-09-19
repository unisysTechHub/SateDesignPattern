package com.example.satedesignpattern.productorder.intransittion;

import android.util.Log;

import com.example.satedesignpattern.productorder.delivery.OutForDelivery;
import com.example.satedesignpattern.productorder.delivery.PackageDelivery;
import com.example.satedesignpattern.productorder.orderr.PackageSate;

public class InTransint implements PackageSate {
     String currentLocation;
    @Override
    public void updateSate(PackageDelivery packageDelivery) {
        Log.d("@Ramesh", "Package in Transient");
        packageDelivery.setPackageSate(new OutForDelivery());
    }
}
