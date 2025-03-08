public class Vowelsconsonent {

        public static void main(String[] args) {
            String str = "hello world";
            int vow =0;
            int conso =0;
            for(int i =0;i<str.length();i++){
                char ch = Character.toLowerCase(str.charAt(i));
                if(ch =='a' || ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'){
                    vow++;
                }
                else if(Character.isLetter(ch)){
                    conso++;
                }
            }
            System.out.println("Vowels : "+ vow +"\n"+"Consonent : "+ conso);

        }
    }



