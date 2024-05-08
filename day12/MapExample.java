package day12;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    public void getMap(){
        Map<Integer, Double> percentage = new LinkedHashMap<>();

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setRollNo(1);
        percentage.put(studentDTO.getRollNo(), 78.88);

        studentDTO = new StudentDTO();
        studentDTO.setRollNo(2);
        percentage.put(studentDTO.getRollNo(), 81.90);

        System.out.println(percentage);
    }

   public void getTeacherMap(){
        Map<String, Double> salary = new LinkedHashMap<>();

        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setTeacherName("Tuwar");
        salary.put(teacherDTO.getTeacherName(), 15.65);

        teacherDTO = new TeacherDTO();
        teacherDTO.setTeacherName("Jahnvi");
        salary.put(teacherDTO.getTeacherName(), 16.71);

       System.out.println(salary);
    }
}
