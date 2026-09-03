public class CountVowelsConstansts {
    public static void main(String[] args) {
        CountVowelsConstansts cvc=new CountVowelsConstansts();
        cvc.vowelAndConstanstCounter();
    }

    private void vowelAndConstanstCounter() {
        String str="programming!!!";
        int vowel=0;
        int constants=0;
        for(char ch:str.toCharArray()) {
            if(Character.isLetterOrDigit(ch)){
                if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U'){
                    vowel++;
                }
                else{
                    constants++;
                }
            } 
        }
        System.out.println("Vowels : "+vowel+" "+" Constants : "+constants);
    }

   
    
}
