package PR_9;

public class UserNotFoundException extends Exception {
    UserNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
