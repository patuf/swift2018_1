package hmw09.Exercise.exerciseownexception;

class ValidateInputException extends Exception {
// null name handler
    public ValidateInputException(String message){
        super(message);
    }
    public ValidateInputException(String message,Throwable cause){
        super(message,cause);
    }
}
