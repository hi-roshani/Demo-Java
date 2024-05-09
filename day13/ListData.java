package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListData {
    public void fillStudentData(){
        List<StudentDTO> studentData = new ArrayList<>();

        StudentDTO sDto = new StudentDTO();
        sDto.setRollNo(1); sDto.setName("Priya"); sDto.setCourse("Python");
        studentData.add(sDto);

        sDto = new StudentDTO();
        sDto.setRollNo(2); sDto.setName("Rutuja"); sDto.setCourse("Java");
        studentData.add(sDto);

        sDto = new StudentDTO();
        sDto.setRollNo(3); sDto.setName("Manasi"); sDto.setCourse("Java");
        studentData.add(sDto);

        sDto = new StudentDTO();
        sDto.setRollNo(4); sDto.setName("Supriya"); sDto.setCourse("React");
        studentData.add(sDto);

            List<String> ls = studentData.stream()
                    .filter(studentDTO -> studentDTO.getCourse().equals("Java"))
                    .map(studentDTO -> studentDTO.getName())
                    .collect(Collectors.toList());
            System.out.println("\nStudents with Java course: ");
            ls.forEach(System.out::println);


            List<String> ls2 = studentData.stream().findFirst().map(studentDTO -> studentDTO.getName()).stream().toList();
            System.out.println("\nRoll no 1: ");
            ls2.forEach(System.out::println);


            List<String> ls3 = studentData.stream()
                    .filter(studentDTO -> studentDTO.getName().endsWith("a"))
                    .map(studentDTO -> studentDTO.getName())
                    .collect(Collectors.toList());
            System.out.println("\nStudents whose name ends with a: ");
            ls3.forEach(System.out::println);
    }

}
