public class IllegalTableNumber extends RuntimeException {
    private String message;

    public IllegalTableNumber(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
