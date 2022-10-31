import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner klavye=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu girin: ");
        double boy= klavye.nextDouble();
        System.out.print("Lütfen kilonuzu girin: ");
        double kilo = klavye.nextDouble();

        double indeks=kilo/(boy*boy);
        System.out.println("vücut kitle indeksiniz:  " +indeks);





    }
}
