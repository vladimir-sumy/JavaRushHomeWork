package com.javarush.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


/**
 * Created by KartoFan on 27.07.2016.
 */
public class testMySkills
{

    public static void main(String[] args)
    {
        System.out.println("Вызов Метода1");
        method1();

    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;


    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }

    public static StackTraceElement[] method5() {
//        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements;
    }


}
