import java.util.*; 

public class Pallindrome {
    public static boolean isPallindrome ( String str) {
        // check first and last character
        for ( int i = 0 ; i <= str.length()/2 ; i++) {                         // optimized loop till half
            if ( str.charAt(i) != str.charAt(str.length()-1-i)) {              // compare characters
                return false ;
            }
        }
        return true;
    }
    public static void main ( String args[]) {
        Scanner sc = new Scanner ( System.in) ;
        System.out.println(" Enter a string: ") ;
        String str = sc.next() ;

        System.out.println(isPallindrome ( str) ) ;
    }
}
