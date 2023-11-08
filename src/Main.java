import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayDeque <String> name = new ArrayDeque<>();
        String[] f_name = {"Pol", "Mike", "Din"};
        String[] pol = {"Alex", "Tom"};
        String[] mike = {"Din", "Pol"};
        String[] din = {"Alex", "Lion"};

        ArrayList<String> check = new ArrayList<>();

        ArrayDeque <String[]> dop = new ArrayDeque<>();
        dop.add(pol);
        dop.add(mike);
        dop.add(din);

        for(var item : f_name)
            name.add(item);
        System.out.println(que(name, check, dop));
        
    }
    public static String que(ArrayDeque <String> name, ArrayList<String> check, ArrayDeque <String[]> dop){
        while(!name.isEmpty()){
            if(!check.contains(name.getFirst())){
                check.add(name.getFirst());
                if(isTrue(name.getFirst()))
                    return "name is " + name.getFirst();
                else{
                    if(!dop.isEmpty()){
                        for(var item : dop.getFirst())
                            name.addLast(item);
                        dop.removeFirst();
                    }
                }
            }
            name.removeFirst();
        }
        return "deque is empty";
    }
    public static boolean isTrue(String tr){
        if(tr.equals("Lion"))
            return true;
        else return false;
    }

}