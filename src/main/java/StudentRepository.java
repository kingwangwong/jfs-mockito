import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private String[] studentDatabase = {"jon", "david", "elon", "michelle", "esther"};

    public List<String> getStudentsFromDatabase() {
        List<String> studentsFromDB = new ArrayList<String>();;
        for(String s: studentDatabase) {
            studentsFromDB.add(s);
        }
        return studentsFromDB;
    }
}
