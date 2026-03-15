package EXCEPTION;

class InvalidAgeException extends Exception {

  

    public InvalidAgeException(String msg) {
        this.msg=msg;
    }
      

}

public class H {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Yoou are under 18 Not valid !!!!!!!!");
        }
        System.out.println("valid");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you Visit Again!");
        }
    }
}
