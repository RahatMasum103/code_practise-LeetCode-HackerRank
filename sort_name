/***************************************************************/
<FirstName> <Middle Initial> <LastName> <Age> 

You should sort those names based on <LastName> then <Firstname> then <Middle Initial> then numeric age. You should not consider the case of the letters. And the age should be sorted in numeric, I mean if you just concatenate and sort them then John F Kennedy 24, John F Kennedy 4 will be sorted as John F Kennedy 24 then John F Kennedy 4, as string “24” < “4” but you should consider numeric value for the age, like the above example should be sorted as John F Kennedy 4, John F Kennedy 24. 

And if there are any duplicates, again case insensitive, you should print only the name that comes first in the input list.

/********************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class EmployeeSort implements Comparator<EmployeeSort>  {
	private String firstName;
    private String midInitial;
    private String lastName;
    private int age;
    
    public EmployeeSort()
    {    	
    }

    public EmployeeSort(String fn, String mi, String ln, int age) {
        this.firstName = fn;
        this.midInitial = mi;
        this.lastName = ln;
        this.age = age;
    }     

	public String getFirstName() {
		return firstName;
	}

	public String getMidInitial() {
		return midInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	
	/*
	 * @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Blog)
        {
            Blog temp = (Blog) obj;
            if(this.title == temp.title && this.author== temp.author && this.url == temp.url && this.description == temp.description)
                return true;
        }
        return false;

    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub

        return (this.title.hashCode() + this.author.hashCode() + this.url.hashCode() + this.description.hashCode());        
    }
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((midInitial == null) ? 0 : midInitial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeSort other = (EmployeeSort) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (midInitial == null) {
			if (other.midInitial != null)
				return false;
		} else if (!midInitial.equals(other.midInitial))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		EmployeeSort e1 = new EmployeeSort("Andrew", "L", "Blein", 35);
        EmployeeSort e2 = new EmployeeSort("James", "M", "Gan", 30);
        EmployeeSort e3 = new EmployeeSort("Andrew", "A", "Tom", 40);
        EmployeeSort e4 = new EmployeeSort("John", "F", "Kenny", 30);
        EmployeeSort e5 = new EmployeeSort("Jim", "L", "Tom", 20);
        */
        /*********** TEST Block **********/
        
		    EmployeeSort e1 = new EmployeeSort("Andrew", "L", "Tom", 35);
        EmployeeSort e2 = new EmployeeSort("Andrew", "L", "Tom", 35);
        EmployeeSort e3 = new EmployeeSort("Andrew", "L", "Tom", 40);
        //EmployeeSort e4 = new EmployeeSort("John", "F", "Kenny", 30);
        //EmployeeSort e5 = new EmployeeSort("Jim", "L", "Tom", 20);

        List<EmployeeSort> employees = new ArrayList<EmployeeSort>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        //employees.add(e4);
        //employees.add(e5);

        System.out.println("------unsorted-------");
        for (EmployeeSort emp : employees) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getMidInitial() + " " + emp.getAge());
        }
               
        Collections.sort(employees, new EmployeeSort());    
        
        
        System.out.println("------sorted-------");
        for (EmployeeSort empS : employees) {
            System.out.println(empS.getFirstName() + " " + empS.getLastName() + " " + empS.getMidInitial() + " " + empS.getAge());
        }    
        
        System.out.println("------Reduced-------");
        //List<EmployeeSort> employeeReduce = new ArrayList<EmployeeSort>();
        //employeeReduce = employees.stream().distinct().collect(Collectors.toList());
        HashSet<EmployeeSort> reduceSet= new HashSet(employees);          
      
        for (EmployeeSort empR : reduceSet) {
            System.out.println(empR.getFirstName() + " " + empR.getLastName() + " " + empR.getMidInitial() + " " + empR.getAge());
        }  

	}

	//@Override
	public int compare(EmployeeSort e1, EmployeeSort e2) {
		// TODO Auto-generated method stub
		
		if(e1.lastName.equals(e2.lastName)) 
		{
			if(e1.firstName.equals(e2.firstName))
			{
				if(e1.midInitial.equals(e2.midInitial))
				{
					return e1.getAge()>e2.getAge() ? 1: e1.getAge()<e2.getAge() ? -1 : 0 ;
				}
				else {
					return e1.getMidInitial().compareTo(e2.getMidInitial());
				}		
				
			}
			else {
				return e1.getFirstName().compareTo(e2.getFirstName());
			}
			//return e1.getAge()>e2.getAge() ? 1: e1.getAge()<e2.getAge() ? -1 : 0 ;
			
		}
		else{
			return e1.getLastName().compareTo(e2.getLastName());
		}
		//return e1.getFirstName().compareTo(e2.getFirstName());
		//return e1.getLastName().compareTo(e2.getLastName());
		//return arg0.getAge()>arg1.getAge() ? 1: arg0.getAge()<arg1.getAge() ? -1 : 0 ;
		
	}


	
	


}
