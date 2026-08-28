
import java.util.HashSet;
import java.util.Set;

public class DuplicateString {
    public static void main(String[] args) {
        DuplicateString ds=new DuplicateString();
        ds.duplicateLetters();

    }
    public void duplicateLetters(){
        String str ="Hello i am sahil Tendulkar";
        Set<Character> ch =new HashSet<>();
        HashSet<Character> dpch =new HashSet<>();

        for(int i=0; i<str.length();i++){
            if(ch.contains(str.charAt(i))){
                dpch.add(str.charAt(i));
            }
            else{
                ch.add(str.charAt(i));
            }
        }
        for (Character dc : dpch) {
            System.out.println(dc);
        }
    
    }
    
} 


// import java.util.HashMap;

// public class Demo {
//     public static void main(String[] args) {

//         String str = "programming";

//         HashMap<Character, Integer> map = new HashMap<>();

//         for (char ch : str.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         for (char ch : map.keySet()) {
//             if (map.get(ch) > 1) {
//                 System.out.println(ch + " -> " + map.get(ch));
//             }
//         }
//     }
// }
