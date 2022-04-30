import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(get(scanner.nextInt(), 3, 4, 5, 6, 7, 8, 9, 10));

    }

    public static boolean get(int a, int... array) {
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {

                return true;

            } else {

            }
        }
        return false;
    }
}


