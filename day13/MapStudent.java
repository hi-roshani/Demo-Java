package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStudent {
    public Map<StudentDTO, String> studentData(){
        List<StudentDTO> studentData = new ArrayList<>();
        StudentDTO sDto = new StudentDTO();
        sDto.setRollNo(1); sDto.setName("Vidya"); sDto.setCourse("Python"); sDto.setCgpa(8.1f);
        studentData.add(sDto);

        sDto = new StudentDTO();
        sDto.setRollNo(2); sDto.setName("Ram"); sDto.setCourse("Kotlin"); sDto.setCgpa(9.7f);
        studentData.add(sDto);

        sDto = new StudentDTO();
        sDto.setRollNo(3); sDto.setName("Pratiksha"); sDto.setCourse("Kotlin"); sDto.setCgpa(7.7f);
        studentData.add(sDto);

        sDto = new StudentDTO();
        sDto.setRollNo(4); sDto.setName("Preeti"); sDto.setCourse("Python"); sDto.setCgpa(8.5f);
        studentData.add(sDto);


        Map<StudentDTO, String> tutor = new HashMap<>();



        return studentData();
    }
}
