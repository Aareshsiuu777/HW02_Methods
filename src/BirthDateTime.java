import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;
        int maxDay = 0;

        year = SafeInput.getRangedInt(in, "Enter your birth year", 1921, 2020);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 29;
                break;
        }

        day = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDay);
        hours = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.println("\nDate and Time of Birth:");
        System.out.printf("Year: %d  Month: %d  Day: %d  Hour: %d  Minute: %d%n", year, month, day, hours, minutes);
    }
}