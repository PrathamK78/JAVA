package Practice;

//BINARY SEARCH
public class Algorithms {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        int index = binarySearch(sortedArray, target);
        System.out.println(index);
    }
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Target found at index mid
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
}

//BUBBLE SORT
//public class Algorithms {
//    public static void main(String[] args) {
//        int[] array = {64, 34, 25, 12, 22, 11, 90};
//        bubbleSort(array);
//
//        System.out.println("Sorted array:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//    }
//    static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // Swap arr[j] and arr[j+1]
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//}


//SELECTION SORT
//class Algorithms{
//    public static void main(String[] args) {
//            int[] array = {64, 34, 25, 12, 22, 11, 90};
//            selectionSort(array);
//
//            System.out.println("Sorted array:");
//            for (int num : array) {
//                System.out.print(num + " ");
//            }
//        }
//        static void selectionSort(int[] arr) {
//            int n = arr.length;
//            for (int i = 0; i < n - 1; i++) {
//                int minIndex = i;
//                for (int j = i + 1; j < n; j++) {
//                    if (arr[j] < arr[minIndex]) {
//                        minIndex = j;
//                    }
//                }
//                // Swap arr[i] and arr[minIndex]
//                int temp = arr[i];
//                arr[i] = arr[minIndex];
//                arr[minIndex] = temp;
//            }
//        }
//    }


//INSERTION SORT
//class Algorithms{
//    public static void main(String[] args) {
//            int[] array = {64, 34, 25, 12, 22, 11, 90};
//            insertionSort(array);
//
//            System.out.println("Sorted array:");
//            for (int num : array) {
//                System.out.print(num + " ");
//            }
//        }
//        static void insertionSort(int[] arr) {
//            int n = arr.length;
//            for (int i = 1; i < n; i++) {
//                int key = arr[i];
//                int j = i - 1;
//
//                while (j >= 0 && arr[j] > key) {
//                    arr[j + 1] = arr[j];
//                    j--;
//                }
//
//                arr[j + 1] = key;
//            }
//        }
//    }

//MERGE SORT
//public class Algorithms {
//    public static void main(String[] args) {
//        int[] array = {6,3,9,5,2,8};
//mergeSort(array,0, array.length-1);
//printArr(array);
//    }
//    public static void printArr(int[] array){
//        for (int i=0;i< array.length;i++){
//            System.out.print(array[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void mergeSort(int[] array,int startIndex,int endIndex){
//        if (startIndex>=endIndex){
//            return;
//        }
////mid find
//        int mid = startIndex+(endIndex-startIndex)/2;
//        mergeSort(array,startIndex,mid);
//        mergeSort(array,mid+1,endIndex);
//merge(array,startIndex,mid,endIndex);
//    }
//    public static void merge(int[] array,int startIndex,int mid,int endIndex){
//        int[] temp = new int[endIndex-startIndex+1];
//        int i = startIndex;
//        int j = mid+1;
//        int k=0;
//        while (i<=mid && j<=endIndex) {
//            if (array[i] < array[j]) {
//                temp[k] = array[i];
//                i++;
//            } else {
//                temp[k] = array[j];
//                j++;
//            }
//            k++;
//        }
//            while (i<=mid){
//                temp[k++]=array[i++];
//            }
//            while (j<=endIndex){
//                temp[k++]=array[j++];
//            }
//            for (k=0,i=startIndex;k<temp.length;k++,i++){
//                array[i]=temp[k];
//            }
//
//    }
//}


//QUICK SORT
//public class Algorithms {
//    public static void main(String[] args) {
//        int[] array = {6,3,9,8,2,5};
//        quickSort(array,0,array.length-1);
//        printArr(array);
//    }
//    public static void printArr(int[] array){
//        for (int i =0;i< array.length;i++){
//            System.out.print(array[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void quickSort(int[] array, int startIndex, int endIndex){
//        if(startIndex>=endIndex){
//            return;
//        }
//        int pIndex = partition(array,startIndex,endIndex);
//        quickSort(array,startIndex,pIndex-1);
//        quickSort(array,pIndex+1,endIndex);
//    }
//    public static int partition(int[] array,int startIndex , int endIndex){
//        int pivot = array[endIndex];
//        int i = startIndex-1; //to make place for elements less than pivot
//        for(int j=startIndex;j<endIndex;j++){
//            if (array[j]<=pivot){
//                i++;
//                //swap
//                int temp = array[j];
//                array[j] = array[i];
//                array[i] = temp;
//            }
//        }
//        i++;
//        int temp = pivot;
//        array[endIndex] = array[i];
//        array[i] = temp;
//        return i;
//    }
//}

//MODIFIED BINARY SEARCH
//public class Algorithms {
//    public static void main(String[] args) {
//        int[] array = {4,5,6,7,0,1,2};
//        int target = 0;
//        int tarIdx = search(array,target,0,array.length-1);
//        System.out.println(tarIdx);
//    }
//    public static int search(int[] array,int target,int si,int ei){
//        int mid = si+(ei-si)/2;   
//        if(si>ei){
//            return -1;
//        }
//        if (array[mid]==target){
//            return mid;
//        }
//        if (array[si]<=array[mid]){
//            if (array[si]<=target && target<=array[mid]){
//                return search(array,target,si,mid-1);
//            }
//            else {
//                return search(array,target,mid+1,ei);
//            }
//        }
//        else {
//            if (array[mid]<=target && target<=array[ei]){
//                return search(array,target,mid+1,ei);
//            }
//            else {
//                return search(array,target,si,mid-1);
//            }
//        }
//        //return -1;
//    }
//}

