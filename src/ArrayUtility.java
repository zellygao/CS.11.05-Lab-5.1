import java.util.Arrays;

public class ArrayUtility {

    public static void print(int[] array) {
        System.out.println("array");
    }

    public static int sum(int[] array) {
        int count = 0;
        for(int i =0; i<array.length; i++){
            count += array[i];
        }
        return count;
    }

    public static double average(int[] array) {
        double average = (double) sum(array) / array.length;
        double average2 = Math.floor(average*100.0)/100.0;
        return average2;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for(int i =1; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for(int i =1; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int [array.length];
        for(int i=array.length-1; i>-1;i--){
            reversed[array.length-i-1] = array[i];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        int [] array2 = Arrays.copyOf(array,array.length);
        for(int i=array.length-1; i>-1;i--){
            array[array.length-i-1] = array2[i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
       boolean check = false;
        for(int i=0;i<array.length;i++){
            if(array[i] == num){
                check = true;
            }
        }
        return check;
    }

    public static boolean linearSearchString(String[] array, String str) {
        boolean check = false;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(str)){
                check = true;
            }
        }
        return check;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i=0; i<array.length;i++){
            array[i] = 2 * array[i];
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i=0; i<array.length;i++){
            array[i] = n * array[i];
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for(int i=0; i<array.length; i++){
            if(i!=0){
                result+= ", " + array[i];
            }
            else{ result+= array[i];}
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        boolean check = false;
        int sum = 0;
        for(int i=0; i<array.length; i++){
            for(int k = i+1; k<array.length; k++) {
                if (k!=i){
                    if(array[k] + array[i] == num) {
                        check = true;
                    }
                }
            }
        }
        return check;
    }

    public static void shiftRight(int[] array) {
        int [] array2 = Arrays.copyOf(array, array.length);
        for (int i = 0; i<array.length; i++){
            if(i==0){
                array[0] = array2[array.length-1];
            }
           else{
                array[i] = array2[i-1];
            }
        }
    }

    public static void shiftLeft(int[] array) {
        int [] array2 = Arrays.copyOf(array, array.length);
        for (int i = 0; i<array.length; i++){
            if(i==array.length-1){
                array[array.length-1] = array2[0];
            }
            else{
                array[i] = array2[i+1];
            }
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for(int i=0; i<n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for(int i=0; i<n; i++){
            shiftLeft(array);
        }
    }


}
