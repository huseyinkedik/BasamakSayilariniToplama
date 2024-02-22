import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri girişi beklenir.
        System.out.println("Sayı giriniz: ");
        int number = input.nextInt();
        int toplam = 0;
        int basNumber;

        //Her basamağın değerleri toplanır.
        while (number != 0) {
            basNumber = number % 10;
            toplam += basNumber;
            number /= 10;

        }System.out.println("Sayının basamaklarının toplamı: " + toplam);


    }
}