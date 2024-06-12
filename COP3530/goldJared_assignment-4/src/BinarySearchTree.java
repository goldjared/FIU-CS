public class BinarySearchTree {
  private static class Node {
    int key;
    Node left;
    Node right;

    Node(int value) {
      key = value;
      left = null;
      right = null;
    }
  }

    private static Node root;

    public Node getRoot() { return root; }

    public void Insert(int key) {
      Node newNode = new Node(key);
      Node y = null;
      Node x = root;

      while(x != null) {
        y = x;
        if(key < y.key)
          x = x.left;
        else x = x.right;
      }
      // if y is null, tree is empty. Root = newNode
      if(y == null)
        root = newNode;
      else if(key < y.key)
        y.left = newNode;
      else y.right = newNode;
    }

    public Node Max(Node x) {
      while(x.right != null) {
        x = x.right;
      }
      return x;
    }

    public Node Min(Node x) {
      while (x.left != null) {
        x = x.left;
      }
      return x;
    }

    public Node Search(Node x, int k) {
      if(x == null || x.key == k) return x;

      if(k < x.key) return Search(x.left, k);
      else return Search(x.right, k);
    }
    public static void main(String[] args) {
      BinarySearchTree t = new BinarySearchTree();
      t.Insert(20);
      Node root = t.getRoot();

      t.Insert(15);
      t.Insert(25);
      t.Insert(13);
      t.Insert(9);
      t.Insert(10);
      t.Insert(11);
      t.Insert(12);
      System.out.println("--------------------------------");
      System.out.println("Root: " + root.key);
      System.out.println("Min: " + t.Min(root).key);
      System.out.println("Max: " + t.Max(root).key);
      System.out.println("--------------------------------");
      t.Insert(44);
      System.out.println("*Inserted 44, new max should be 44*");
      System.out.println("Root: " + root.key);
      System.out.println("Min: " + t.Min(root).key);
      System.out.println("Max: " + t.Max(root).key);
      System.out.println("--------------------------------");
      System.out.println("Search for existing value 11: " + t.Search(root, 11));
      System.out.println("Search for non-existing value 110: " + t.Search(root, 110));
      System.out.println("Search for existing value 13: " + t.Search(root, 13));
      System.out.println("Search for existing value 9: " + t.Search(root, 9));
      System.out.println("Search for non-existing value 30: " + t.Search(root, 30));
      System.out.println("--------------------------------");
      t.Insert(1);
      System.out.println("*Inserted 1, new min should be 1*");
      System.out.println("Root: " + root.key);
      System.out.println("Min: " + t.Min(root).key);
      System.out.println("Max: " + t.Max(root).key);
    }

}
