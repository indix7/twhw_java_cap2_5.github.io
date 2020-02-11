import java.util.ArrayList;

public class Teacher {
    private final String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Teacher(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    /**
     * 打印当前老师信息及所有学生信息
     */
    public void showTeacherAndAllStudentsInformation() {
        System.out.println("==============================================\n"+"老师姓名 ： " + getName());
        for (Student student: students) {
            student.showAllInformation();
        }
    }

    /**
     * 操作对应学生的成绩
     * @param student 学生对象
     * @param changeGrade 需要改变的成绩，增加为正，减少为负
     */
    public void handStudentGrade(Student student, int changeGrade) {
        student.setGrade(student.getGrade() + changeGrade);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


}
