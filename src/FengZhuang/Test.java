package FengZhuang;

public class Test extends User{
    public static void main(String[] agre){
        Student st=new Student("zhangsan");

        st.setId(2019101955);
        st.setName("张三");
        st.setPassword("zhangsan");

        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getPassword());
    }

}
