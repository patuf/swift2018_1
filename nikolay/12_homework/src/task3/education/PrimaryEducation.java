
package task3.education;

import java.time.LocalDate;


public class PrimaryEducation extends Education{

    public PrimaryEducation(String institution, LocalDate enrollmentDate, LocalDate graduationDate) {
        super(institution, enrollmentDate, graduationDate);
    }

    @Override
    public EducationDegree getDegree() {
        return EducationDegree.Primary;
    }

    @Override
    public void gotGraduated() {
        if(graduationDate.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Graduation date is expected to be a date in the past.");
        }
        
        graduated = true;
    }
    
}
