class Course {
    char[] name;

    Course(char[] name) {
        this.name = name;
    }
}

class Student {
    void enrollCourse(Course c) {
        for (char ch : c.name) System.out.print(ch);
        System.out.println(" enrolled");
    }
}

class Professor {
    void assignProfessor(Course c) {
        for (char ch : c.name) System.out.print(ch);
        System.out.println(" assigned");
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Professor p = new Professor();
        Course c = new Course(new char[]{'C', 'S'});
        s.enrollCourse(c);
        p.assignProfessor(c);
    }
}
