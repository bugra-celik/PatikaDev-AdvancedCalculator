import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {

    static void plus(){
        Scanner scan = new Scanner(System.in);
        int number,result =0,i=1;

        while(true){
            System.out.println(i++ +". sayı");
            number = scan.nextInt();
            if(number == 0){
                break;
            }
            result += number;

        }
        System.out.println("Sonuç ="+result);
    }
    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number,result = 0;

        for(int i=1;i<=counter;i++){
            System.out.println(i+ ". Sayı:");
            number = scan.nextInt();
            if(i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç :" +result);
    }
static void times(){
        Scanner input = new Scanner(System.in);
        int number,result = 1, i = 1;
        while(true){
            System.out.print(i++ +". Sayı");
            number = input.nextInt();
            if(number == 1)
                break;
            if(number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
    System.out.println("Çarpma:" +result);
}
static void divided(){
        Scanner inp = new Scanner(System.in);
    System.out.print("Kaç adet sayı gireceksiniz:");
    int counter = inp.nextInt();
    double number,result = 0.0;

    for(int i=1;i <=counter;i++){
        System.out.print(i+" . sayı");
        number = inp.nextDouble();

        if(i != 1 && number ==0){
            System.out.println("Böleni 0 giremezsiniz.");
            continue;
        }
        if(i == 1){
            result = number;
            continue;
        }
        result /= number;

    }
    System.out.println("Bölümm" + result);
}
 static void power(){
        Scanner scan = new Scanner(System.in);
     System.out.print("Taban değerini giriniz:");
     int base = scan.nextInt();
     System.out.print("Üst değerini giriniz:");
     int exponent = scan.nextInt();
     int result = 1;

     for(int i=1;i<=exponent;i++){
         result *= base;
     }
     System.out.println("Sonuç:" +result);
 }
 static void factorial(){
        Scanner scan = new Scanner(System.in);
     System.out.print("Sayı giriniz:");
     int n= scan.nextInt();
     int result = 1;
     for(int i=1;i<=n;i++){
         result *= i;
     }
     System.out.println("Faktöriyel:" + result);
 }
 static void modding() {
     Scanner scan = new Scanner(System.in);
     System.out.print("1. sayıyı giriniz:");
     int n1 = scan.nextInt();
     System.out.print("2. sayıyı giriniz:");
     int n2 = scan.nextInt();
     int result;
     if (n2 == 0) {
         System.out.println("2.sayıyı 0 giremezsiniz..Tekrar deneyiniz");
     } else {
         result = n1 % n2;
         System.out.println("Mod:" + result);
     }
 }
static void rectangular(){
        Scanner scan = new Scanner(System.in);
        int uzun,kisa,alan,cevre;

    System.out.print("Dikdörtgenin uzun kenarını giriniz:");
    uzun = scan.nextInt();
    System.out.print("Dikdörtgenin kısa kenarını giriniz:");
    kisa = scan.nextInt();

    cevre = 2* (uzun+kisa);
    alan = uzun * kisa;

    System.out.println("alan=" + alan);
    System.out.println("Çevre ="+ cevre);
}





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplma İşlemi\n"
                +"2- Çıkarma İşlemi\n"
                +"3- Çarpma İşlemi\n"
                +"4- Bölme İşlemi\n"
                +"5- Üslü Sayı Hesaplama\n"
                +"6- Faktöriyel Hesaplama\n"
                +"7- Mod Alma\n"
                +"8-Dikdörtgen Alan Ve Çevre Hesabı\n"
                +"0- Çıkış Yap.";

          do{
              System.out.println(menu);
              System.out.print("Lütfen bir işlem seçiniz :");
              select = scan.nextInt();
              switch(select){
                  case 1:
                      plus();
                      break;
                  case 2:
                      minus();
                      break;
                  case 3:
                      times();
                      break;
                  case 4:
                      divided();
                      break;
                  case 5:
                      power();
                      break;
                  case 6:
                      factorial();
                      break;
                  case 7:
                      modding();
                      break;
                  case 8:
                      rectangular();
                      break;
                  case 0:
                      break;
                  default:
                      System.out.println("Yanlış bir değer girdiniz,tekrar deneyiniz.");
              }
          }while( select != 0);
        System.out.println("Güle güle....");
    }
}
