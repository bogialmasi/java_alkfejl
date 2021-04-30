import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set lottoszamaim = new LinkedHashSet();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Szám: ");
            int lottoszam = sc.nextInt();
            lottoszamaim.add(lottoszam);
        }
        Set lotto = new LinkedHashSet();
        for (int i = 0; i < 5; i++) {
            int min = 1;
            int max = 90;
            int szam = min + (int) (Math.random() * ((max - min) + 1));
            lotto.add(szam);
        }
        System.out.println("Nyerő lottószámok: " + lotto);
        System.out.println("Saját számaim: " + lottoszamaim);

        boolean nyeroszamok = false;

        for(int i = 0; i < lotto.size(); i++){
            if (lotto.contains(lottoszamaim)){
                nyeroszamok = true;
            }
        }
        if (nyeroszamok){
            System.out.println("Nyert a lottón!");
        } else {
            System.out.println("Nem nyert a lottón!");
        }

    }

}

