package javaHomework;

public class Main {

	public static void main(String[] args) {

		Course course1=new Course(1,"Yazılım geliştirici yetiştirme kampı (C# + ANGULAR)","Engin");
		Course course2=new Course(2,"Yazılım geliştirici yetiştirme kampı (JAVA + REACT)","Engin");

		
		Course[]course= {course1,course2};
		System.out.println("Mevcut kurs sayısı : "+course.length+"\n");	
		
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		System.out.println("Güncel Sepetteki Kurslar : "+course1.courseName+" / "+course2.courseName+"\n");
		
		courseManager.deleteCourse(course1);
		courseManager.deleteCourse(course2);

	}

}
