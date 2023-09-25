import java.util.Scanner;

public class Billing_System {
    public static void main(String[] args) {

        int user_input;
        double qun = 0;
        double total = 0;
        int food;
        int total_with_vat =0;
        int total_with_dis =0;


        Scanner scan = new Scanner(System.in);
        int biryani = 200;
        int mo_mo = 150;
        int french_fries = 200;
        int Noodels = 300;
        int coke = 70;
        int Lasi = 70;
        int selected = 0;

        System.out.println("Menu");
        System.out.println("1. momo");
        System.out.println("2. biryani");
        System.out.println("3. French Fries ");
        System.out.println("4. Noodels ");
        System.out.println("5. Coke ");
        System.out.println("6. Lasi ");

        System.out.println("Enter the number of items:");
        user_input = scan.nextInt();

        for (int i = 1; i <= user_input; i++) {
            System.out.println("Enter the food num you wanna eat:");
            food = scan.nextInt();

            System.out.println("Enter the quantity. ");
            qun = scan.nextInt();

            if (food == 1) {
                selected = mo_mo;
            } else if (food == 2) {
                selected = biryani;
            } else if (food == 3) {
                selected = french_fries;
            } else if (food == 4) {
                selected = Noodels;
            } else if (food == 5) {
                selected = coke;
            } else if (food == 6) {
                selected = Lasi;
            } else {
                System.out.println("Not in menu");
            }

            total += (selected * qun);
            total_with_vat = (int) (total +(total*0.1));
            total_with_dis = (int) (total_with_vat -(total_with_vat*0.1));
        }
        System.out.println("The total price is Rs " + total);
        System.out.println("The total price with vat price is Rs " + total_with_vat);
        System.out.println("The total price with discount price is Rs " + total_with_vat);


    }
}
