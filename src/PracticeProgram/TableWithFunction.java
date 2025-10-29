package PracticeProgram;

public class TableWithFunction {

    public static void printTable(int n)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
        }

    }
public static void main(String[] args)
{
    TableWithFunction.printTable(12);
}

}
