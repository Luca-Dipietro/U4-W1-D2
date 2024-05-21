package Es4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("Countdown");
        for (int i = numero; i >= 0; i--){
            System.out.println(i);
        }
    }
}
