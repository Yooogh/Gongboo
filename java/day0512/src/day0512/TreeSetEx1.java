package day0512;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
				
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("ailen");
		set.add("bat");
		set.add("car");
		set.add("Cat");
		set.add("disc");
		set.add("dance");
		set.add("dZZZ");
		set.add("dzzz");
		set.add("elepahant");
		
		System.out.println(set); //set 출력
		System.out.println("rage search : from "+from+" to "+to);
		//b에서 d까지
		System.out.println("result1 : " + set.subSet(from, to));
		//b에서 d까지: d,c
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		//from~to+zzz

	}

}
