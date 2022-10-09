package Daily_task;

public class Lucas_Number {
    // recursive function
    public static int lucas(int n)
    {

        // Base cases
        if (n == 0)
            return 2;
        if (n == 1)
            return 1;

        // recurrence relation
        return lucas(n - 1) +
                lucas(n - 2);
    }

    // Driver Code
    public static void main(String args[])
    {
        int n = 9;
        System.out.println(lucas(n));
    }
}
