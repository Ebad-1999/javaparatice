package day26Exception01;

public class E02 {

    public static void main(String[] args) {

        String a[]={"A", "C", "B", "Z"};
        String r1 = getElement(a, 4);
        System.out.println(r1);

    }

    public static String getElement(String a[], int idx){

        String s="";

        try {
            s=  a[idx];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A problem is occurred in array indexes");//A problem is occurred in array indexes
            System.out.println(e.getMessage());//Index 4 out of bounds for length 4

            e.printStackTrace();
        }
        return s;


    }
}
