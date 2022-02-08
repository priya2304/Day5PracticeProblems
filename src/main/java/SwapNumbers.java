public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("============== Java Program to Swap Two Numbers ==============");
        int i = 10;
        int j = 20;

        System.out.println( "i = " + i + " and j = " + j); // i = 10 and j = 20

        int temp = i;
        i = j;
        j = temp;
        System.out.println( "i = " + i + " and j = " + j); // i = 20 and j = 10
    }
}


