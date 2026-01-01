import java.util.*;

public class ShortestPath {

    public static float shortestPath ( String str) {
        int x = 0 , y = 0 ;
        
        // traverse the string
        for ( int i = 0 ; i < str.length() ; i ++) {

            char dir = str.charAt(i) ;                // get direction character

            // north
            if ( dir == 'N') {
                y++ ;
            }
            // south
            else if ( dir == 'S') {
                y-- ;
            }
            // east
            else if ( dir == 'E') {
                x++ ;
            }
            // west
            else if ( dir == 'W') {
                x-- ;
            }
        }
        // calculate shortest path using formula

        return (float) Math.sqrt ( Math.pow(x,2) + Math.pow(y,2) ) ;
    }
    public static void main ( String args []) {

        String str = "WNEENESENNN" ;
        System.out.println( shortestPath ( str) ) ;
    }
}
