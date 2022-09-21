package understandingJavaOperators;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        /*Əgər operator dəyişəndən (operand) əvvəl gəlirsə, pre-increment (++a) və pre-decrement (--
a) operator adlanır. Bu zaman operator əvvəlcə tətbiq/icra edilir və dəyişənin yeni dəyəri geri
qaytarılır. Müvafiq olaraq, əgər operator dəyişəndən (operand) sonra gəlirsə, post-increment
(a++) və post-decrement (a--) operator adlanır. Bu zaman isə əvvəlcə dəyişənin orijinal dəyəri
geri qaytarılır və operator dəyər qaytarıldıqdan sonra icra edilir.*/

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x); // x is 2
        System.out.println("y is " + y); // y is 7

//        char ilə bağlı bir nümunəyə baxaq:

        char c = 'c';
        System.out.println(++c); // output: d
       // System.out.println(++'c'); // DOES NOT COMPILE

    }
}
