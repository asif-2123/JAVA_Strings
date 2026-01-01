import java.util.*;

public class Compression {

    public static String compressed ( String str ) {

        StringBuilder sb = new StringBuilder("") ;                  
        // 0 -->n-1
        for ( int i = 0 ; i < str.length() ; i++ ) {

            int count = 1 ;

            while ( i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {               // to check if the chars are equal
                count ++;                                                                   
                i++ ;                 
            }

            sb.append (str.charAt(i)) ;                   // append to the character
            if ( count > 1) {
                sb.append(count) ;                        // append the count no. if its more than 1 ;
            }
        }
        return sb.toString() ;                            // StringBuilder to String
    }

    public static void main ( String args []) {

        String str = "aaabcccccdddddd" ;
        System.out.println(compressed(str));
    }
}
