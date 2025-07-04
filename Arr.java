public class Arr {

    public static void main(String[] args) {
        int[] arr1 = {2,5,2,6,1};
        System.out.println(ArraytoString(arr1));
    }
    public static String ArraytoString(int[] array){
        String a = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1) a+= String.valueOf(array[i]);
            else a += String.valueOf(array[i]) + ", ";
        }
        a+="]";
        return a;
    } //
    public static int[] duyet(int[] array) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];
        }
        return a;
    }//duyet mang
    public static int[] add(int[] array, int index, int value) {
        int[] arr = new int[array.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (index == 0 && array.length == 1) {
                return set(array, 0, value);
            } else {
                if (i == index) {
                    arr[i] = value;
                } else if (i > index) {
                    arr[i] = array[i - 1];
                } else {
                    arr[i] = array[i];
                }
            }

        }

        return arr;
    }//them pt vao mang
    public static int[] delete(int[] array, int index) {
        if (0 > index || index > array.length) {
            return null;
        }

        int[] arrDaXoa = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                arrDaXoa[i] = array[i + 1];
            } else if (i < index) {
                arrDaXoa[i] = array[i];
            } else {
                arrDaXoa[i] = array[i + 1];
            }
            if (i == array.length - 2) {
                break;
            }
        }



        return arrDaXoa;
    }//xoa pt  trong mang
    public static int[] searchArray(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("kh thay");
            return null;
        } else {
            int[] a = new int[count];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (j == count) {
                    break;
                }
                if (array[i] == value) {
                    a[j] = i;
                    j++;
                }
            }
            System.out.println("so luong: " + count);
            return a;
        }
    }//tim kiem val trong mang tra ve vi tri index
    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    array[i] += array[j];
                    array[j] = array[i] - array[j];
                    array[i] -= array[j];
                }
            }
        }

/*        for (int i = 0; i < array.length; i++) {
             int min=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min]){
                    min  =j;
                }
            }

                int temp = array[i];
                array[i] = array[min];
                array[min]= temp;

        }*/
        /*for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }*/
        return array;
    }// sap xep mang tang dan
    public static int[] set(int[] array, int index, int value) {
        int[] a = new int[array.length];
        for (int i = 0; i < a.length; i++) {
            if (i == index) {
                a[i] = value;
            } else {
                a[i] = array[i];
            }
        }
        return a;
    }//thay doi val cua 1 pt trong mang
    public static boolean searchBoolean(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        if (count == 0) {
            return false;
        } else {
            System.out.println("so luong: " + count);
            return true;
        }
    }//tim kiem val trong mang tra ve true/false
    public static int get(int[] array,int index){
        if(0<= index  && index< array.length ){
            for (int i = 0; i < array.length; i++) {
                if(i==index){
                    return array[i];
                }
            }
        }else{

        }
        return 0;
    }//lay val cua pt trong mang

}