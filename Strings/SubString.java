import java.util.*;

public class SubString {
    public static String getSubString ( String str , int si , int ei) {

        String subStr = "" ;          // empty string to store substring

        // traverse from si to ei
        for ( int i = si ; i < ei ; i++) {
            subStr += str.charAt(i) ;            // concatenate characters to subStr
        }
        return subStr ;
    }
    public static void main(String[] args) {
        String str = " Hell World" ;
        System.out.println(getSubString(str , 3 , 7));
    }
    
}
