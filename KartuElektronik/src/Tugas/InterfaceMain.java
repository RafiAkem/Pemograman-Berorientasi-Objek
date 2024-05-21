package Tugas;

public class InterfaceMain {
    public static void main(String[] args) {
        EmailApp email = new EmailApp("yc66zio@gmail.com", "12341");
        System.out.println("Otentikasi: " + email.otentikasi("12341"));
    }
}
