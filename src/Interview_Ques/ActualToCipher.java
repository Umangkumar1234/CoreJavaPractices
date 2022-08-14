
package Interview_Ques;


public class ActualToCipher {
    public static void main(String args[]){
     String str="world";
     int k=5;
     StringBuffer str1=new StringBuffer();
     for(int i=0;i<str.length();i++){
     if (Character.isUpperCase(str.charAt(i))){
         char ch=(char)(int)((str.charAt(i)+5-65)%26+65);
         str1.append(ch);
     
     }else{
         char ch=(char)(int)((str.charAt(i)+5-97)%26+97);
         str1.append(ch);
     
     }
     
     }
     System.out.println(str1);
    
     
     StringBuilder str3=str1;
     System.out.println("after decryption ");
     StringBuffer str2=new StringBuffer();
     for( int m=0;m<str1.length();m++){
     if (Character.isUpperCase(str1.charAt(k))){
         char ch=(char)(int)((str1.charAt(k)-5-65)%26+65);
         str2.append(ch);
     
     }else{
         char ch=(char)(int)((str.charAt(k)-5-97)%26+97);
         str1.append(ch);
     
     }
     
     }
     System.out.println(str2);
    
     
    }
    }
    

