package education;

import java.time.LocalDate;

public class HigherEducation extends GradedEducation{

    String degree;
    
    public HigherEducation(String institution, LocalDate enrollmentDate, LocalDate graduationDate, String degree) {
        super(institution, enrollmentDate, graduationDate);
        
        if (degree.equalsIgnoreCase("B")) {
            this.degree = "Bachelor";
        } else if (degree.equalsIgnoreCase("M")) {
            this.degree = "Master";
        } else if (degree.equalsIgnoreCase("D")) {
            this.degree = "Doctorate";
        } else {
            throw new IllegalArgumentException("Expected B, M or D as degree.");
        }
        
        this.degree = degree;
    }

    @Override
    public String getDegree() {
        return degree;
    }
}
