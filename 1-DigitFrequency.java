/* Q - input is 9892039 ab agar digit daala 9 to 9 3 baar aya hai isse print karna hai

Solution - 10 se agar devide karoge to last digit mil jayega aur usse tum input se compare kar /do, ab agar wo input ke barabar aa jaye to count variable ek se badha do.

Note - n%10 ye n ka last digit dega & n /= 10 (n=n/10) gives n containing all digits except the last

*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int rv=0;
        while(n>0){
            int dig = n%10;
            n = n/10;
            if(dig==d){
                rv++;
            }
        }
        return rv;
    }
}