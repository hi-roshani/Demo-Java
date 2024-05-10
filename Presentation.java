import day13.*;

import java.util.Map;

public class Presentation {
    public static void main(String[] args){
        MapStudent mapStudent = new MapStudent();
        Map<Integer, String> studentDTOList = mapStudent.studentData();
        System.out.println(studentDTOList);
        mapStudent.studentData();
    }
}
