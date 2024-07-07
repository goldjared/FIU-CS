public class Heap {
  public static void minHeapify(int[] A, int i) {
    int left = 2 * i;
    int right = 2 * i + 1;
    int smallest = i;

    if (left < A.length && A[left] < A[smallest]) {
      smallest = left;
    }

    if (right < A.length && A[right] < A[smallest]) {
      smallest = right;
    }

    if (smallest != i) {
      int temp = A[smallest];
      A[smallest] = A[i];
      A[i] = temp;
      minHeapify(A, smallest);
    }
  }

  public static void buildMinHeap(int[] A) {
    int heapSize = A.length;
    for (int i = (heapSize / 2) - 1; i >= 0; i--) {
      minHeapify(A, i);
    }
  }

  public static void heapSort(int[] A) {
    buildMinHeap(A);
    int heapSize = A.length;
    for (int i = A.length - 1; i > 0; i--) {
      int temp = A[0];
      A[0] = A[i];
      A[i] = temp;
      heapSize--;
      minHeapify(A, 0);
    }
  }

  public static void main(String[] args) {
    System.out.println("MIN HEAP IMPLEMENTATION");
    // Test case 1:
    int[] arr1 = new int[10];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = (int) (Math.random() * 100);
    }
    System.out.println("Test case 1: Before Heap Sort");
    for (int i : arr1) {
      System.out.print(i + " ");
    }
    heapSort(arr1);
    System.out.println("\nTest case 1: After Heap Sort");
    for (int i : arr1) {
      System.out.print(i + " ");
    }

    // Test case 2:
    int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("\n\nTest case 2: Before Heap Sort");
    for (int i : arr2) {
      System.out.print(i + " ");
    }
    heapSort(arr2);
    System.out.println("\nTest case 2: After Heap Sort");
    for (int i : arr2) {
      System.out.print(i + " ");
    }

    // Test case 3:
    int[] arr3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    System.out.println("\n\nTest case 3: Before Heap Sort");
    for (int i : arr3) {
      System.out.print(i + " ");
    }
    heapSort(arr3);
    System.out.println("\nTest case 3: After Heap Sort");
    for (int i : arr3) {
      System.out.print(i + " ");
    }

  }
}
