package ba.unsa.etf.rpr.predavanje03;
import java.util.Scanner;

public class MojaPrvaKlasa {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Unesite broj n: ");
        Scanner reader = new Scanner( System.in );
        int n = reader.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(" " + (i+1));
        }
        reader.close();
    }
}
