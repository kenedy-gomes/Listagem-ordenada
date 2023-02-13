import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
	   
		List<Employee> list = new ArrayList<>();

		String path = "C:\\API\\Novo Documento de Texto (2).txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String EmployeeCsv = br.readLine();
			while (EmployeeCsv != null) {
				String[] fields = EmployeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble( fields[1])));
				EmployeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			for(Employee emp : list) {
				System.out.println(emp.getName() + "," + emp.getSalary());
			}
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
	}

}
