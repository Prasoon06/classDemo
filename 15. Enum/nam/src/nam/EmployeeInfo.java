package nam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeInfo {

	enum SortMethod implements Comparator<Employee>{
		BYNAME(Comparator.comparing(Employee::getName)),
		BYSALARY(Comparator.comparing(Employee::getSalary));

		private Comparator<Employee> comparator;
		SortMethod(Comparator<Employee> comparator)
		{
			this.comparator=comparator;
		}
	
		@Override
		public int compare(Employee e1, Employee e2) {
			
			return comparator.compare(e1, e2);
		}
	}
	
	public List<Employee> sort (List<Employee>emp,final SortMethod method)
	{
//		if(SortMethod.BYNAME.equals(method))
//		{
//			Stream<Employee> se=emp.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName()));
//			 emp=se.collect(Collectors.toList());
//			 
//		}
//		else
//		{
//			Stream<Employee> se=emp.stream().sorted((e1,e2)->e1.getSalary()-e2.getSalary());
//			emp=se.collect(Collectors.toList());
//		}
		
//		System.out.println(emp);
//		return emp;
		 return emp.stream().sorted(method).collect(Collectors.toList()); 
	}
}
