package FengZhuang;

public class Student extends User{
    private String zhuanye;


    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public Student(String zhuanye){
        super("123456");
        this.zhuanye=zhuanye;
    }

    //@Override
    //public String toString() {
        //return "zhuanye="+zhuanye+",password="+password;
    //}


    @Override
    public String toString() {
        return "zhuanye="+zhuanye+",password="+password;
    }
}
