package 내가한거;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {42, 456, 7898, 156, 123, 77, 9, 498, 2142, 2, 3, 241, 65756, 553, 767};

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] < arr[j]) { //내림차순
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(i+1 != arr.length) {
                System.out.print(", ");
            }
        }
    }

//    public static void main(String[] args) {
//        int[] arr = {42, 456, 7898, 156, 123, 77, 9, 498, 2142, 2, 3, 241, 65756, 553, 767};
//
//        for(int i=0; i<arr.length; i++) {
//            for(int j=i+1; j<arr.length; j++) {
//                if(arr[i] > arr[j]) { //오름차순
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]);
//            if(i+1 != arr.length) {
//                System.out.print(", ");
//            }
//        }
//    }
}
