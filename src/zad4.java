public class zad4 {
    public static void main(String[] args) {
        double mediana;
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        int length = nums1.length + nums2.length;
        int[] tab = new int[length];
        System.arraycopy(nums1, 0, tab, 0, nums1.length);
        System.arraycopy(nums2, 0, tab, nums1.length, nums2.length);

        tab = quickSort(tab, 0, tab.length - 1);

        if(length%2 == 1){
            mediana = tab[(length/2)];
        }else{
            mediana = (tab[length/2] + tab[(length/2) - 1]);
            mediana = mediana/2;
        }

        System.out.println(mediana);
    }

    public static int[] quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
        return arr;
    }

    public static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
