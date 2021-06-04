package ex10;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */

public class Math {
    double subtotal;
    double tax;
    double total;

    public void mySubtotal(float[] price, int[] quant, int items){

        double[] a = new double[items];
        for(int i = 0; i < items; i++) {
            a[i] = price[i] * quant[i];
        }

        this.subtotal = a[0];
        for(int i = 1; i < items; i++) {
            this.subtotal = this.subtotal + a[i];
        }
    }

    public void myTax(double subtotal){

        this.tax = subtotal * 0.055;
    }

    public void myTotal(double subtotal, double tax){

        this.total = subtotal + tax;
    }
}
