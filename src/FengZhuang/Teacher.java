package FengZhuang;

public class Teacher extends User{

    private String zhicheng;
    private String gongzhi;

    public Teacher(String zhicheng,String gongzhi){
        super("123455");
        this.zhicheng=zhicheng;
        this.gongzhi=gongzhi;
    }

    public String getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }

    public String getGongzhi() {
        return gongzhi;
    }

    public void setGongzhi(String gongzhi) {
        this.gongzhi = gongzhi;
    }
}
