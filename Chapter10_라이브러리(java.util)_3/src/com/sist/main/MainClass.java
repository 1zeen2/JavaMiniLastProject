package com.sist.main;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
	Set_5 music = new Set_5();
	
	Set<String> genie = music.genieData();
	System.out.println("=============== Genie ===============");
	
	for (String title : genie) {
		System.out.println(title);
	}
	System.out.println("================= Melon ================");
	Set<String> melon = music.melonData();
	
	for (String title : melon) {
		System.out.println(title);
	}
	System.out.println("========== Only Genie Music =============");
	Set<String> gTemp = new HashSet<String>();
	gTemp.addAll(genie);
	gTemp.removeAll(melon);
	
	for (String title : gTemp) {
		System.out.println(title);
	}
	System.out.println("========== Only Melon Music ===========");
	Set<String> mTemp = new HashSet<String>();
	mTemp.addAll(melon);
	mTemp.removeAll(genie);
	
	for (String title : mTemp) {
		System.out.println(title);
	}
	System.out.println("================ Genie Music + Melon Music ===============");
	// => UNION / UNIONALL
	//	 중복 없음 / 중복 있음
	//		|		  |=> ArrayList
	// 		|=> Set<> 으로 2개 사용

	ArrayList<String> list = new ArrayList<String>();
	list.addAll(genie);
	list.addAll(melon);
	
	for (String title : list) {
		System.out.println(title);
	}
	System.out.println("========== Genie + Melon + 중복 없음. ===========");
	Set<String> list2 = new HashSet<String>();
	list2.addAll(genie);
	list2.addAll(melon);
	
	for (String title : list2) {
		System.out.println(title);
	}
	
	
	}
}