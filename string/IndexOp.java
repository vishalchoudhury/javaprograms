import java.io.*;

class IndexOp { 
    public static void main(String args[]) {
    String s1="This is a book";
    String s2="is";
    int index = s1.indexOf(s2);
    System.out.println("I\nam\na\nboy");

    System.out.println("s1 contains: "+s1+"\ns2 contains: "+s2+"\ns2 is present at the index of s1: "+index);
    }
}
