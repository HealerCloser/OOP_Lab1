import java.util.Scanner;

public class DaysofMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the month (full name, abbreviation, in 3 letters, or in number): ");
            String monthInput = scanner.nextLine().toLowerCase();
            System.out.print("Enter the year: ");
            int yearInput = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (isValidMonth(monthInput) && isValidYear(yearInput)) {
                int monthIndex = getMonthIndex(monthInput);
                int daysInMonth = getDaysInMonth(monthIndex, yearInput);
                System.out.println("Number of days in " + capitalizeFirstLetter(monthInput) + " " + yearInput + ": " + daysInMonth);
                break;
            } else {
                System.out.println("Invalid month or year. Please try again.");
            }
        }

        scanner.close();
    }

    private static boolean isValidMonth(String month) {
        String[] months = {"january", "february", "march", "april", "may", "june",
                "july", "august", "september", "october", "november", "december"};

        for (String m : months) {
            if (m.equals(month) || m.startsWith(month) || m.substring(0, 3).equals(month))
                return true;
        }

        return false;
    }

    private static boolean isValidYear(int year) {
        return year >= 0 && year <= 9999;
    }

    private static int getMonthIndex(String month) {
        String[] months = {"january", "february", "march", "april", "may", "june",
                "july", "august", "september", "october", "november", "december"};

        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(month) || months[i].startsWith(month) || months[i].substring(0, 3).equals(month))
                return i + 1; // Months are 1-indexed
        }

        return -1; // Invalid month
    }

    private static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}