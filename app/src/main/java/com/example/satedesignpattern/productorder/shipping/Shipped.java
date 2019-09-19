package com.example.satedesignpattern.productorder.shipping;

import android.util.Log;

import com.example.satedesignpattern.productorder.delivery.PackageDelivery;
import com.example.satedesignpattern.productorder.intransittion.InTransint;
import com.example.satedesignpattern.productorder.orderr.PackageSate;

public class Shipped implements PackageSate {
     String ShippinngAddress;

    @Override
    public void updateSate(PackageDelivery packageDelivery) {

        packageDelivery.setPackageSate(new InTransint());
        Log.d("@Ramesh", "Package has been Shipped");
    }
}
