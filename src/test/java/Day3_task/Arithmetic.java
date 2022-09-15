package Day3_task;

public class Arithmetic {

    public int addition(int a){

        System.out.println(a);
        return 0;
    }

    public int addition(int a,int b){

        System.out.println(a+b);
        return 0;
    }

    public int addition(int a,int b,int c){

        System.out.println((a*b)+c);

        return 0;
    }

    public static void main(String[] args) {
        Arithmetic mo = new Arithmetic();
        mo.addition(100);
        mo.addition(100,500);
        mo.addition(400,700,800);


    }
}
