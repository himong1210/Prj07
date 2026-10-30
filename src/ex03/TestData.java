package ex03;

import java.util.Scanner;

//입력 1줄 -> 결과 1줄
//입력data : 사번,이름,입사일,월급,부서번호
//출력     : 사번,이름,입사일,월급,보너스,수령액,부서명

//금액은 소수이하 두자리로 반올림
//보너스   =  근무연수에 따라 월급의 0.5% 로 계산한다
//수령액   =  월급 + 보너스 
//부서명   =  10:인사,20:자재,30:총무,40:연구개발,50:생산,60:서비스

//모든기능은 class에 구현한다.
//입력data
//사번,이름,입사일,월급,부서번호 
/*
100,사나,20110101,300.0,10      
200,모모,20120301,270.0,20      
300,정연,20091003,250.0,30      
400,나연,20110105,220.0,40      
500,미나,20180401,170.0,60      
600,쯔위,20150801,200.0,50      
*/
interface Ipo{
	void input();
	void process();
	void output();
}

class Data {
	//Fields
	//입력 : 사번,이름,입사일,월급,부서번호
	//       num, name, date, pay,  deptnum
	private int num;
	private String name;
	private int date;
	private double pay;
	private int deptnum;
	
	
	//출력     : 사번,이름,입사일,월급,보너스(근무연수에 따라 월급의 0.5%),
	//           수령액(월급 + 보너스),부서명(10 ~ 60)
	//           num, name, date, pay, bonus, netpay, dept
	private double bonus;
	private double netpay;
	private String dept;
	
	// Constructor
	public Data() {
		
	}

	public Data(int num, String name, int date, double pay, int deptnum) {
		this.num = num;
		this.name = name;
		this.date = date;
		this.pay = pay;
		this.deptnum = deptnum;
	}
	
	// Getter / Setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public int getDeptnum() {
		return deptnum;
	}

	public void setDeptnum(int deptnum) {
		this.deptnum = deptnum;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getNetpay() {
		return netpay;
	}

	public void setNetpay(double netpay) {
		this.netpay = netpay;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// toString
	@Override
	public String toString() {
		return "Data [num=" + num + ", name=" + name + ", date=" + date + ", pay=" + pay + ", deptnum=" + deptnum
				+ ", bonus=" + bonus + ", netpay=" + netpay + ", dept=" + dept + "]";
	}
}

class Dataa implements Ipo{
	
	//Fields
	private Data t;

	//메소드
	@Override
	public void input() {
		//키보드 준비
		Scanner in = new Scanner(System.in);
		
		//
		System.out.println("입력 : 사번, 이름, 입사일, 월급, 부서번호");
		String line = in.nextLine();
		String [] li = line.trim().split(",");
		int num = Integer.parseInt( li[0].trim());
		String name = li[1].trim();
		int date = Integer.parseInt(li[2].trim());
		double pay = Double.parseDouble(li[3].trim());
		int deptnum = Integer.parseInt(li[4].trim());
		
		t = new Data (num, name, date, pay, deptnum);
		
	}

	@Override
	public void process() {
		//
		
		
	}

	@Override
	public void output() {

		System.out.println("사번 이름 입사일 월급 보너스 수령액 부서명");
		String fmt = "%d %s %d %.3f %.3f %.3f %s";
		String msg = String.format(fmt,
				t.getNum(), t.getName(), t.getDate(), t.getPay(),
				t.getBonus(), t.getNetpay(), t.getDept());
		System.out.println(msg);
	}
	
	
}
public class TestData {

	public static void main(String[] args) {
		
		Dataa t1 = new Dataa();
		t1.input();
		t1.process();
		t1.output();
		

	}

}
