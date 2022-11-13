package day26Exception01;

public class E03 {
    public static void main(String[] args) {

        int r1 = getNumOfChars("Tom hanks");//9
        System.out.println(r1);

        int r2 = getNumOfChars("");//0
        System.out.println(r2);

        int r3 = getNumOfChars(null);
        System.out.println(r3);

    }
    public static int getNumOfChars(String str){

        int numOfChar = 0;
        try {
            numOfChar= str.length();

        }catch (NullPointerException e){

            System.out.println("A problem occurred in using length()");
        }
        return numOfChar;
    }
}
