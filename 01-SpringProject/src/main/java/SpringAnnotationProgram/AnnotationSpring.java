package SpringAnnotationProgram;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnotationSpring {
	private String myName;
	private String phNo;
	private int age;
	@Autowired
	private B b;
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "AnnotationSpring [myName=" + myName + ", phNo=" + phNo + ", age=" + age + "]";
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	
	

}
