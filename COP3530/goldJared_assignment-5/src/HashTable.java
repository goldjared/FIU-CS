import java.util.Arrays;

public class HashTable {
  int[] table;
  int size;
  int capacity;

  public HashTable(int capacity) {
    this.capacity = capacity;
    size = 0;
    table = new int[capacity];
    Arrays.fill(table, -1);
  }

  private int primaryHash(int key) {
    return key % capacity;
  }

  private int secondaryHash(int key) {
    return 1 + (key % (capacity - 1));
  }

  private int getLinearProbIndex(int key, int i) {
    return (primaryHash(key) + i) % capacity;
  }

  private int getQuadraticProbIndex(int key, int i) {
    return (primaryHash(key) + i * i) % capacity;
  }

  private int getDoubleHash(int key, int i) {
    return (primaryHash(key) + i * secondaryHash(key)) % capacity;
  }

  public void insertLinearProbing(int key) {
    int i = 0;
    int index;
    while (i < capacity) {
      index = getLinearProbIndex(key, i);
      if (table[index] == -1) {
        table[index] = key;
        size++;
        return;
      }
      i++;
    }
    System.out.println("Hash table is full");
  }

  public void insertQuadraticProbing(int key) {
    int i = 0;
    int index;
    while (i < capacity) {
      index = getQuadraticProbIndex(key, i);
      if (table[index] == -1) {
        table[index] = key;
        size++;
        return;
      }
      i++;
    }
    System.out.println("Table full");
  }

  public void insertDoubleHashing(int key) {
    int i = 0;
    int index;
    while (i < capacity) {
      index = getDoubleHash(key, i);
      if (table[index] == -1) {
        table[index] = key;
        size++;
        return;
      }
      i++;
    }
    System.out.println("Hash table full");
  }

  public boolean searchLinearProbing(int key) {
    int i = 0;
    int index;
    do {
      index = getLinearProbIndex(key, i);
      if (table[index] == key) {
        return true;
      }
      if (table[index] == -1) {
        return false;
      }
      i++;
    } while (i < capacity);
    return false;
  }

  public boolean searchQuadraticProbing(int key) {
    int i = 0;
    int index;
    do {
      index = getQuadraticProbIndex(key, i);
      if (table[index] == key) {
        return true;
      }
      if (table[index] == -1) {
        return false;
      }
      i++;
    } while (i < capacity);
    return false;
  }

  public boolean searchDoubleHashing(int key) {
    int i = 0;
    int index;
    do {
      index = getDoubleHash(key, i);
      if (table[index] == key) {
        return true;
      }
      if (table[index] == -1) {
        return false;
      }
      i++;
    } while (i < capacity);
    return false;
  }

  public void displayTable() {
    for (int i = 0; i < capacity; i++) {
      if (table[i] != -1) {
        System.out.println("Index " + i + ": " + table[i]);
      } else {
        System.out.println("Index " + i + ": Empty");
      }
    }
  }

  public static void main(String[] args) {
    HashTable table = new HashTable(11);
    System.out.println("*Hash Table*");

    System.out.println("Linear Probing:");
    table.insertLinearProbing(10);
    table.insertLinearProbing(22);
    table.insertLinearProbing(31);
    table.insertLinearProbing(4);
    table.insertLinearProbing(15);
    table.insertLinearProbing(28);
    table.insertLinearProbing(17);
    table.insertLinearProbing(88);
    table.insertLinearProbing(59);
    table.displayTable();
    System.out.println();

    System.out.println("Searching via Linear Probing:");
    System.out.println("Search 22: " + table.searchLinearProbing(22));
    System.out.println("Search 88: " + table.searchLinearProbing(88));
    System.out.println("Search 100: " + table.searchLinearProbing(100));
    System.out.println();

    table = new HashTable(11);
    System.out.println("Quadratic Probing:");
    table.insertQuadraticProbing(10);
    table.insertQuadraticProbing(22);
    table.insertQuadraticProbing(31);
    table.insertQuadraticProbing(4);
    table.insertQuadraticProbing(15);
    table.insertQuadraticProbing(28);
    table.insertQuadraticProbing(17);
    table.insertQuadraticProbing(88);
    table.insertQuadraticProbing(59);
    table.displayTable();
    System.out.println();

    System.out.println("Searching via Quadratic Probing:");
    System.out.println("Search 22: " + table.searchQuadraticProbing(22));
    System.out.println("Search 88: " + table.searchQuadraticProbing(88));
    System.out.println("Search 100: " + table.searchQuadraticProbing(100));
    System.out.println();

    table = new HashTable(11);
    System.out.println("Double Hashing:");
    table.insertDoubleHashing(10);
    table.insertDoubleHashing(22);
    table.insertDoubleHashing(31);
    table.insertDoubleHashing(4);
    table.insertDoubleHashing(15);
    table.insertDoubleHashing(28);
    table.insertDoubleHashing(17);
    table.insertDoubleHashing(88);
    table.insertDoubleHashing(59);
    table.displayTable();
    System.out.println();

    System.out.println("Searching via Double Hashing:");
    System.out.println("Search 22: " + table.searchDoubleHashing(22));
    System.out.println("Search 88: " + table.searchDoubleHashing(88));
    System.out.println("Search 100: " + table.searchDoubleHashing(100));

  }


}
