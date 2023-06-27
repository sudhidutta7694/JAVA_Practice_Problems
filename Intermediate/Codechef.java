
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
// import java.util.*;

// public class Codechef {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         input.nextLine(); // Consume the remaining newline character

//         Deque<String> programs = new ArrayDeque<>();

//         for (int i = 0; i < n; i++) {
//             String program = input.nextLine().trim();
//             if (!programs.contains(program)) {
//                 programs.addFirst(program.substring(program.length() - 2));
//             }
//         }

//         StringBuilder output = new StringBuilder();
//         for (String program : programs) {
//             if (output.indexOf(program) == -1) {
//                 output.append(program);
//             }
//         }

//         System.out.println(output.toString());
//         input.close();
//     }
// }

