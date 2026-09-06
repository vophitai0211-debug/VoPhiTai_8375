package Lec07_Strings;

public class ImmutableString {
    
    public static void main(String[] args) {
        String s = " Duy Tan ";
        s = s.concat(" University");
        System.out.println(s);
        
        String name = "Hello " + "World";
        System.out.println(name);
        
        String s1 = "Hello";
        String s2 = "HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        
        String s3 = 50 + 30 + "Hello" + 40 + 40;
        System.out.println(s3);
        
        String s4 = "Hello World";
        System.out.println(s4.substring(6));
        System.out.println(s4.substring(0, 5));
        System.out.println(s4.substring(1, 3));
        
        String s5 = "  Sachin  ";
        System.out.println(s5);
        System.out.println("(" + s5.trim() + ")");
        
        String s6 = "Sachin";
        System.out.println(s6.startsWith("Sa"));
        System.out.println(s6.startsWith("n"));
        
        String s7 = "Sachin";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));
        System.out.println(s7.length());
        
        String str1=new String("Hello java");
        String str2="Hello java";
        String str3=str2.intern();
        System.out.println(str1==str2);
    }
}
