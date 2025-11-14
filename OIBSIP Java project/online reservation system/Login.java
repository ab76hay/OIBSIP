public class Login {

    private final String correctId = "admin";
    private final String correctPass = "1234";

    public boolean checkLogin(String id, String pass) {
        return id.equals(correctId) && pass.equals(correctPass);
    }
}
