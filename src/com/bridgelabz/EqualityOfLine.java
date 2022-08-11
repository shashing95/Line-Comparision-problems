package com.bridgelabz;

public class EqualityOfLine {

	public static void main(String[] args) {
		int x1 = 1, y1 = 1, x2 = 4, y2 = 4;
		int p1 = 2, q1 = 2, p2 = 5, q2 = 5;
		double line1length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double line2length = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(q2 - q1, 2));
		System.out.println("Length of Two Points=" + line1length);
		System.out.println("Length of Two Points=" + line2length);
		if (line1length == line2length) {
			System.out.println("Two Lines are Equal");
		} else {
			System.out.println("Two Lines are not Equal");
		}

	}

}
