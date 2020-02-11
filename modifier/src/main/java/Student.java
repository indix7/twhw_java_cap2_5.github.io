public class Student {
    private final String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void showAllInformation() {
        System.out.println("学生姓名 ： " + getName() + "    学生成绩 ： " + getGrade());
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
