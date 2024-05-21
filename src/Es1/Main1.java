package Es1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci la parola: ");
        String parola = sc.nextLine();
        if(stringPariDispari(parola)){
            System.out.println("Il numero dei caratteri è pari");
        }else {
            System.out.println("Il numero dei caratteri è dispari");
        }

        System.out.print("Inserisci l'anno: ");
        int anno = Integer.parseInt(sc.nextLine());
        if (annoBisestile(anno)){
            System.out.println("L'anno è bisestile");
        }else {
            System.out.println("L'anno non è bisestile");
        }

    }

    public static boolean stringPariDispari(String str){
        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int numero){
        if (numero % 400 == 0){
            return true;
        } else if (numero % 100 == 0){
            return false;
        } else return numero % 4 == 0;
    }
}
