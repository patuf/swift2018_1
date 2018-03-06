package swift2018_1.hristo.hwk_09.Slide_33.Slide33_Task2;

public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    public String getMessage (){
        return super.getMessage();
    }
}
