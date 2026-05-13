public class MethodsArrays1 {

    public static String arraySum(char[] ar){
        String res = "";//empty string (пустой стринг не null)
        for (char c: ar){
            res = res + c;
            //res +=c;
        }
        return  res;
    }
    /*
    ar-[]{'h', 'e', 'l', l, 'o'};
                          c
     */

    public static String arraySum(String[] ar){
        String res = "";//empty string (пустой стринг не null)
        for (String s:ar){
            res = res + s + " ";
        }
        res +=".";
        return res;
    }
    /*
            0        1       2
    ar->["Hello"]["course"]["QA"]
                              s
             "Hello course QA ."
     */

    public static int arraySum(int[] ar){
        int sum = 0;
        for (int num: ar){
            sum = sum + num;
            //sum += num;
        }
        return sum;
    }

/*
    public static int arraySum(byte[] ar){
        int sum = 0;
        for (byte num: ar){
            sum = sum + num;
            //sum += num;
        }
        return sum;
    }

 */
}





/*
HW
1.
public static int arraySum(byte[]ar)
ar->{3, 127, 5, -15, 8};
        return sum of elements
2.
public static double arraySum(double[] ar)
ar-> {8.3, 7.23, 9.12, -23.3, -2.1};
        return sum of elements
3.
public static double arraySum(float[] ar)
ar-> {6.2F, 5.7F, 8.4F};
        return sum of elements
4.ADVANCE
public static byte arraySum(boolean[] ar)
ar-> {true,false,true,false};
        1    0     1    0
        return sum of 1, when true.


/*
     int sum =26
     0  1  2  3  4  5   6   7 ar.length = 7
ar->[9][6][2][1][7][4][-3]
                       num

 */
/*
HW
1.
public static int arraySum(byte[]ar)
ar->{3, 127, 5, -15, 8};
return sum of elements
2.
public static double arraySum(double[] ar)
ar-> {8.3, 7.23, 9.12, -23.3, -2.1};
return sum of elements
3.
public static double arraySum(float[] ar)
ar-> {6.2F, 5.7F, 8.4F};
return sum of elements
4.ADVANCE
public static byte arraySum(boolean[] ar)
ar-> {true,false,true,false};
        1    0     1    0
return sum of 1, when true.

 */
/*
     int sum =26
     0  1  2  3  4  5   6   7 ar.length = 7
ar->[9][6][2][1][7][4][-3]
                       num

 */
