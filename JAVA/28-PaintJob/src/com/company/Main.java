package com.company;

public class Main {

    public static void main(String[] args) {
        getBucketCount(-3.4, 2.1,1.5,2);
        getBucketCount(3.4, 2.1,1.5,2);
        getBucketCount(2.75, 3.25,2.5,1);
        System.out.println("");
        getBucketCount(-3.4, 2.1, 1.5);
        getBucketCount(3.4, 2.1, 1.5);
        getBucketCount(7.25, 4.3, 2.35);
        System.out.println("");
        getBucketCount(3.4, 1.5);
        getBucketCount(6.26, 2.2);
        getBucketCount(3.26, 0.75);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int bucketsToBuy = 0;
        double area = 0;
        double paintBucketsNeeded;

        if((width>0.0)&&(height>0.0)&&(areaPerBucket>0.0)&&(extraBuckets>0)){
            area = width * height;
            paintBucketsNeeded = area/areaPerBucket;
            bucketsToBuy = (int)Math.ceil(paintBucketsNeeded-extraBuckets);
            System.out.println("Number of paint buckets to buy is "+bucketsToBuy);
        }else {
            System.out.println("invalid value");
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        int bucketsToBuy=0;
        double area =0;
        if((width>0)&&(height>0)&&(areaPerBucket>0)){
            area = width * height;
            bucketsToBuy = (int)Math.ceil(area/areaPerBucket);
            System.out.println("Number of paint buckets to buy is "+bucketsToBuy);
        }else {
            System.out.println("invalid value");
        }
        return -1;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        int bucketsToBuy=0;
        if((area>0)&&(areaPerBucket>0)){
            bucketsToBuy = (int)Math.ceil(area/areaPerBucket);
            System.out.println("Number of paint buckets to buy is "+bucketsToBuy);
        }else {
            System.out.println("invalid value");
        }
        return -1;
    }
}
