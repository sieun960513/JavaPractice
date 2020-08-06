//상속

public class teacher extends person {
    private String teacherID;
    private int monthSalary;
    private int workedMonth;

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getWorkedMonth() {
        return workedMonth;
    }

    public void setWorkedMonth(int workedMonth) {
        this.workedMonth = workedMonth;
    }

    public teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedMonth) {
        super(name, age, height, weight);
        this.teacherID = teacherID;
        this.monthSalary = monthSalary;
        this.workedMonth = workedMonth;
    }

    public void show() {
        System.out.println("---------------------------------------------");
        System.out.println("교사 이름 : " + getName());
        System.out.println("교사 skdl : " + getAge());
        System.out.println("교사 키 : " + getHeight());
        System.out.println("교사 몸무게 : " + getWeight());
        System.out.println("교번 : " + getTeacherID());
        System.out.println("월급 : " + getMonthSalary());
        System.out.println("근속월수 : " + getWorkedMonth());
    }
}