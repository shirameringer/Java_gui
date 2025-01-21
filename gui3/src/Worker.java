public class Worker {
 private int id;
    private String first_name;
    private String last_name;
    private int salary;
    private  EnumSpeciialty e1;
    private boolean academic_education;
    private  String elementery_school;
    private  String high_school;

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getSalary() {
        return salary;
    }



    public EnumSpeciialty getE1() {
        return e1;
    }

    public boolean isAcademic_education() {
        return academic_education;
    }

    public String getElementery_school() {
        return elementery_school;
    }

    public String getHigh_school() {
        return high_school;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setE1(EnumSpeciialty e1) {
        this.e1 = e1;
    }

    public void setAcademic_education(boolean academic_education) {
        this.academic_education = academic_education;
    }

    public void setElementery_school(String elementery_school) {
        this.elementery_school = elementery_school;
    }

    public void setHigh_school(String high_school) {
        this.high_school = high_school;
    }

    public Worker(int id, String first_name, String last_name, int salary, EnumSpeciialty e1, boolean academic_education, String elementery_school, String high_school) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
        this.e1 = e1;
        this.academic_education = academic_education;
        this.elementery_school = elementery_school;
        this.high_school = high_school;
    }
    public Worker() {
        this.id = 0;
        this.first_name = "";
        this.last_name = "";
        this.salary = 0;
        this.e1 = null;
        this.academic_education = false;
        this.elementery_school = "";
        this.high_school = "";
    }
}
