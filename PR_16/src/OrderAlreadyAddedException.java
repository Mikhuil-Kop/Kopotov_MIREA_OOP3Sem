public class OrderAlreadyAddedException extends Exception {
    private String message;

    public OrderAlreadyAddedException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
