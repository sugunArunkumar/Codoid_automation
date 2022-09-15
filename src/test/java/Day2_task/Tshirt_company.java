package Day2_task;

import java.util.Scanner;
public class Tshirt_company {

    int not;
    String size;
    String colour;

    static {
        System.out.println("Client ordered the tshirts");
    }
    Tshirt_company(int not,String size){

        Scanner sc = new Scanner(System.in);
        this.not=not;
        this.size=size;
        this.colour=colour;
        System.out.println("Number of tshirts  " + not + " size "+ size);
        System.out.println("client1 ordered 50 medium size White T-shirts");
//        String tshirt =sc.nextLine();
//        int value = Integer.valueOf(tshirt);
        int value = sc.nextInt();
        System.out.println("client2 ordered " + value + " medium size Red T-shirts");
    }

    public static void client3(){
        Scanner sc = new Scanner(System.in);
        String tshirt =sc.next();
        int value = Integer.valueOf(tshirt);
        String size = sc.nextLine();
        System.out.println("client3 ordered " + value + size +" size Blue T-shirts");

    }

    public static void client4(){
        Scanner sc = new Scanner(System.in);
        String tshirt =sc.next();
        int value = Integer.valueOf(tshirt);
        System.out.println("client4 ordered " + value + " medium size Blue T-shirts");

    }

    public static void main(String[] args) {
        Tshirt_company tc = new Tshirt_company(100,"M");
        Tshirt_company.client3();
        Tshirt_company.client4();

    }

}
