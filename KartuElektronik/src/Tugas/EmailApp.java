package Tugas;

public class EmailApp implements Email {
    private String emailId;
    private String password;

    public EmailApp(String emailId, String password) {
        super();
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public boolean otentikasi(String passwordInput) {
        if (password.equals(passwordInput))
            return true;
        else
            return false;
    }

    @Override
    public String enkripsi(String password) {
        return null;
    }
}
