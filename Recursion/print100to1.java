public class print100to1 {
    public static void printdata(int n)
    {
        if(n==0)
        {
            return;

        }
        else{
            System.out.println(n);
        printdata(n-1);
        }
    }
    public static void main(String[] args) {
        printdata(100);
        
    }
}
