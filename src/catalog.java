import java.io.File;

public class catalog {

    public static void main(String[] agre){
        File file=new File("D:\\");
        File file01[]=file.listFiles();//存储目录下有几个文件（包括目录等一系列都称为文件）
        m1(file01);
    }

    public static void m1(File[] file01){
        for (File f:file01){
            System.out.println(f.getName());//获得文件名字
            if (f.isDirectory()){
                //如果当前f行是目录，则：
                //for (File f1:f)
            }
        }
    }
}

