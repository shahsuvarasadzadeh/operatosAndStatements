package understandingJavaOperators;

public class Operators {
    public static void main(String[] args) {
        /*
        Java`da 3 tip operator mövcuddur:
• unary
• binary
• ternary*/
int a;
       //  a = b = c = 100; // does not compile

        {
//            Əgər b və c dəyişənini əvvəlcədən elan etsək kod kompayl olunacaq:
        int b = 0, c = 0;
            a = b = c = 100;
        }
//        Aşağıdakı formada yazılış da səhv deyil:

        int b, c; // Not initializing b and c here
         a = b = c = 100; // declaring a and initializing c, b, and a at the same time

        String str = null + "k";
        System.out.println(str); // output: nullk
       // String str2 = null + null; // DOES NOT COMPILE


/*Modul əməliyyatlarında (%), tutaq ki, bölünən (dividend) – y və bölən (divisor) - x olarsa:
• y – müsbət ədəd olarsa: nəticə həmişə 0 ilə (x-1) aralığında olur;
• y – mənfi ədəd olarsa: nəticə həmişə 0 ilə (-x+1) aralığında olur.*/

        System.out.println(8%3); // output: 2
        System.out.println(-8%3); // output: -2
        System.out.println(8%-3); // output: 2
        System.out.println(-8%-3); // output: -2

        /*Nümunədən belə qərara gəlmək olar ki, bölənin (x) mənfi olub olmaması nəticəyə heç bir
təsir göstərmir, ancaq bölünənin (y) qiymətini yoxlayır.*/

    }
}
