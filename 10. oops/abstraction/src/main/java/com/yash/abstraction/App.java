package com.yash.abstraction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberSizeException
    {
    	Mobile mobile=new Mobile(1,"Samsung m31",10000,"Samsung",6,"exynnos",64);
        mobile.getDetails();
        mobile.showMessage();
        mobile.showMessage(10);
        mobile.orderProduct();
        mobile.a();
        mobile.a(1);
        Mobile m=new Mobile();
    }
}
