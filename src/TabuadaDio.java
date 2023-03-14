import java.util.Scanner;

public class TabuadaDio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada: " + tabuada);

        for (int i = 1; i <= 10; i++) { // ou i = 1+1
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}