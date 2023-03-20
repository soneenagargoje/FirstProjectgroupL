package Project.Project;

public class Queston {
	private int id;
	private String questions;
	private String a;
	private String b;
	private String c;
	private String d;
	private String ans;
	private String eans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getEans() {
		return eans;
	}
	public void setEans(String eans) {
		this.eans = eans;
	}
	@Override
	public String toString() {
		return "Queston [id=" + id + ", questions=" + questions + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d
				+ ", ans=" + ans + ", eans=" + eans + "]";
	}
	

}
