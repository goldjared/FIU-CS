public class BinarySearchTree {
  public static class Node {
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
    public static void main(String[] args) {
      BinarySearchTree t = new BinarySearchTree();
      t.Insert(20);
      t.Insert(15);
      t.Insert(25);
      t.Insert(13);
      System.out.println("Root: " + t.getRoot().key);
      System.out.println("Min: " + t.Min(t.getRoot()).key);
      System.out.println("Max: " + t.Max(t.getRoot()).key);
    }

}
