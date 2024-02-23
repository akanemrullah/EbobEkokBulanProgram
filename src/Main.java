import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sinifina ait input degiskeni ve diger degiskenleri tanimladik.
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, tempNumber = 0, ebob = 1, ekok = 1, counter = 0;

        // Kullanicidan veriler alip ilgili degiskenlere atadik.
        System.out.print("Ebob ve ekok degerlerini bulacagimiz ilk sayiyi gir: ");
        number1 = input.nextInt();

        System.out.print("Ebob ve ekok degerlerini bulacagimiz ikinci sayiyi gir: ");
        number2 = input.nextInt();

        // Bu islem ile beraber en buyuk sayi herzaman n1 olacak.
        if (number1 < number2) {

            tempNumber = number1;
            number1 = number2;
            number2 = tempNumber;
        }

        // EBOB icin;
        counter = number2;
        while (counter >= 1) {
            if (number1 % counter == 0 && number2 % counter == 0) {
                ebob = counter;
                break;
            }
            counter--;
        }

        //EKOK icin;
        counter = 1;
        while (counter <= (number1 * number2)) {
            if (counter % number1 == 0 && counter % number2 == 0) {
                ekok = counter;
                break;
            }
            counter++;
        }
        System.out.print("\nGirilen sayinin ebob degeri: " + ebob + "\nGirilen sayinin ekok degeri: " + ekok);
    }
}