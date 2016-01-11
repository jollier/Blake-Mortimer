package com.blakemortimer;

public class Main {

	public static void main(String[] args) {
		// Triangle
        Triangle t = new Triangle(2l, 4l, 6l);
        System.out.println(t.dimension());
        System.out.println(t);
        //Triangle rectangle
        Triangle tr = new Triangle(3l, 4l, 5l);
        System.out.println(tr.dimension());
        System.out.println(tr);
        //triangle isocele
        Triangle ti = new Triangle(2l, 2l, 3l);
        System.out.println(ti.dimension());
        System.out.println(ti);
        //pas triangle
        Triangle trien = new Triangle(2l, 2l, 9l);
        System.out.println(trien.dimension());
        System.out.println(trien);

		
		
	}

    
}
