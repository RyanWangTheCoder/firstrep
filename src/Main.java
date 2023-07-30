import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int array_length = 10;
        int[] my_array = new int[array_length];
        for (int i = 0; i < array_length; i++) {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(10);
            my_array[i]=rand_int1;
            System.out.print(my_array[i]+" ");
        }
        System.out.println();
        int pivot = my_array[array_length-1];
        System.out.println(pivot);
        quicksort(pivot, my_array);

    }
    public static void quicksort(int pivot, int[] my_array){
        int smaller_element = 0;
        for (int i = 0; i < my_array.length-1; i++) {
            if (my_array[i]<=pivot){
                swap(smaller_element, i, my_array);
                smaller_element++;

            }

        }
        for (int j : my_array) {
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println(smaller_element);

    }
    public static void swap(int index_1, int index_2 , int[] my_array){
        int save;
        save = my_array[index_1];
        my_array[index_1]= my_array[index_2];
        my_array[index_2]=save;

    }
}