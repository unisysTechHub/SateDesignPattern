package com.example.satedesignpattern.productorder.delivery;

import com.example.satedesignpattern.productorder.orderr.PackageSate;

public class PackageDelivery {
    PackageSate packageSate;
    String PackageId;
    public PackageDelivery(PackageSate packageSate, String packageId ){
            this.packageSate=packageSate;
            this.PackageId=packageId;
            if(packageSate == null)
                this.packageSate= new Acknowledgement();

     }

    public PackageSate getPackageSate() {
        return packageSate;
    }

    public void setPackageSate(PackageSate packageSate) {
        this.packageSate = packageSate;
    }

    public String getPackageId() {
        return PackageId;
    }

    public void setPackageId(String packageId) {
        PackageId = packageId;
    }


    public void update()
    {
        this.packageSate.updateSate(this);

    }
}
