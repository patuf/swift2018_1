package task3.education;

import java.time.LocalDate;

public class SecondaryEducation extends GradedEducation {
    
    public SecondaryEducation(String institution, LocalDate enrollmentDate, LocalDate graduationDate) {
        super(institution, enrollmentDate, graduationDate);
    }

    @Override
    public EducationDegree getDegree() {
        return EducationDegree.Secondary;
    }
}
