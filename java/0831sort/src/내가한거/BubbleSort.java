package 내가한거;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 7, 3, 9, 2, 1, 8, 6};

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a.length-i-1;j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]=temp;
                }
            }
        }

        for (int i : a) {
            System.out.print(i+" ");
        }
    }

}
