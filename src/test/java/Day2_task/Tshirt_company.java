package Day2_task;

import java.util.Scanner;

public class Tshirt_company {

    int client_total_order;
    String size;
    String colour;
    int pre_order;
    int value;

    static {
        System.out.println("Client already received the 50 small white t-shirts");
    }

    Tshirt_company(int pre_order) {
        this.pre_order = pre_order;
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        if ((pre_order + value < 101) && (!(client_total_order > 101))) {
            size = sc.next();
            colour = sc.next();

            System.out.println("Client need a " + value + " " + size + " size " + colour + " colour t-shirt");
            client_total_order = pre_order + value;
            System.out.println("client total order " + client_total_order);
        } else {

            System.out.println("client reach the maximum order");
        }
    }

    public static void main(String[] args) {
        Tshirt_company tc = new Tshirt_company(50);


    }


}
