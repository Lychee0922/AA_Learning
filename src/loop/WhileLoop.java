package loop;

public class WhileLoop {

    public static void main(String[] args) {

        int[] array = {3,2,4,6,1,4,6,7};
        print(array);
        Fun(array);
        print(array);

    }

    private static void Fun(int[] array) {
        for (int i = 1; i <= array.length - 1; i++) {
            int v = array[i];
            int j = i - 1;                      // 1.condition
            while (j >= 0 && array[j] > v) {    // 2.check condition
                array[j + 1] = array[j];
                j--;                            // 3.manipulate condition
            }
            array[j + 1] = v;
        }
    }

    private static void print(int[] array){
        for (int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
