import java.util.ArrayList;
public class day66 {
    public static void main(String[] args){
        ArrayList data=new ArrayList<>();
        data.add(1);
        data.add("arni");
        data.add('A');
        data.add(148.2);
        
        data.remove(148.2);
        
        System.out.println(data);
    }
}
