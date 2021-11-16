package tugas1Pm;

public class BubbleSort {
        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }

        }
        public static void main(String[] args) {
            int arr[] ={9, 3, 4, 1,8, 10, 2, 6};

            System.out.println("Array Sebelum dilakukan Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            bubbleSort(arr);
        //sorting array elements using bubble sort

            System.out.println("Array Setelah dilakukan Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        }
    }