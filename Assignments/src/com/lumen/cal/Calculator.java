package com.lumen.cal;

public interface Calculator {
   void add(int x,int y);
   void product(int x,int y);
   default void difference(double x ,double y) {
	   System.out.println(x-y);
   }
}
