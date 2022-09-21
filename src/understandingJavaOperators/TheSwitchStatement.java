package understandingJavaOperators;

public class TheSwitchStatement {
    /*
• int və Integer
• byte və Byte
• short və Short
• char və Character
• String (java 7`dən bəri)
• enum values

float, double, boolean və long tipləri və həmçinin onların wrapper classları (Float, Double,
Boolean, Long) switch ifadələr tərəfindən dəstəklənmir.
 */
    public static void main(String[] args) {
        /*Mahiyyət baxımından bir iş görməsə belə aşağıdakı nümunədə verilmiş sintaksis səhv
deyildir, normal kompayl olunur və icra edilir:*/

            switch (1) {
                default: break;
            }
            switch (2) { }

    }


}
