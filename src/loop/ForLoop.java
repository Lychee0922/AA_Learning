package loop;

public class ForLoop {

    public static void main(String[] args) {

        int[] array = {15, 21, 1, 3, 12, 6, 8, 3, 5, 19, 10, 18};

        print(array);

        SelectionSort(array);

        print(array);

    }

    // array = [0, 1, 2, ... , n - 1] means array.length
    private static void SelectionSort(int[] array) {            // Algorithm Selection Sort A[]
        for (int i = 0; i <= array.length - 2; i++) {           // for i = 0 to n - 2 do
            int min = i;                                        //     min = i
            for (int j = i + 1; j <= array.length - 1; j++) {   //     for j = i + 1 to n - 1 do
                if (array[j] < array[min]) {                    //         if A[j] < A[min] then
                    min = j;                                    //             min = j
                }                                               //         end if
            }                                                   //     end for
            int temp = array[i];                                //     swap step 1
            array[i] = array[min];                              //     swap step 2
            array[min] = temp;                                  //     swap step 3
        }                                                       // end for
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
