package ex10;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class App {
    int items = 0;
    float[] price;
    int[] quant;

    public void myInput(){

        System.out.print("How many different items do you have: ");
        Scanner input = new Scanner(System.in);
        this.items = input.nextInt();

        this.price = new float[items];
        Scanner scanPrice = new Scanner(System.in);
        this.quant =  new int[items];
        Scanner scanAmount = new Scanner((System.in));

        for(int i = 0; i < items; i++){
            System.out.printf("Enter the price of item %d: ", i+1);
            price[i] = scanPrice.nextFloat();

            System.out.printf("Enter the quantity of item %d: ", i+1);
            quant[i] = scanAmount.nextInt();
        }
    }
}
