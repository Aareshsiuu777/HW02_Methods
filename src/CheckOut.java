import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double total = 0.0;
        double itemPrice = 0.0;
        boolean moreItems = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 99.99);
            total += itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (moreItems);

        System.out.printf("%nYour total is: $%.2f%n", total);
    }
}