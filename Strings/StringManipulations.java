package Strings;


// Working With StringBuilder
public class StringManipulations {
    public static void main(String[] args){
        final StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append(" ");
        stringBuilder.append("world");
        System.out.println(stringBuilder);
        stringBuilder.insert(5, " patrick hoban");
        System.out.println(stringBuilder);
        stringBuilder.delete(5, 5+14);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
