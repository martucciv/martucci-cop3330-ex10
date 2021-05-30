import java.util.Scanner;

public class Checkout {
    public static void main(String[] args){

        Input input = new Input();
        input.myInput();
        Math math = new Math();
        math.mySubtotal(input.price, input.quant, input.items);
        math.myTax(math.subtotal);
        math.myTotal(math.subtotal, math.tax);

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", math.subtotal, math.tax, math.total);
    }
}

 class Input {
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

class Math {
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