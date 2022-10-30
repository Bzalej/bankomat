import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=10000;
        System.out.println("Ile chcesz wypłacić pieniędzy?");
        int forsa= sc.nextInt();
        System.out.println("Wypłaciłeś "+forsa+" PLN!");
        System.out.println("Pozostało Ci na koncie "+ (a-forsa +"PLN!"));
    }
}
