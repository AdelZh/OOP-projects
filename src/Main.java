import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {




        Scanner scan=new Scanner(System.in);
        while(true){
            int num=scan.nextInt();

            Seasons seasons=new Seasons();

            System.out.println(seasons.method(num));
        }
    }
        }
