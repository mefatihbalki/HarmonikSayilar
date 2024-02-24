import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Kullanıcı girişleri-değişkenler
      Scanner input =new Scanner(System.in);
        System.out.print("n Sayısını Giriniz: ");
        int n =input.nextInt();
        double result =0;
    //Döngü Kısmı
        for (double i=1; i<=n;i++) {
            result += (1 / i);
        }
        System.out.println("Harmanoik Seri Sonucu: " +result);
    }
}