package ex10;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */

public class Checkout {

    public static void main(String[] args){

        App input = new App();
        input.myInput();
        Math math = new Math();
        math.mySubtotal(input.price, input.quant, input.items);
        math.myTax(math.subtotal);
        math.myTotal(math.subtotal, math.tax);

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", math.subtotal, math.tax, math.total);
    }
}


