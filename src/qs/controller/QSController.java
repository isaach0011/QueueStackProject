package qs.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import qs.model.*;

import qs.model.Customer;

public class QSController
{
	private Queue<Customer> customerQueue;
	private Stack<String> stackOfStrings;
	
	
	public QSController()
	{
		customerQueue = new LinkedList<Customer>();
		stackOfStrings = new Stack<String>();
	}
	
	public void start()
	{
		Customer Joe = new Customer("Joe");
		Customer Joey = new Customer("Joey");
		Customer Jackson = new Customer("Jackson");
		customerQueue.add(Joe);
		customerQueue.add(Joey);
		customerQueue.add(Jackson);
		customerQueue.remove();
		
		System.out.println(customerQueue.peek());
		
		String stringVariable = "I am a String.";
		String variableString = "This is a String.";
		
		stackOfStrings.push(stringVariable);
		stackOfStrings.push(variableString);
		
		stackOfStrings.pop();
		
		System.out.println(stackOfStrings.peek());
	}
}