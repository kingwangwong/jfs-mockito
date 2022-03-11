import java.util.ArrayList;
import java.util.List;

public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<String> findNamesWithLetterE(){
        List<String> studentsWithLetterE = new ArrayList<>();
        List<String> DB = new ArrayList<>();
        DB = studentRepository.getStudentsFromDatabase();
        for(String name : DB) {
            if (name.contains("e")){
                studentsWithLetterE.add(name);
            }
        }

        return studentsWithLetterE;
    }

}
