package com.qianphone.javasedemo.oop;

/**
 * Created by Admin on 2017/1/4.
 */
public class TestPlane {
    public static void main(String [] args){
        MyPlane  plane = new MyPlane(100);
//        Plane plane = new MyPlane(100);
        //用父类的引用指向子类的对象，是多态的表现形式之一
//        Plane p = new SmallEnemyPlane();
//        p = new MiddleEnemyPlane();
//        p = new MyPlane(100);
        plane.clearScreen();
        plane.shoot();
        System.out.println("plane.liveValue = "+plane.liveValue);

    }
}
