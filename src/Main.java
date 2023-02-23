import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        Scanner ortalama= new Scanner(System.in);


        System.out.print("Matematik Notunuzu Giriniz :");
        a=ortalama.nextInt();


        System.out.print("Fizik Notunuzu Giriniz :");
        b=ortalama.nextInt();


        System.out.print("Kimya Notunuzu Giriniz :");
        c=ortalama.nextInt();


        int ort=(a+b+c);
        double sonuc=ort/3.0;
        System.out.println("Ortalamanız :"+sonuc);
        String str= sonuc>=60.0 ? "Gecti":"Kaldı";
        System.out.println(str);






    }
}