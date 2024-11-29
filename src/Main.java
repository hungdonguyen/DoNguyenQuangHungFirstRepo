import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to QuangHung's Java Repository");
        Welcome();
    }

    public static void Welcome() {
        String s = "Your_Name";
        PrintMessage(s);
    }

    public static void PrintMessage(String name) {
        System.out.println("Hello " + name);
        System.out.println("Welcome to my Repository");
    }
}

