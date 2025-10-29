package Keywords;

final class FinalExample {

    final int MAX_LIMIT; //Final variable
    FinalExample(int maxLimit) {
        MAX_LIMIT = maxLimit;
    }

    final void displayLimit() //final method
    {
        System.out.println("The limit is: " +MAX_LIMIT);
    }
}
