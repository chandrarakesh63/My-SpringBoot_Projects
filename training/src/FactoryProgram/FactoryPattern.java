package FactoryProgram;

public class FactoryPattern {
	public static void main(String[] args) {
		College obj = Factory.getCollege("student");
		obj.department();
	}

}
