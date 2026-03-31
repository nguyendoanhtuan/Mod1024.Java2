package mainPackage;

import java.util.ArrayList;

import entity.*;

public class mainLab1_2 {
	public static void main(String[] args) {
		ArrayList<Employee> listEmployee = new ArrayList<Employee>();
		Employee nv1 = new Employee("NV01", "Nguyễn Đỗ Anh Tuấn", 700);
		listEmployee.add(nv1);
		listEmployee.add(new FullTimeEmployee("FT01", "Đăng Văn A", 900, 500, 50));
		listEmployee.add(new FullTimeEmployee("FT02", "Nguyễn Văn B", 1000, 200, 0));
		listEmployee.add(new PartTimeEmployee("PT01", "Trần Văn C ", 0, 80, 20));
		listEmployee.add(new PartTimeEmployee("PT02", "Nguyễn Văn Thành", 0, 100, 15));
		
		for (Employee nv : listEmployee) {
			System.out.println(nv.toString());
		}
		Employee maxEmployee = listEmployee.get(0);
		for (Employee nv : listEmployee) {
			if (nv.income() > maxEmployee.income()) {
				maxEmployee = nv;				
			}
		}
		System.out.println("Nhân viên có thu nhập cao nhất là: " + maxEmployee.toString());
	}
}