package WorkingWithAbstraction.Lab.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentInfo;

    public StudentSystem() {
        this.studentInfo = new HashMap<>();
    }

    public Map<String, Student> getStudentInfo() {
        return this.studentInfo;
    }

    public void ParseCommand(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] args = scanner.nextLine().split(" ");
        String command = args[0];
        String name = args[1];
        if (command.equals("Create")) {
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            if (!studentInfo.containsKey(name)) {
                Student student = new Student(name, age, grade);
                studentInfo.put(name, student);
            }
        } else if (command.equals("Show")) {
            Student student = studentInfo.get(name);
            if (student != null) {
                System.out.println(student.getInfo());
            }
        } else {
            throw new IllegalArgumentException("Unknown command" + command);
        }
    }
}
