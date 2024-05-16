package com.sist.main;

class AA {
	void aaa(){}
	private void bbb() {}
	protected void ccc() {}
	public void ddd() {}
}

class BB extends AA {

	private void bbb() {
		
	}
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		super.aaa();
	}

	@Override
	protected void ccc() {
		// TODO Auto-generated method stub
		super.ccc();
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		super.ddd();
	}
	
}
class ASA {
	int i = 100;
}

class ASAA extends ASA {
	int i = 200;
}
public class MainClass {

	public static void main(String[] args) {
		AA a = new BB();
		BB b = (BB)a;
		
		ASAA s = new ASAA();
		
		System.out.println(s.i);
//		BB b = (BB)new AA(); <<= 오류가 발생하는 코드. 상위 클래스를 가지고 오려면 생성자가 동일해야 한다.

	}

}
