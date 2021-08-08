//звичайна лотерея що видасть десять псевдорандомних результатів після того як досягне обраного результату
//
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class LOTOTREJA {


    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        ArrayList<Integer> wygralo = new ArrayList<>();
        System.out.println("Введи число1");
        wygralo.add(s.nextInt());
        System.out.println("Введи число2");
        wygralo.add(s.nextInt());
        System.out.println("Введи число3");
        wygralo.add(s.nextInt());
        System.out.println("Введи число4");
        wygralo.add(s.nextInt());
        System.out.println("Введи число5");
        wygralo.add(s.nextInt());
        System.out.println("Введи число6");
        wygralo.add(s.nextInt());



        int n = 0;
        for (int j = 1; true;) {
            ArrayList<Integer> numbersGenerated = new ArrayList<>();
            n = n + 1;
            for (int i = 0; i < 6; i++) {
                Random randNumber = new Random();
                int iNumber = randNumber.nextInt(49) + 1;
                if (!numbersGenerated.contains(iNumber)) {
                    numbersGenerated.add(iNumber);
                } else {
                    i--;
                }
            }
            Collections.sort(numbersGenerated);
            System.out.println(numbersGenerated);
            if (numbersGenerated.containsAll(wygralo)) {
                System.out.println("ВИГРАВ");
                System.out.println("ВИГРАВ");
                System.out.println("ВИГРАВ");
                System.out.println("ВИГРАВ");
                System.out.println("ВИГРАВ");
                System.out.println("кількість ітерацій" + " " + n);
                n = -10;
                //kjjjkjkjjk
            }
            if (n == 0) {break;}


        }

    }
}
