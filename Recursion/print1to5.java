public class print1to5 {
    public static void printnum(int n)
    {
        if(n==6)
        {
            return;
        }
        else
        {
        System.out.println(n);
        printnum(n+1);
        }
    }
    public static void main(String[] args) {
        int m=1;
        printnum(m);
    }
}
