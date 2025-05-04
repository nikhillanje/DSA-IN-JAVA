public class SumOfNumbers {
    public static void printinfo(int i,int n,int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }

        sum+=i;
        printinfo(i+1, n, sum);
    }
    public static void main(String[] args) {
        printinfo(1, 5, 0);
        
    }
}
