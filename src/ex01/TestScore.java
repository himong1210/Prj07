package ex01;

/*  1번
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/

//입력:번호,이름,국어,영어,수학
//num, name, kor, eng, mat
//출력:번호 이름 국어 영어 수학 총점 평균 등급
//num, name, kor, eng, mat, tot, avg, grade

class Score {
	//fields
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	//출력:번호 이름 국어 영어 수학 총점 평균 등급
	private int tot;
	private double avg;
	private char grade;
	
	// Constructor(생성자): new 할때 초기화 - 입력
	public Score() {}
	
	public Score(int num, String name, int kor, int eng, int mat) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		this.tot = 0;
		this.avg = 0.0;
		this.grade = 'F';
	}
	
	//메소드 기능(함수): 입력, 처리, 출력
	public void input() {}
	public void process() {}
	public void output() {}

}

public class TestScore {

	public static void main(String[] args) {
		

	}

}
