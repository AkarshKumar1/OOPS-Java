// W.A.P in java which implement interface Student which has two methods Display_Grade and
//  Attendance for PG_Students and UG_Students (PG_Students and UG_Students are two 
// different classes for Post Graduate and Under Graduate Students respectively). {Code - 16}

interface Student {
    void displayGrade();
    void attendance();
}

class PG_Student implements Student {
    public void displayGrade() {
        System.out.println("PG Student Grade: A");
    }

    public void attendance() {
        System.out.println("PG Student Attendance: 90%");
    }
}

class UG_Student implements Student {
    public void displayGrade() {
        System.out.println("UG Student Grade: B");
    }

    public void attendance() {
        System.out.println("UG Student Attendance: 85%");
    }
}
public class InterfaceDemo {
        public static void main(String[] args) {
        Student pg = new PG_Student();
        Student ug = new UG_Student();
        pg.displayGrade();
        pg.attendance();
        ug.displayGrade();
        ug.attendance();
    }
}
