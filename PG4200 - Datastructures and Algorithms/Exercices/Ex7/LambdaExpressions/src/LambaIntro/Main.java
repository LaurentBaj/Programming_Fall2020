package LambaIntro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //class Code implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("Hey");
//    }
//}

        // INSTEAD OF DOING THIS LIKE THIS
//	    new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello world!");
//            }
//        }).start();
        new Thread(()-> System.out.println("This is a lambda expression")).start();

        new Thread(()-> { // Does not need curly braces if there is only one line
            System.out.println("Printing from Runnable");
            System.out.println("Line 3");
            System.out.println("\nLine 5");
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee ben = new Employee("Ben Bajrami", 20);
        Employee osman = new Employee("Osman Bajrami", 45);
        Employee magbule = new Employee("Magbule Bajrami", 34);
        Employee arzana = new Employee("Arzana Bajrami", 12);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(ben);
        employees.add(osman);
        employees.add(magbule);
        employees.add(arzana);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.getName().compareTo(emp2.getName());
//            }
//        });

        Collections.sort(employees, (emp1, emp2) ->
            emp1.getName().compareTo(emp2.getName()));

        for (Employee emp: employees) {
            System.out.println(emp.getName());
        }

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },
//        employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);
        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase(); // 'return' is assumed
        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}
