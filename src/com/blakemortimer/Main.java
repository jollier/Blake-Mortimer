package com.blakemortimer;

public class Main {

	public static void main(String[] args) {
		
        Triangle t = new Triangle(2l, 4l, 6l);
        System.out.println(t.dimension());
        System.out.println(t);
        
        Triangle tr = new Triangle(3l, 4l, 5l);
        System.out.println(tr.dimension());
        System.out.println(tr);
        
        Triangle ti = new Triangle(2l, 2l, 3l);
        System.out.println(ti.dimension());
        System.out.println(ti);
        
        Triangle tequi = new Triangle(2l, 2l, 2l);
        System.out.println(tequi.dimension());
        System.out.println(tequi);
        
        Triangle trien = new Triangle(2l, 2l, 9l);
        System.out.println(trien.dimension());
        System.out.println(trien);
	}
   
}

