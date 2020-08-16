package com;

import java.util.Scanner;

public class test {

	private static int[][] tFtree;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	    
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.print("請輸入起站位置:");
	    String start = scan.next();
	    System.out.print("請輸入迄站位置:");
	    String end = scan.next();
	    
	    int S1 = getId(start);
	    int S2 = getId(end);
	    
	    if (S1 == 0 || S2 == 0) {
	    	System.out.print("起訖位置輸入錯誤");
	    } else {
	    	int fee = getFee(S1, S2);
	    	System.out.print("費用:" + fee);
	    }
	    
	    
	    scan.close();
	}

	private static int getFee(int s1, int s2) {
		int[][] tFtree = {{0, 405, 800, 1420, 1560}, 
	    		{405, 0, 800, 1140, 1280}, {800, 520, 0, 750, 885},
	    		{1420, 1140, 750, 0, 260}, {1560, 1280, 885, 260, 0}
	    };
		
		return tFtree[s1-1][s2-1];
	}

	private static int getId(String start) {
		String stat[] = {"台北", "新竹", "台中", "台南", "高雄" };
		
		for (int i=1; i <= stat.length; i++) {
			if (stat[i-1].equals(start)) {
				return i;
			}
		}
		return 0;
	}

}
