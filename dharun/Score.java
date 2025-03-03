package dharun;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		double score = scn.nextInt();
		String dept = scn.next();
		System.out.println("****************");
		System.out.println("MY Name is :"+name);
		System.out.println("MY Score is :"+score/10+"/10");
		System.out.println("MY Deptment is :"+dept);
	}
}
