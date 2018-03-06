package swift2018_1.hristo.hwk_09.Slide_33.Slide33_Task2;


public class UseCustomException {


    CustomException ex = new CustomException("StackTrace");

    public UseCustomException() throws CustomException{

        throw ex;
    }

    public static void main(String[] args) {

        try {
            UseCustomException use = new UseCustomException();
        }
        catch (CustomException ex){
            System.out.println(ex.getMessage());
        }
    }

}
