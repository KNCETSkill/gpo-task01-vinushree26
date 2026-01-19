import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();

        // TODO:
        // Print "Small", "Medium", or "Large"
        // based on the given volume

        if (volume > 350)
    System.out.print("Large");
else if (volume >= 200)
    System.out.print("Medium");
else
    System.out.print("Small");


        sc.close();
    }
}

