/**
 * This program prints a formatted timetable using printf.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio4 {
    public static void main(String args[]) {
        System.out.println("  L                  M                  X                  J                  V");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "PROGR", "SIINF", "ENDES", "PROGR", "FOL");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "PROGR", "SIINF", "ENDES", "PROGR", "FOL");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "LMSGI", "SIINF", "PROGR", "LMSGI", "FOL");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "LMSGI", "PROGR", "PROGR", "LMSGI", "SIINF");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "BADAT", "PROGR", "BADAT", "BADAT", "SIINF");
        System.out.printf("%-10s         %-10s         %-10s         %-10s         %-10s\n", "BADAT", "ENDES", "BADAT", "BADAT", "SIINF");
    }
}