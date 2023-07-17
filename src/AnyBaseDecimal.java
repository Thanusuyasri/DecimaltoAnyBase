import java.util.Scanner;

public class AnyBaseDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int base= scanner.nextInt();
        String result = " ";
        while(number>0)
        {
            result+=String.valueOf(number%base);
            number/=base;
        }
        String reversresult=" ";
        for(int i=result.length()-1;i>0 ;i--)
        {
            char ch=result.charAt(i);
            reversresult+=ch;
        }
        System.out.println(reversresult);
    }
}
