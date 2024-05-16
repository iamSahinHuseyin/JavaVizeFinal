import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan alınan vize ve final notuna göre ortalama hesaplama veahrf notu hesaplama..
        Scanner sc = new Scanner(System.in);
        int vize;
        int finaL;
        double ortalama;

        System.out.print("Vize notunuzu giriniz: ");
        vize = sc.nextInt();
        System.out.print("Final notunuzu giriniz: ");
        finaL = sc.nextInt();

        ortalama = (vize * 0.4) + (finaL * 0.6);
       // System.out.println("Ortalama: " + ortalama);

        if (ortalama > 90) {
            System.out.print("Ortalama: " + ortalama + " olduğu için harf notunuz: AA");
        } else if (ortalama>75) {
            System.out.print("Ortalama: " + ortalama + " olduğu için harf notunuz: BB");
        }
        else if (ortalama>=50) {
            System.out.print("Ortalama: " + ortalama + " olduğu için harf notunuz: CC");
        }
        else{
            System.out.print("Ortalama: " + ortalama + " olduğu için KALDINIZ!");
        }
    }
    }
