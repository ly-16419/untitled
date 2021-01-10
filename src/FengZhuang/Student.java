package FengZhuang;

public class Student extends User{

    private String password;

    public Student(String password){
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
