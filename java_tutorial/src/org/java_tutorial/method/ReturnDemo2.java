package org.java_tutorial.method;

public class ReturnDemo2 {


    public static String[] getMembers() {
        String[] members = { "egoing", "k8805", "jeon" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
    }
 
}