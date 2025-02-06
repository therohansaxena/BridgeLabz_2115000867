class Patient {
    char[] name;

    Patient(char[] name) {
        this.name = name;
    }
}

class Doctor {
    void consult(Patient p) {
        for (char c : p.name) System.out.print(c);
        System.out.println(" consulted");
    }
}

class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Patient p = new Patient(new char[]{'P', '1'});
        d.consult(p);
    }
}
