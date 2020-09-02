package Stack;

public class Stack {
	private int[] arr;
	private int top = 0;
	public Stack(int stackSize) {
		this.arr = new int[stackSize];
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("pop : " + stack.pop());
		System.out.println("peek : " + stack.peek());
	}
	
	private void push(int i) {
		if(top < arr.length) {
			arr[top++] = i;
			System.out.println("pushed : " + i);
		} else {
			System.out.println("stack is full");
		}
	}
	
	private int pop() {
		if(top > 0) {
			return arr[--top];
		} else {
			throw new java.util.NoSuchElementException();
		}
	}
	
	private int peek() {
		return arr[top - 1];
	}
}