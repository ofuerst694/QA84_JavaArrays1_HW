public class MainJavaArrays {
    public static void main(String[] args) {
     int[]  ar ={9,2,5,-1,8,3,6,4} ;
        System.out.println(ar[2]);
        int a = ar[0] + ar[2];
        System.out.println("a = " + a);
        int [] ar1 = ar;
        ar1[0] = 10;
        System.out.println(ar[0]);
        ar = null;
        System.out.println(ar1[5]);

        int[] ar2 = new int[6];
        ar2[3] = -2;
        System.out.println(ar2.length);

        System.out.println(ar2[0]);



    }
    /*
            0  1  2  3  4  5
    ar2 -> [0][0][0][-2][0][0]
     */
}

/*
     0  1  2   3  4  5  6  7
ar->[9][2][5][-1][8][3][6][4]

 */