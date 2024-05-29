package stack;

public class Stack <T> {
  private static class Node <T> {
    private T data;
    private Node<T> next;
  }
  private Node<T> top;

  private int size;

  public Stack() {
    top = null;
    size = 0;
  }

  public void push(T data) {
    Node<T> newNode = new Node<>();
    newNode.data = data;
    newNode.next = top.next;
    top = newNode;
    size++;
  }

  public T pop() {
    if(top == null) throw new IndexOutOfBoundsException();

    T data = top.data;
    top = top.next;
    size--;
    return data;
  }

}
