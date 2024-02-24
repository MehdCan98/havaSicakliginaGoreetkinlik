import java.util.Scanner;
//Kullanıcıdan verileri alabilmek için Scanner sınıfını tanımladık


public class Main {
    public static void main(String[] args) {

        //değişkenimzi tanımladık
         int hava;

      Scanner input = new Scanner(System.in);


       //Kullanıcıdan hava verisini alıyoruz
        System.out.print("Hava Sıcaklığıını Giriniz: ");
        hava = input.nextInt();

        //Havanın derece aralığına göre kullanıcıya etkinlik öneriyoruz
        if (hava < 5) {
            System.out.println("Kayak yap");
        }
        if (hava >=5  && 25 <=hava){

            } else if (hava <= 15){
            System.out.println("Sinemaya gidebilirsin");
        } else if (hava >15 && 25>= hava) {
            System.out.println("pikniğer gidebilirsin");

        }
        if (hava >= 25){
            System.out.println("Yüzmeye git");
        }
    }
}