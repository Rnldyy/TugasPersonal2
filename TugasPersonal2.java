import java.util.Scanner;

public class TugasPersonal2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            String baris1 = "Belajar Deret Aritmatika, Geometri dan menghitung Faktorial";
            String baris2 = "Masukan banyak angka yang mau di cetak [2..10] : ";
            String baris3 = "Masukan beda masing-masing angka [2..9] : ";

            System.out.println(baris1);
            System.out.print(baris2);
            int banyakAngka = sc.nextInt();
            System.out.print(baris3);
            int bedaAngka = sc.nextInt();

            String deret1 = "Deret Aritmatika : ";
            String deret2 = "Deret Geometri : ";
            String deret3 = "Faktorial dari " + banyakAngka + " : ";

            System.out.print(deret1 + "\n");
            for (int i = 1; i <= banyakAngka * bedaAngka; i = i + bedaAngka) {
                System.out.print(i + " ");
            }
            System.out.print("\n" + deret2 + "\n");
            int a = 1, total = 0;
            for (int i = 1; i <= banyakAngka; i++){
                System.out.print(a + total);
                a = a * 2;
                if (i < banyakAngka){
                    System.out.print(" ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n" + deret3 + "\n");
            for (int i = banyakAngka; i >= 1; i--){
                System.out.print(i + " ");
            }
            System.out.println("= " + factorial(banyakAngka));

            System.out.println("Anda mau ulang [y/t] : ");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
            sc.close();
    }

    private static int factorial(int n) {
        if (n == 1){
            return 1;
        } else {
            return n * factorial(n -1 );
        }
    }
}
