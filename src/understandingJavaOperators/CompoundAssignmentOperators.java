package understandingJavaOperators;

public class CompoundAssignmentOperators {
    /*Compound Assignment Operators dedikdə +=, -=, *=, /= və s. operatorlar nəzərdə tutulur.*/

    public static void main(String[] args) {
        int x = 2, z = 3;
        x = x * z; // Simple assignment operator
        x *= z; // Compound assignment operator
        x += 2;
        System.out.println(x); // output: 20
        x =+ 2;
        System.out.println(x); // output: 2

        /*Compound assignment operatorunun sol tərəfində dayanan dəyişən (x) həmin sətrə kimi
artıq elan olunmuş dəyişən olmalıdır, əks halda kompayl xətası verəcəkdir:*/

//        Əgər bu operator çaşdırıcı formada tərsinə yazılarsa, kompayl xətası verməyəcək!

        int k =+ 2; // positive number
        int m =- 2; // negative number
        System.out.printf("k = %d and m = %d %n", k, m); // k = 2 and m = -2
//Compound operator həm də ona görə faydalıdır ki, açıq-aşkar cast etməkdən bizi xilas edir:

        long s = 10;
        int y = 5;
     //   y = y * s; // does not compile
     //     y = (int) y * s; // does not compile; mötərizə olmadığına görə
        y = (int) (y * s); // line1
        y *= s; // line2
    }
}
