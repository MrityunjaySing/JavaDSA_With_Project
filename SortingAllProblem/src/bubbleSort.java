public class bubbleSort {
   static void sort(int arr[]) {
       int  n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                // bubble sort
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
        /*void printArry ( int arr[]){
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }*/


    public static void main(String[] args) {
        bubbleSort ob = new bubbleSort();
      int arr[] = {5,7,3,8,2};
      //ob.
        System.out.println("print sorted array");

        sort(arr);
        for (int i:arr
             ) {
            System.out.print(i+ " ");
        }

        //ob.printArry(arr);

    }
}
