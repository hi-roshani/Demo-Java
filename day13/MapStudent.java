package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MapStudent {
    public Map<Integer, String> studentData(){
        List<StudentDTO> studentData = new ArrayList<>();
        Map<Integer, String> roll = new HashMap<>();


        StudentDTO sDto = new StudentDTO();
        sDto.setName("Vidya"); sDto.setCourse("Python"); sDto.setCgpa(8.1f);
        studentData.add(sDto);
        roll.put(1, sDto.getCourse());

        sDto = new StudentDTO();
        sDto.setName("Ram"); sDto.setCourse("Kotlin"); sDto.setCgpa(9.7f);
        studentData.add(sDto);
        roll.put(2, sDto.getCourse());


        sDto = new StudentDTO();
        sDto.setName("Pratiksha"); sDto.setCourse("Kotlin"); sDto.setCgpa(7.7f);
        studentData.add(sDto);
        roll.put(3, sDto.getCourse());


        sDto = new StudentDTO();
        sDto.setName("Preeti"); sDto.setCourse("Python"); sDto.setCgpa(8.5f);
        studentData.add(sDto);
        roll.put(4, sDto.getCourse());


        Stream<Map.Entry<Integer, String>> stream = roll.entrySet().stream();
        System.out.println(stream);

        return studentData();
    }
}
