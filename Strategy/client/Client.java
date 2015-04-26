/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents a ``Client" that wants to sort a
  * sequence of numbers using the algorithms offered in the sort package.
  *
  * In GoF's structure, our client class matches ``Context" class.
*/
package client;
import sort.*;
import test.*;
import java.util.*;

public class Client {
  private static final int LIMIT = 100;

  public static void main(String[] args) {
    ArrayList<Integer> listA = new ArrayList<Integer>();
    fill(listA);
    ArrayList<Integer> listB = new ArrayList<Integer>();
    for(Integer n : listA) listB.add(n);
    SortAlg alg1 = new InsertionAlg();
    SortAlg alg2 = new HeapAlg();
    alg1.sort(listA);
    check(listA, "InsertionSort");
    alg2.sort(listB);
    check(listB, "HeapSort");
  }

  private static void fill(ArrayList<Integer> list) {
    for(int i = 0; i < LIMIT; i++)
      list.add(randInt(LIMIT));
  }

  private static int randInt(int n) {
    Random rand = new Random();
    return rand.nextInt(n);
  }

  private static void check(ArrayList<Integer> list,String alg) {
    Test t = new SequentialTest();
    if(t.checkOrder(list))
      System.out.println("Ok for " + alg);
    else
      System.out.println("Error for " + alg);
  }
}
