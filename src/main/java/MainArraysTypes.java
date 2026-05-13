public class MainArraysTypes {
    public static void main(String[] args) {
        // index    0  1  2   3  4     4Byte
       int[] ari = {9, 2, 5, -3, 7};//masiv Interdex
        //               0  1     2      3      4   8Byte
       double[] ard = {8.2, 7.23, 9.12, -23.3, -2.1};
       //            0    1    2    3    4    2Byte
       char[] arc ={'h', 'e', 'l', 'l', 'o'};
       //
       byte[] arb ={3, 127, 5, -15, 8};
       //                   0      1     2     3
       boolean[] arbool = {true, false, true, false};
       //                0         1       2
       String[] ars = {"Hello", "course", "QA"};


       //              0      1    2
       float[] arf = {6.2F, 5.7F, 8.4F};

      // MethodsArray.printArray(arc);
      // System.out.println(MethodsArrays1.arraySum(arc));

       System.out.println(MethodsArraysHW1.arraySum(arbool));

    }
}
