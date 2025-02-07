import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n=scanner.nextInt();
        int [] array=new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]+" ");
        }
    }
}