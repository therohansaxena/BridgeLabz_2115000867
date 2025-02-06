class Course {
    char[] name;

    Course(char[] name) {
        this.name = name;
    }
}

class Student {
    Course[] courses;
    int count = 0;

    Student(int size) {
        courses = new Course[size];
    }

    void enroll(Course c) {
        courses[count] = c;
        count++;
    }
}

class School {
    Student[] students;
    int count = 0;

    School(int size) {
        students = new Student[size];
    }

    void addStudent(Student s) {
        students[count] = s;
        count++;
    }
}

class Main {
    public static void main(String[] args) {
        School school = new School(1);
        Student s = new Student(2);
        Course c1 = new Course(new char[]{'M', 'a', 't', 'h'});
        Course c2 = new Course(new char[]{'S', 'c', 'i'});
        s.enroll(c1);
        s.enroll(c2);
        school.addStudent(s);
    }
}

