import java.util.Scanner;

/**
 * PurcasePrice18
 */
public class PurcasePrice18 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int price, quantity;
        double discount=0.1, totalPrice, purchasePrice, totalDiscount;
        System.out.println("Input price: ");
        price=input.nextInt();
        System.out.println("input quantity: ");
        quantity=input.nextInt();
        totalPrice=price*quantity;
        totalDiscount=totalPrice*quantity;
        purchasePrice=totalPrice-totalDiscount;
        System.out.println("total discount: "+ totalDiscount);
        System.out.println("Final purchase price: "+ purchasePrice);
        
    }
}