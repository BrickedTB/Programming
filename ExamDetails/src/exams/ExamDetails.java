package exams;

public class ExamDetails {

    public static void main(String[] args) {
        
        StudentResults aStudent = new StudentResults();
        Certificates c1 = new Certificates();
        
        String sName = aStudent.fullName("Bill Gates");
        String exam = aStudent.examName("VB");
        String score = aStudent.examScore(30);
        String grade = aStudent.examGrade(30);
        
        System.out.println(sName);
        System.out.println(exam);
        System.out.println(score);
        System.out.println(grade);
        
        
        
    }
    
}
