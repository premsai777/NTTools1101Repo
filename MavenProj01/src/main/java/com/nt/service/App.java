package com.nt.service;

/**
 * Hello world!
 *
 */
public class App 
{
	public int sum(int a,int b) {
		System.out.println("App.sum()");
		return a+b;
	}
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println(app.sum(20, 30));
    }
}
