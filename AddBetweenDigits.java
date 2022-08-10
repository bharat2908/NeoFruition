public class AddBetweenDigits {
    public static void main(String[] args) {
        int sum = 0;
        int num = 214537438;
        int r = num%10;
        int Last_Digit = num%10;
        System.out.println("Last Number is " + Last_Digit);
        int First_Digit = num;
        while(First_Digit>10){
            First_Digit = First_Digit/10;
        }
        System.out.println("First Number is " + First_Digit);
// System.out.println();
        int total = First_Digit + Last_Digit;
        while (num!=0){
            sum = sum + num%10;
            num = num/10;
        }
        sum = sum - total;
        if(sum%9==0){
            System.out.println("Winner");
        }
        else
        {
            System.out.println("Looser");
        }
    }
}
