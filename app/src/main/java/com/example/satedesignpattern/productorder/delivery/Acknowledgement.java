package com.example.satedesignpattern.productorder.delivery;

import android.util.Log;

import com.example.satedesignpattern.productorder.orderr.PackageSate;
import com.example.satedesignpattern.productorder.shipping.Shipped;

public class Acknowledgement implements PackageSate {
     public  static String TAG= "@Ramesh";
    @Override
    public void updateSate(PackageDelivery packageDelivery) {
        Log.d(TAG, "Acknowledgment sent" );
        packageDelivery.setPackageSate(new Shipped());
    }
}
