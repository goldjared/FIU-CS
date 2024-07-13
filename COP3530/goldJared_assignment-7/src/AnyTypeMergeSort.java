public class AnyTypeMergeSort<T extends Comparable<T>> {

  public void mergeSort(T[] A, int lowerBound, int upperBound) {
    if (lowerBound < upperBound) {
      int midPoint = (lowerBound + upperBound) / 2;

      mergeSort(A, lowerBound, midPoint);
      mergeSort(A, midPoint + 1, upperBound);
      merge(A, lowerBound, midPoint, upperBound);
    }
  }

  public void merge(T[] A, int lowerBound, int midPoint, int upperBound) {
    int n1 = midPoint - lowerBound + 1;
    int n2 = upperBound - midPoint;

    // temporary arrays
    T[] leftArray = (T[]) new Comparable[n1];
    T[] rightArray = (T[]) new Comparable[n2];

    // Copy
    for (int i = 0; i < n1; ++i) {
      leftArray[i] = A[lowerBound + i];
    }
    for (int j = 0; j < n2; ++j) {
      rightArray[j] = A[midPoint + 1 + j];
    }

    // Initial indices
    int i = 0, j = 0;

    int k = lowerBound;
    while (i < n1 && j < n2) {
      if (leftArray[i].compareTo(rightArray[j]) <= 0) {
        A[k] = leftArray[i];
        i++;
      } else {
        A[k] = rightArray[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements of left, if
    while (i < n1) {
      A[k] = leftArray[i];
      i++;
      k++;
    }

    // Copy remaining elements of right, if
    while (j < n2) {
      A[k] = rightArray[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    AnyTypeMergeSort<String> sorter = new AnyTypeMergeSort<>();
    String[] array = {"jared", "is", "an", "computer", "scientist"};

    System.out.println("Original Array:");
    printArray(array);

    sorter.mergeSort(array, 0, array.length - 1);

    System.out.println("\nSorted Array:");
    printArray(array);
    System.out.println();

    array = new String[] {"Zebras", "Are", "Dangerous", "At", "Night"};

    System.out.println("Original Array:");
    printArray(array);

    sorter.mergeSort(array, 0, array.length - 1);

    System.out.println("\nSorted Array:");
    printArray(array);

  }

  static <T> void printArray(T[] array) {
    int n = array.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
