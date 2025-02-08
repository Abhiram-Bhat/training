import java.util.Scanner;

public class TextCorrection {
    public static String correctText(String text) {
        return text.replace("hte", "the").replace("recieve", "receive");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Corrected text: " + correctText(text));
        scanner.close();
    }
}
