/**
 * Ejercicio 5
 * This program prints a formatted timetable using printf and colours the 
 * different subjects.
 */

public class Ejercicio5 {
    public static void main(String args[]) {
        System.out.println("  L             M             X             J             V");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "\033[34mPROGR", "\033[31mSIINF", "\033[33mENDES", "\033[34mPROGR", "\033[95mFOL");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "\033[34mPROGR", "\033[31mSIINF", "\033[33mENDES", "\033[34mPROGR", "\033[95mFOL");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "\033[32mLMSGI", "\033[31mSIINF", "\033[34mPROGR", "\033[32mLMSGI", "\033[95mFOL");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "\033[32mLMSGI", "\033[34mPROGR", "\033[34mPROGR", "\033[32mLMSGI", "\033[31mSIINF");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "\033[37mBADAT", "\033[34mPROGR", "\033[37mBADAT", "\033[37mBADAT", "\033[31mSIINF");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "\033[37mBADAT", "\033[33mENDES", "\033[37mBADAT", "\033[37mBADAT", "\033[31mSIINF");
    }
}