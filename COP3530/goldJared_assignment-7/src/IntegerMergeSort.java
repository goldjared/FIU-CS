public class IntegerMergeSort {

  public void mergeSort(int[] A, int lowerBound, int upperBound) {
    if (lowerBound < upperBound) {
      int midPoint = (lowerBound + upperBound) / 2;

      mergeSort(A, lowerBound, midPoint);
      mergeSort(A, midPoint + 1, upperBound);

      merge(A, lowerBound, midPoint, upperBound);
    }
  }

  public void merge(int[] A, int lowerBound, int midPoint, int upperBound) {
    int n1 = midPoint - lowerBound + 1;
    int n2 = upperBound - midPoint;

    int[] lArray = new int[n1];
    int[] rArray = new int[n2];

    for (int i = 0; i < n1; ++i) {
      lArray[i] = A[lowerBound + i];
    }
    for (int j = 0; j < n2; ++j) {
      rArray[j] = A[midPoint + 1 + j];
    }

    int i = 0, j = 0;

    // Initial index
    int k = lowerBound;
    while (i < n1 && j < n2) {
      if (lArray[i] <= rArray[j]) {
        A[k] = lArray[i];
        i++;
      } else {
        A[k] = rArray[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      A[k] = lArray[i];
      i++;
      k++;
    }

    while (j < n2) {
      A[k] = rArray[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    IntegerMergeSort sorter = new IntegerMergeSort();
    int[] array = {100, 1000, 1, -1, 10, 50, 500, -500};

    System.out.println("Original Array:");
    printArray(array);

    sorter.mergeSort(array, 0, array.length - 1);

    System.out.println("\nSorted Array: ");
    printArray(array);

    System.out.println();


    array = new int[]{-100, -1000, -1, -1, -10, -50, 500, -500};

    System.out.println("Original Array:");
    printArray(array);

    sorter.mergeSort(array, 0, array.length - 1);

    System.out.println("\nSorted Array: ");
    printArray(array);

  }

  static void printArray(int[] array) {
    int n = array.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}