package mainPackage;

import java.util.ArrayList;
import java.util.List;

import entity.Student;
import entity.StudentType;

public class mainLab2_1 {

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student("SV01", "Nguyễn Đỗ Anh Tuấn", StudentType.REGULAR));
		listStudent.add(new Student("SV02", "Nguyễn Văn Thành", StudentType.INTERNATIONAL));
		listStudent.add(new Student("SV03", "Nguyễn Công Huy", StudentType.INTERNATIONAL));
		listStudent.add(new Student("SV04", "Nguyễn Văn B", StudentType.INTERNATIONAL));
		listStudent.add(new Student("SV05", "Nguyễn Văn C", StudentType.PART_TIME));
		listStudent.add(new Student("SV06", "Nguyễn Văn D", StudentType.PART_TIME));
	
	
		for (Student student : listStudent) {
			System.out.println(student);
		}

		
		
		for (StudentType type : StudentType.values()) {
			System.out.println("-> Kiểm tra loại sinh viên: " + type);
			for (Student student : listStudent) {
				if (student.getType() == type) {
					System.out.println(" + " + student.getName());
				}
			}
		}
		
		
		for (StudentType type : StudentType.values()) {
			System.out.println("-> Đếm số lượng sinh viên: " + type);
			int count = 0;
			for (Student student : listStudent) {
				if (student.getType() == type) {
					count++;
				}
			}
			System.out.println(type + " + " + count + "students");
		}
		
	}
	
	
}