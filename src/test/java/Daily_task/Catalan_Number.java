package Daily_task;

public class Catalan_Number {
    // A recursive function to find nth catalan number

    int catalan(int n)
    {
        int res = 0;

        // Base case
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Catalan_Number cn = new Catalan_Number();
        for (int i = 0; i < 10; i++) {
            System.out.print(cn.catalan(i) + " ");
        }
    }
}
