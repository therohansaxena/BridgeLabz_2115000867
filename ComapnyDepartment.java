class Employee {
    char[] name;

    Employee(char[] name) {
        this.name = name;
    }
}

class Department {
    Employee[] employees;
    int count = 0;

    Department(int size) {
        employees = new Employee[size];
    }

    void addEmployee(Employee e) {
        employees[count] = e;
        count++;
    }
}

class Company {
    Department[] departments;
    int count = 0;

    Company(int size) {
        departments = new Department[size];
    }

    void addDepartment(Department d) {
        departments[count] = d;
        count++;
    }
}

class Main {
    public static void main(String[] args) {
        Company c = new Company(1);
        Department d = new Department(2);
        d.addEmployee(new Employee(new char[]{'E', '1'}));
        d.addEmployee(new Employee(new char[]{'E', '2'}));
        c.addDepartment(d);
    }
}
