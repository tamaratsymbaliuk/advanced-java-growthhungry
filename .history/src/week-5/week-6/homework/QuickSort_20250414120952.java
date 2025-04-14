import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class QuickSort {

    public static <T> void sort(List<T> list, Comparator<T> comparator) {
        if (list == null || list.isEmpty()) {
            return; // Handle empty lists   
        }
        
        quickSort(list, 0, list.size() - 1, comparator);
 }

 public static <T> void quickSort(List<T> list, int low, int high, Comparator<T> comparator) {
     if (low < high) {
         int pivotIndex = partition(list, low, high, comparator);
         // Recursively sorts the left and right parts of the list.
         quickSort(list, low, pivotIndex - 1, comparator);
         quickSort(list, pivotIndex + 1, high, comparator);
     }
 }

 public static <T> int partition(List<T> list, int low, int high, Comparator<T> comparator) {
     T pivot = list.get(high);
     int i = low - 1;

     for (int j = low; j < high; j++) {

         if (comparator.compare(list.get(j), pivot) <= 0) {

             i++;

             swap(list, i, j);

         }

     }

     swap(list, i + 1, high);

     return i + 1;

 }
 
 private static <T> void swap(List<T> list, int i, int j) {

     T temp = list.get(i);

     list.set(i, list.get(j));

     list.set(j, temp);

 }
 



 public static void main(String[] args) {
     List<Integer> intList = new ArrayList<>();
     intList.add(3);
     intList.add(1);
     intList.add(4);
     intList.add(2);
     // Sort by natural order
     sort(intList, Comparator.naturalOrder());

     System.out.println("Sorted integer list: " + intList);
     List<String> stringList = new ArrayList<>();
     stringList.add("Charlie");
     stringList.add("Alice");
     stringList.add("Bob");
     // Sort by custom comparator (e.g., descending order)
     sort(stringList, Comparator.comparing(String::length).reversed());
     System.out.println("Sorted string list (descending order): " + stringList);
     
 }

} 
