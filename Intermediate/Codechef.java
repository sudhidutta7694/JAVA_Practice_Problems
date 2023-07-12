
// import java.util.*;

// class Codechef {
//     public static void main(String[] args) throws java.lang.Exception {
//         Scanner scan = new Scanner(System.in);
//         int T = scan.nextInt();
        

//         while (T > 0) {
//             int N = scan.nextInt();
//             scan.nextLine(); // Consume the newline character

//             while (N > 0) {
//                 int count = 0;

//                 if (!scan.hasNextLine()) {
//                     break;
//                 }

//                 // String input = scan.nextLine();
//                 // String arr[] = input.split(" ");
//                 String[] arr = new String[N];
//                 for (int i=0; i<N ; i++) {
//                     arr[i] = scan.nextLine();
//                 }
//                 int cO = countOccurrences(arr, "O");
//                 int cA = countOccurrences(arr, "A");
//                 int cB = countOccurrences(arr, "B");
//                 int cAB = countOccurrences(arr, "AB");

//                 if (cO > 0) {
//                     if ((cA > 0 && cB == 0) || (cA == 0 && cB > 0))
//                         count += cO + cA + cB + cAB;
//                     else if ((cA > 0 && cB > 0) && (cA >= cB))
//                         count += cO + cA + cAB;
//                     else if ((cA > 0 && cB > 0) && (cA <= cB))
//                         count += cO + cB + cAB;
//                     else if ((cA == 0 && cB == 0))
//                         count += cO + cAB;
//                 } else if (cA > 0 || cB > 0) {
//                     if ((cA > 0 && cB == 0) || (cA == 0 && cB > 0))
//                         count += cA + cB + cAB;
//                     else if ((cA > 0 && cB > 0) && (cA >= cB))
//                         count += cA + cAB;
//                     else if ((cA > 0 && cB > 0) && (cA <= cB))
//                         count += cB + cAB;
//                 }
//                 System.out.println(count);
//                 N--;
//             }
//             T--;
//         }
//     }

//     public static int countOccurrences(String[] arr, String target) {
//         int count = 0;
//         for (String str : arr) {
//             if (str.equals(target)) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
import java.util.*;

public class Codechef {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while (t>0) {
		    String[] arrStr = scan.nextLine().split(" ");
            int[] arr = new int[arrStr.length];
            for (int i = 0; i < arrStr.length; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            String[] QStr = scan.nextLine().split(" ");
            int[] Q = new int[arr[1]];
            for (int i = 0; i < arr[1]; i++) {
                Q[i] = Integer.parseInt(QStr[i]);
            }
            int[] S = new int[arr[0]];
            for (int i=0; i<arr[0]; i++) {
                arr[i] = (i+1);
            }int cost = 0;
            for (int i=0; i<S.length; i++) {
                int target = S[i];
                if (!binarySearch(Q, target)) cost+=target; 
            }
            System.out.println(cost);
		    t--;
		}scan.close();
	}
	
	static boolean binarySearch(int[] Q, int t) {
	    int start = 0;
	    int end = Q.length -1;
	    boolean found = false;
	    while (start <= end) {
	        int mid = start + (end-start)/2;
	        if (t == Q[mid]){ 
	            found = true;
	            break;
	        }else if (t < Q[mid]) end = mid-1;
	        else start = mid + 1;
	    }return found;
	}
}

/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class Codechef
// {
	
// }

