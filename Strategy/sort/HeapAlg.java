/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents the GoF's ``StrategyB" class.
  *
  * HeapAlg uses HeapSort to sort the given set.
*/
package sort;
import java.util.*;

public class HeapAlg implements SortAlg {

  public void sort(ArrayList<Integer> list) {
    Heap heap = new Heap(list);
    heap.sort();
    list = heap.getList();
  }

  private class Heap {
    ArrayList<Integer> heap;
    ArrayList<Integer> result = new ArrayList<Integer>();

    public Heap(ArrayList<Integer> list) {
      heap = list;
    }

    public void sort() {
      buildMaxHeap();
      for(int i = heap.size(); i >= 1; i--) {
        result.add(0);
        swap(heap,0,i-1);
        heap.remove(i-1);
        maxHeapify(0);
      }
    }

    public void buildMaxHeap() {
      for(int i = heap.size() / 2; i >= 0; i--)
        maxHeapify(i);
    }

    public void maxHeapify(int index) {
      int left = 2 * index;
      int right = 2 * index + 1;
      int biggest = index;
      if(left < heap.size() && heap.get(left) > heap.get(biggest))
        biggest = left;
      if(right < heap.size() && heap.get(right) > heap.get(biggest))
        biggest = right;
      if(biggest != index) {
        swap(heap,index,biggest);
        maxHeapify(biggest);
      }
    }

    public ArrayList<Integer> getList() {
      return result;
    }
  }

  private void swap(ArrayList<Integer> list, int a, int b) {
    int temp = list.get(a).intValue();
    list.set(a,list.get(b));
    list.set(b,new Integer(temp));
  }
}
