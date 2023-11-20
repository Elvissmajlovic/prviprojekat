package ba.smoki.four.array;

public class MultiDimeArrayDemo {
    public static void main(String[] args) {
        String [][] nameSurnameArray = {
                {"Mr.", "Mrs.","Ms."} ,
                {"Smith","Johnes"}
        };
        //Mr. Smith
        System.out.println(nameSurnameArray[0][0] + " " + nameSurnameArray[1][0]);
        //Mrs. Johns
        System.out.println(nameSurnameArray[0][1] + " " + nameSurnameArray[1][1]);




    }
}
