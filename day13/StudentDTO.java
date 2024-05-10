package day13;

public class StudentDTO {
    private Integer rollNo;
    private String name;
    private String course;
    private Float cgpa;

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    public Float getCgpa() {
        return cgpa;
    }
}
