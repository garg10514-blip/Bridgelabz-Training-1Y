public class StringMethodDemo {
    public static void main(String[] args){
        String s="Java Programming";

        //length()
        System.out.println(s.length());

        //to uppercase()
        System.out.println(s.toUpperCase());

        //to lowercase()
        System.out.println(s.toLowerCase());

        //charAt()
        System.out.println(s.charAt(5));

        //substring()
        System.out.println(s.substring(5)); //programming
        System.out.println(s.substring(0,4)); //java

        //contain()
        System.out.println(s.contains("java")); //true

        //equals()
        System.out.println(s.equals("Java Programming")); //true



    }
}
