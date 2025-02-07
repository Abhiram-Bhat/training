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
         int secondLargest = findSecondLargest(array);
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
        
    }
}