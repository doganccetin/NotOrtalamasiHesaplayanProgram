import  java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {


        int Mat, Fizik, Kimya;
        Scanner Sayi = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        Mat = Sayi.nextInt();

        System.out.print("Fizik Notunuzu Giriniz");
        Fizik= Sayi.nextInt();

        System.out.print("Kimya Notunuzu Giriniz");
        Kimya= Sayi.nextInt();

        int Toplam= (Mat + Fizik + Kimya);
        double sonuc = Toplam / 3.0;

        System.out.println("Ortalamaniz: " + sonuc);


    }
}