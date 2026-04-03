import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = "";
        String mNumber = "";
        String zipPlusFour = "";

        ssn = SafeInput.getRegExString(in, "Enter your SSN (format: ###-##-####)", "\\d{3}-\\d{2}-\\d{4}");
        mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: M#####)", "(M|m)\\d{5}");
        zipPlusFour = SafeInput.getRegExString(in, "Enter your Zip+4 code (format: #####-####)", "\\d{5}-\\d{4}");

        System.out.println("\nYou entered:");
        System.out.println("SSN:      " + ssn);
        System.out.println("M Number: " + mNumber);
        System.out.println("Zip+4:    " + zipPlusFour);
    }
}