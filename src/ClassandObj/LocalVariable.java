package ClassandObj;

public class LocalVariable {
    String company = "STEP";
    public static void main (String[] abc)
    {
        LocalVariable obj = new LocalVariable();
        obj.localvar();

    }

     void localvar() {
        String name = "Sayali"; // Local variable
        System.out.println("My Name is " +name);
        System.out.print("My Company Name is"+ " " +company);
    }
}
