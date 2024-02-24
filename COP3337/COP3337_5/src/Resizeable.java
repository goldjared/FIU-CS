// Interface will require any class which implements it to also implement the resize method.
public interface Resizeable {
	// resize is an abstract method by default, since it is within an interface
	void resize(int percent);
}
