package string;
public class str
{
    public static void main(String [] args)
    {
        String name ="string methods";

        System.out.println(name.toLowerCase());     
        System.out.println(name.toUpperCase());  

        System.out.println(name.length());       //will tell length of string

        System.out.println(name.trim());        //will remove pre post spaces

        System.out.println(name.substring(7,13));

        System.out.println(name.replace("st","sm"));
        System.out.println(name.replace('s','m'));

        System.out.println(name.startsWith("str"));
        System.out.println(name.endsWith(""));

        //learn index properly

        System.out.println(name.charAt(7));
        System.out.println(name.indexOf("ing"));
        System.out.println(name.indexOf("ing",10)); //this will search from index no.10
        System.out.println(name.lastIndexOf("met",2));

        System.out.println(name.equals("string"));
        System.out.println(name.equalsIgnoreCase("STRING METHODS"));
    }
}
