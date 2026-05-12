public class MethodsArraysHW1 {
    public static int arraySum(byte[] ar){
        int sum = 0;
        for (byte num: ar){
            sum = sum + num;
            //sum += num;
        }
        return sum;
    }

    public static double arraySum(double[] ar){
        double sum = 0;
        for (double num: ar){
            sum = sum + num;
        }
        return sum;
    }

    public static double arraySum(float[] ar){
        double sum = 0;
        for (float num: ar){
            sum = sum + num;
        }
        return sum;
    }

    public static byte arraySum(boolean[] ar){
        byte sum = 0;
        for (boolean num: ar){
            if(num){}
        }
        return sum;
    }
}
