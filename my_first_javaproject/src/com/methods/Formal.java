package com.methods;
import java.util.Scanner;
public class Formal {

	public  void main(String[] args) {
	Scanner sc = new Scanner	(System.in);
	System.out.println("Enter Square value :");
	int s = sc.nextInt();
	double square = area_Sque(s);
	System.out.println("Total Square :"+ square);
	System.out.println("================================");
	
	System.out.println("enter b value:");
	int b = sc.nextInt();
	System.out.println("enter h value :");
	int h = sc.nextInt();
	double triangle = area_tri(b,h);
	System.out.println("Total triangle :"+triangle);
	System.out.println("=================================");
	
	System.out.println("enter l value:");
	int l = sc.nextInt();
	System.out.println("enter b value:");
	int br = sc.nextInt();
	double rectangle = area_rec(l, br);
	System.out.println("Total rectangle:"+rectangle);
	System.out.println("================================");
	
	System.out.println("enter r value :");
	int r = sc.nextInt();
	double circle = area_Cir(r);
	System.out.println("total circle :"+circle);
	}
	double area_Sque(int s)
	{
		int area_square = s * s;
		return area_square;
	}
	
	double area_tri(int b,int h)
	{
		double area_tri = 0.5 * b * h;
		return area_tri; 
	}
	
	double area_rec(int l, int br)
	{
		int area_rect = l*br;
		return area_rect;
	}
	
	double area_Cir(int r)
	{
		double area_cir = Math.PI * r * r;
		return area_cir;
	}
}

