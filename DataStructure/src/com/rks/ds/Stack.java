package com.rks.ds;

import java.util.Scanner;

class Stack {
	
	static Scanner sc = new Scanner(System.in);
	static int stack[], top = -1, size;
	
	static {
		Stack.create();
	}

	public Stack() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String args[]) {
		int ch, item;
		while(true)
		{
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("4. Traverse");
		System.out.println("5. Quit");
		
		System.out.print("Enter your choice : ");
		ch = sc.nextInt();
		
		switch(ch) {
		case 1: System.out.println("Enter element: ");
			    item = sc.nextInt();
			    push(item);
				break;
		case 2: item = Stack.pop();
				if(item == 0) {
					System.out.println("Stack is underflow \n");
				} else {
					System.out.println("Popped item : "+ item);
				}
				break;
		case 3: item = Stack.peek();
				if(item == 0) {
					System.out.println("Stack is underflow \n");
				} else {
					System.out.println("Popped item : "+ item);
				}		
				break;
		case 4: traverse();
				break;
		case 5: System.exit(1);
		default: System.out.println("Invalde choice");
		}
		
		}
	}
	
	static void create() {
		
		System.out.println("Enter size of stuck");
		size = sc.nextInt();
		
		stack = new int[size];
		System.out.println("Size ==>"+ size);
	}
	
	static void push(int item) {
		if(Stack.isFull()) {
			System.out.println("Stack is overflow");
		} else {
			stack[++top] = item;
		}
	}
	
	static int pop() {
		if(Stack.isEmpty()) {
			return 0;
			
		} else {
			return stack[top--];
		}
	}
	
	static int peek() {
		if (Stack.isEmpty()) {
			return 0;
		} else {
			return stack[top];
		}
	}
	
	static void traverse() {
		if(Stack.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Elements of stack : ");
			
			for(int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
			
		}
	}
	
	static boolean isFull() {
		if(top == size-1) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isEmpty() {
		if(top == -1) {
			return true;
		} else {
			return false;
		}
	}

}
