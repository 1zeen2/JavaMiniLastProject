package com.sist.ann;

public class BoardSystem {
	@RequestMapping("insert.jsp")
	public void boardSystem(){
		System.out.println("Oracle에 데이터를 추가합니다.");
	}
	@RequestMapping("update.jsp")
	public void boardUpdate() {
		System.out.println("Oracle의 데이터를 수정합니다.");
	}
	@RequestMapping("delete.jsp")
	public void boardDelete() {
		System.out.println("Oracle의 데이터를 삭제합니다.");
	}
	@RequestMapping("select.jsp")
	public void boardSelect() {
		System.out.println("Oracle의 데이터를 읽어옵니다.");
	}
	@RequestMapping("find.jsp")
	public void boardFind() {
		System.out.println("Oracle의 데이터를 찾습니다.");
	}
	
}
