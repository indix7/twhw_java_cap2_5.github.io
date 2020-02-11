import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        handTeachersAndStudents();
    }

    public static void handTeachersAndStudents() {
        ArrayList<Teacher> teachers = initTeachersAndStudents();
        for (Teacher teacher : teachers) {
            addGradeForThisTeacherAllStudent(teacher, 5);
            teacher.showTeacherAndAllStudentsInformation();
        }
    }

    /**
     * 初始化老师和学生的相关信息，将学生列表赋值给其对应的老师，并返回一个包含所有老师的列表。
     *
     * @return 一个包含所有老师的列表
     */
    public static ArrayList<Teacher> initTeachersAndStudents() {
        ArrayList<Student> studentsOfSolider = new ArrayList<Student>() {{
            add(new Student("Mary", 95));
        }};
        ArrayList<Student> studentsOfBob = new ArrayList<Student>() {{
            add(new Student("Cindy", 80));
        }};
        Teacher solider = new Teacher("Solider", studentsOfSolider);
        Teacher bob = new Teacher("Bob", studentsOfBob);
        return new ArrayList<Teacher>() {{
            add(solider);
            add(bob);
        }};
    }

    /**
     * 操作传入导师名下的所有学生成绩，将每个学生的成绩增加或减少对应分数
     *
     * @param teacher     遍历获得的单一个老师
     * @param changeGrade 需要改变的成绩，增加为正数，减少为负数
     */

    public static void addGradeForThisTeacherAllStudent(Teacher teacher, int changeGrade) {
        for (Student student : teacher.getStudents()) {
            teacher.handStudentGrade(student, changeGrade);
        }
    }

}
