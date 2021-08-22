package day0512;

import java.util.TreeSet;

public class TrddSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i=0; i<score.length; i++)
			set.add(new Integer(score[i]));
		
		System.out.println(set.headSet(new Integer(50)));
		System.out.println(set.tailSet(new Integer(50)));
		

	}

}
