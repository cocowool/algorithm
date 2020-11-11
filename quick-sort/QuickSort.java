class QuickSort {
    public static int[] qsort(int arr[], int start, int end){
        int refNumber = arr[start];
        int i = start;
        int j = end;

        while( i < j ){
            while( (i < j) && (arr[j] > refNumber) ){
                j--;
            }
            while( (i < j) && (arr[i] < refNumber) ){
                i++;
            }

            if( (arr[i] == arr[j]) && (i < j)){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        if( i - 1 > start) arr = qsort(arr, start, i - 1);
        if( j + 1 < end ) arr = qsort(arr, j + 1 ,end);

        return arr;
    }

    public static void main(String[] args){
        int arr[] = new int[]{ 5, 10, 2, 15, 21, 99, 3, 1, 17, 23, 1, 35};
        int len = arr.length - 1;
        arr = qsort(arr, 0, len);

        for(int i:arr){
            System.out.print(i + "\t");
        }
    }
}