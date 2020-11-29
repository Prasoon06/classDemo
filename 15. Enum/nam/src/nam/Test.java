package nam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nam.EmployeeInfo.SortMethod;

public class Test{
	public static void  main(String a[])
	{
//		ArrayList list =new ArrayList(Arrays.asList(10,30,40));
//		ArrayLis obj=new ArrayLis();
//		obj.reverse(list);
//		System.out.println(list);
		
		EmployeeInfo e=new EmployeeInfo();
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee("ajay",1000));
		emp.add(new Employee("beeem",5000));
		emp.add(new Employee("ahaatir",2500));
		
		
		emp=e.sort(emp,SortMethod.BYNAME);
		System.out.println(emp);
		
		emp=e.sort(emp,SortMethod.BYSALARY);
		System.out.println(emp);
		
//		for(SortMethod s:SortMethod.values())
//		{
//			System.out.println(s+" "+s.str);
//		}	
	}
}
