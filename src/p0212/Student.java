package p0212;

import java.util.ArrayList;

/*
 * ListTest3 이라는 클래스를 만들어서
 * 5개의 Student변수를 만들어서 
 * List에 넣어주세요
 * 해당 ArrayList를 출력해주시면 됩니다
 */
public class Student {
	private String name;
	private int grade;
	private String schoolName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String toString() {
		return "name : " + name + "  grade : " + grade + "  schoolName : " + schoolName;
	}
}
class ListTest3{
	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<>();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		
		student1.setName("최씨");
		student1.setGrade(1);
		student1.setSchoolName("이젠");
		
		student2.setName("김씨");
		student2.setGrade(2);
		student2.setSchoolName("학교2");
		
		student3.setName("이씨");
		student3.setGrade(3);
		student3.setSchoolName("이젠");
		
		student4.setName("한씨");
		student4.setGrade(4);
		student4.setSchoolName("학교4");
		
		student5.setName("최씨");
		student5.setGrade(5);
		student5.setSchoolName("학교5");
		
		stu.add(student1);
		stu.add(student2);
		stu.add(student3);
		stu.add(student4);
		stu.add(student5);
		
		for(Student s : stu) {
			// 성이 최씨인 사람만 출력해주세요
			String s1 = s.getName();
			String s3 = s.getSchoolName();
					
//			if(s1.indexOf("최") == 0) {
//				System.out.println(s);
//			}
//			if(s1.substring(0,1).equals("최")) {
//				System.out.println(s);
//			}
//			if(s1.charAt(0) == '최') {
//				System.out.println(s);
//			}
//			if(s1.startsWith("최")) {
//				System.out.println(s);
//			}
			System.out.println();
			// 성이 최씨 이거나 학교를 "이젠"으로 다니는 사람만 출력
			if(s1.startsWith("최") || s3.contains("이젠")) {
				System.out.println(s);
			}
		}
	}
}

