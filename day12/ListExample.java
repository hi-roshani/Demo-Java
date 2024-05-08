package day12;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

 public void fillStudentData() {
     List<StudentDTO> studentData = new ArrayList<>();
     StudentDTO sDto = new StudentDTO();
     sDto.setRollNo(1);
     sDto.setStudName("Pooja");
     sDto.setAddress("Yeola");
     studentData.add(sDto);

     sDto = new StudentDTO();
     sDto.setRollNo(2);
     sDto.setStudName("Vaishnavi");
     sDto.setAddress("Yeola");
     studentData.add(sDto);

     for (StudentDTO studentDTO : studentData) {
         System.out.println(studentDTO.getRollNo()
                 +"  "+ studentDTO.getStudName()
                 +"  "+ studentDTO.getAddress());

     }

 }

 public void fillTeacherData() {
         List<TeacherDTO> teacherData = new ArrayList<>();
         TeacherDTO tDto = new TeacherDTO();
         tDto.setTeacherId(101);
         tDto.setTeacherName("Shivani");
         tDto.setAddress("Kopargaon");
         teacherData.add(tDto);

         tDto = new TeacherDTO();
         tDto.setTeacherId(102);
         tDto.setTeacherName("Priyanka");
         tDto.setAddress("Shrirampur");
         teacherData.add(tDto);

         for (TeacherDTO teacherDTO : teacherData) {
             System.out.println(teacherDTO.getTeacherId()
                     + "  " + teacherDTO.getTeacherName()
                     + "  " + teacherDTO.getAddress());

         }

     }

}
