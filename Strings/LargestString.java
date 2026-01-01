import java.util.*;

public class LargestString {

    public static String getlargest ( String fruits [] ) {
        String largest = fruits[0] ;               // assume first string is largest
        for ( int i =1 ; i <fruits.length ; i++) {
            if ( largest.compareToIgnoreCase(fruits[i]) < 0) {        // compare strings
                largest = fruits[i] ;                                // update largest
            }
        }
        return largest;
    }

    public static void main ( String args []) {
        String fruits [] = {"apple", "mango", "banana"};
        System.out.println( getlargest ( fruits ) ) ;

    }

    
}
