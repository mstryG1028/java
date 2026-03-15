package PATTERN;
public class Hello {
// //     static int gcd(int a, int b) {
// //         int min = Math.min(a, b);
// //         for (int i = min; i > 0; i--) {
// //             if (a % i == 0 && b % i == 0) {
// //                 return i;
// //             }
// //         }
// //         return 1;
// //     }
// //     //with using 2D array
// //     // static void pascalTriangle(int r, int c) {
// //     //     int arr[][] = new int[r][c];
// //     //     for (int i = 0; i < r; i++) {
// //     //         for (int j = 0; j <= i; j++) {
// //     //             if (j == 0 || j == c - 1) {
// //     //                 arr[i][j] = 1;
// //     //             } else {
// //     //                 arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
// //     //             }
// //     //         }
// //     //     }
// //     //     for (int i = 0; i < arr.length; i++) {
// //     //         for (int s = 0; s < (r - i); s++) {
// //     //             System.out.print("  ");
// //     //         }
// //     //         for (int j = 0; j <= i; j++) {
// //     //             System.out.print("  " + arr[i][j] + " ");
// //     //         }
// //     //         System.out.println();
// //     //         System.out.println();
// //     //     }
// //     // }
// //     //without using 2D array
// //     static void pascalTriangle(int r) {
// //         for (int i = 0; i < r; i++) {
// //             for(int s=0;s<=r-i;s++){
// //                 System.out.print(" ");
// //             }
// //             int number = 1;
// //             for (int j = 0; j <= i; j++) {
// //                 System.out.print(number + " ");
// //                 number = number * (i - j) / (j + 1);
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void pyramid(int r) {
// //         for (int i = 0; i < r; i++) {
// //             for (int s = 0; s < (r - i) - 1; s++) {
// //                 System.out.print("  ");
// //             }
// //             for (int j = 0; j < (2 * i) + 1; j++) {
// //                 System.out.print("* ");
// //             }
// //             System.out.println();
// //         }
// //         for (int i = r; i > 0; i--) {
// //             for (int s = (r - i) - 1; s >= 0; s--) {
// //                 System.out.print("  ");
// //             }
// //             for (int j = (2 * i) - 1; j > 0; j--) {
// //                 System.out.print("* ");
// //             }
// //             System.out.println();
// //         }
// //     }
    static void diamond(int n) {
        // size of diamond
        // Upper half
        for (int i = 0; i < n-1; i++) {
            // spaces
            for (int s = 0; s < n - i ; s++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 0; j < 2 * i + 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n-2; i >=0; i--) {
           for(int s=0;s<=n-i;s++){
             System.out.print("  ");
           }
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
// //     static void numTriangle(int r) {
// //         int num = 10;
// //         for (int i = 0; i < r; i++) {
// //             for (int s = 0; s < (r - i) - 1; s++) {
// //                 System.out.print("   ");
// //             }
// //             for (int j = 0; j < (2 * i) + 1; j++) {
// //                 if (i == r - 1 || j == 0 || j == (i * 2)) {
// //                     System.out.print(num + " ");
// //                     num++;
// //                 } else {
// //                     System.out.print("   ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void fourBoxWIthOneLarge(int r, int c) {
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if ((i == 1 && j == c / 2)) {
// //                     System.out.print("* ");
// //                 } else {
// //                     System.out.print("  ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void starBox(int r, int c) {
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if (i == j || (j == 0 && i <= r / 2) || i == r / 2 || j == c / 2 || (i == r - 1 && j <= c / 2) || i + j == c - 1 || (j == c - 1 && i >= r / 2) || (i == 0 && j >= c / 2)) {
// //                     System.out.print("* ");
// //                 } else {
// //                     System.out.print("  ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void W(int r, int c) {
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if (j == 0 || j == c - 1 || (i == j && i > r / 2) || (i + j == c && i >= c / 2)) {
// //                     System.out.print("* ");
// //                 } else {
// //                     System.out.print("  ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void starAtCenter(int r, int c) {
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if (i == j || i + j == r - 1) {
// //                     if (i == r / 2 && j == c / 2) {
// //                         System.out.print("@ ");
// //                     } else {
// //                         System.out.print("  ");
// //                     }
// //                 } else {
// //                     System.out.print("* ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void swastik(int r, int c) {
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if ((j == 0 && i < r / 2) || i == r / 2 || j == c / 2 || (j >= c / 2 && i == 0) || (j == c - 1 && i >= r / 2) || (i == r - 1 && j <= c / 2)) {
// //                     System.out.print("* ");
// //                 } else {
// //                     System.out.print("  ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void threeBox(int r, int c) {
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if (i == r / 2 || j == c / 2 || j == 0 || i == r - 1 || (i == 0 && j < c / 2) || (j == c - 1 && i > r / 2)) {
// //                     System.out.print("* ");
// //                 } else {
// //                     System.out.print("  ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void x(int r, int c) { // x
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if (i == j || i + j == c - 1) {
// //                     System.out.print(" ");
// //                 } else {
// //                     System.out.print("*");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void onlyX(int r, int c) {
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if (i == j || i + j == r - 1) {
// //                     System.out.print("*");
// //                 } else {
// //                     System.out.print(" ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void triangle(int r, int c) { // seedha triangle
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if (j == 0 || i == j || i == r - 1) {
// //                     System.out.print("*");
// //                 } else {
// //                     System.out.print(" ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void sqr(int r, int c) { // sqr
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 System.out.print("* ");
// //             }
// //             System.out.println();
// //         }
// //     }
// //     static void hollowsqr(int r, int c) { // hollowsqr
// //         for (int i = 0; i < r; i++) {
// //             for (int j = 0; j < c; j++) {
// //                 if (i == 0 || j == 0 || i == r - 1 || j == c - 1) {
// //                     System.out.print("*");
// //                 } else {
// //                     System.out.print(" ");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// //     public static void main(String[] args) {
// //        pascalTriangle (4);
// //     }
// // }
// package PATTERN;

// public class Hello {

//     static int findPair(int arr[],int target) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     System.out.print(arr[i]+","+arr[j]+" ");
//                     count++;
//                 }

//             }
//         }
//         return count;
//     }
//     static String reverse(String s){
//         String ans="";
//         for(int i=0;i<s.length();i++){
//             ans=s.charAt(i)+ans;
//         }
//         return ans;
//     }
//     static String isAnagram(String s1,String s2){
//         int arr[]=new int[26];
//         for(int i=0;i<s1.length();i++){
//             char ch=s1.charAt(i);
//             arr[ch-'a']=arr[ch-'a']++;
//             char ch1=s2.charAt(i);
//             arr[ch1-'a']=arr[ch1-'a']--;
//         }
//         for(int i:arr){
//             if(i<0)return "not anagram";
//         }
//         return "Anagram";
//     }
//     static int gcd(int a,int b){
//         int n=Math.min(a,b);
//         while(n>1){
//             if(a%n==0&&b%n==0){
//                 return n;
//             }
//             n--;
//         }
//         return 1;
//     }

    public static void main(String[] args) {
diamond(10);
    }
}

