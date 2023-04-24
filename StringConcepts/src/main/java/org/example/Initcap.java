package org.example;

public class Initcap
{
    public static void main(String[] args)
    {
     String a="ram kumar";
        System.out.println("Name :"+a);
     String initcap=toInitCap(a);
        System.out.println("Initcap of name :"+initcap);
    }

    public static String toInitCap(String str)
    {
        String[]words=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words)
        {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

