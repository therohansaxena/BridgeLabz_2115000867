class Faculty {
    char[] name;

    Faculty(char[] name) {
        this.name = name;
    }
}

class Department {
    Faculty[] faculties;
    int count = 0;

    Department(int size) {
        faculties = new Faculty[size];
    }

    void addFaculty(Faculty f) {
        faculties[count] = f;
        count++;
    }
}

class University {
    Department[] departments;
    int count = 0;

    University(int size) {
        departments = new Department[size];
    }

    void addDepartment(Department d) {
        departments[count] = d;
        count++;
    }
}

class Main {
    public static void main(String[] args) {
        University u = new University(1);
        Department d = new Department(2);
        Faculty f1 = new Faculty(new char[]{'F', '1'});
        Faculty f2 = new Faculty(new char[]{'F', '2'});
        d.addFaculty(f1);
        d.addFaculty(f2);
        u.addDepartment(d);
    }
}
