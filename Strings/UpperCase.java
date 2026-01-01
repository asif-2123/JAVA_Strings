import java.util.* ;

public class UpperCase {

    public static String getUpperCase( String str) {
        
        StringBuilder sb = new StringBuilder ("") ;         // dedicating a new string builder

        sb.append ( Character.toUpperCase(str.charAt(0)) ) ;          // change the first word to uppercase
        
        // from 1 to n-1
        for ( int i = 1 ; i < str.length() ; i++) {
            if (str.charAt(i) == ' ' && i< str.length()-1) {            // finding space 
                sb.append(str.charAt(i)) ;                              //appending the space in sb
                i++;                                                    //to next letter
                sb.append ( Character.toUpperCase(str.charAt(i)));      //uppercasing and adding
            }
            else {

                sb.append ( str.charAt(i)) ;
            }
        }
        return sb.toString() ;                                           // changing sb into String 

    }

    public static void main(String[] args) {
        String str = "hi , mahself asif " ;
        System.out.println(getUpperCase(str) );
    }
    
}
