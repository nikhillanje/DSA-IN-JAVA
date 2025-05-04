public class Print5to1 {
    public static void printnum(int n)
    {
        if (n==0)
        {
            return;
        }
        else
        {
        System.out.println(n);
        printnum(n-1);
        }
    }
    public static void main(String[] args) {
        printnum(5);
        
    }
}
