import java.io.*;
import java.util.*;

public class queue {
    public static void main(String[] args) {
	linkedlistq x = new linkedlistq();
	System.out.println("" + x.isEmpty());
	x.enqueue(new Integer(1));
	x.enqueue(new Integer(5));
	System.out.println("" + x.isEmpty());
	x.dequeue();
	x.dequeue();
    }
}

class linkedlistq {
    LinkedList l;
    public linkedlistq() {
	l = new LinkedList();
    }
    public boolean isEmpty() {
	return (l.size() == 0);
    }
    public void enqueue(Object data) {
	l.addLast(data);
    }
    public Object dequeue() {
	Object t = l.removeFirst();
	return t;
    }
    public Object peekFront() {
	return l.getFirst();
    }
}

class arrayq {
    Object[] a;
    int head;
    int tail;
    int size;
    public arrayq() {
	size = 25;
	a = new Object[size];
	int head=0;
	int tail=0;
    }
    public boolean isEmpty() {
	return (head == tail);
    }
    public void enqueue(Object data) {
	a[tail] = data;
	tail++;
	if (tail == size) {
	    tail = 0;
	}
    }
    public Object dequeue() {
	Object x = a[head];
	head++;
	if (head == size) {
	    head=0;
	}
	return x;
    }
    public Object peekFront() {
	return a[head];
    }
}
