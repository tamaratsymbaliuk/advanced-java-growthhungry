public class QuickSort {

    public static <T> void sort(List<T> list, Comparator<T> comparator) {
   // TODO: implement
 }

 public static void main(String[] args) {
     List<Integer> intList = new ArrayList<>();
     intList.add(3);
     intList.add(1);
     intList.add(4);
     intList.add(2);
     // Sort by natural order
     sort(intList, Comparator.naturalOrder());
     
 }

} 
