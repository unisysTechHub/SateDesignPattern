package com.example.satedesignpattern.productorder.delivery;

import android.util.Log;

import com.example.satedesignpattern.productorder.orderr.PackageSate;

public class PackageDelivered implements PackageSate {
    @Override
    public void updateSate(PackageDelivery packageDelivery) {
        Log.d("@Ramesh", "Package Has been deliviered");
    }
}
