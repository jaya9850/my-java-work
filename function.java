import java.util.Scanner;

public class Function{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        Arithmetic(a,b);
        Swapping(a,b);

        System.out.println("enter num value to reverse: ");
        int num1 = sc.nextInt();
        Reverse(num1);

        System.out.println("enter num value to palindrome: ");
        int num2 = sc.nextInt();
        Palindrome(num2);



    }
    public static void Arithmetic(int a, int b){
        System.out.println("a+b:" +(a+b));
        System.out.println("a-b:" +(a-b));
        System.out.println("a*b:" +(a*b));
    }

    public static void Swapping(int a, int b){
        System.out.println("----before Swap----");
        System.out.println("a = " +a + ", b = 10" +b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("---After swap---");
        System.out.println("a= " +a + ", b= " +b);
    }

    public static void Reverse(int num){
        int rev =0;
        while(num != 0){
            int digit = num%10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        System.out.println("Reversed number: " +rev);
    }
    public static void Palindrome(int num){
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }
    }
}
