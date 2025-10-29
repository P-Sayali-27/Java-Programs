package StringHandling;

public class StringFunctions {

    public static void main(String[] args)
    {
//toString() function
        String s = "Sayali";
        String res = s.toString(); //return Sayali
        System.out.println(res);

//String Specified Method
        System.out.println("String Specified Methods");

        //Length()
    String L = "SayaliPatil";
    int len = L.length();  //Print length of String
        System.out.println("Length of string: " + len);

// isEmpty()
        System.out.println("".isEmpty());

//trim()
        String name = "   Sayali Patil  ";
        System.out.println("Trim function: " +name.trim());

        //equals()/equalsIs IgnoreCase()
        String s1 = "Hi";
        String s2 = "hi";
        boolean isEquals= "Hi".equals("hi");//equals()
        System.out.println("String equals(): "+ isEquals );
        boolean isEqualsIgnoreCase=  "Hi".equalsIgnoreCase("hi");//equalsIs IgnoreCase()
        System.out.println("String lsIgnoreCase: "+ isEqualsIgnoreCase );

//+operator
        String a1 = "Sayali";
        String a2 = "QA";

        System.out.println("+Operator function: ");
        System.out.println(a1 + a2); //SayaliQA
        System.out.println(a1 + 10); //Sayali10
        System.out.println(a1 + 10 + 20); //Sayali1020
        System.out.println(10 + 10 + a1); //30Sayali
        System.out.println(a1 + 20/10); //Sayali2
        System.out.println("Join String: " + String.join("-", "2025", "07", "24")); ////Join() Function
        String R = "This is Replace Function";
        System.out.println("replace()/replaceFirst()/replaceAll() function: ");
        System.out.println(R.replace("is", "was"));//replace()
        System.out.println(R.replaceFirst("is", "was")); //replaceFirst()
        System.out.println(R.replaceAll("is","was")); //replaceAll()
        System.out.println("indexOf(\"l\"): "+ "Hello".indexOf("l")); //indexOf()
        System.out.println("lastIndexOf(\"l\"): "+ "Hello".lastIndexOf("l")); //lastIndex()
        System.out.println("charAt(1): "+"Hello".charAt(1)); //CharAt()
        System.out.println("contains(\"ll\"): "+"Hello".contains("ll")); //contains()
        System.out.println( "startsWith(\"He\"): "+ "Hello".startsWith("He")); //startsWith()
        System.out.println("endsWith(\"lo\"): "+ "Hello".endsWith("lo"));  //endsWith()
        System.out.println("uppercase: "+ "abc".toUpperCase ()); //toUpperCase()
        System.out.println("lowercase: "+ "ABC".toLowerCase()); //toLowerCase()
        System.out.println("to char array: "+ "abc". toCharArray()); //toCharArray()
        System.out.println( "valueOf: " +String.valueOf(123)); //ValueOf()







    }

    }
