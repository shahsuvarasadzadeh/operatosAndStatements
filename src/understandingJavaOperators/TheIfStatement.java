package understandingJavaOperators;

public class TheIfStatement {
    public static void main(String[] args) {

        /*// nümunə 5
boolean condition = true;
int i;
if(condition) i = 20;
int k = i; // DOES NOT COMPILE

// nümunə 6
final boolean condition;
condition = true;
int i;
if(condition) i = 20;
int k = i; // DOES NOT COMPILE*/
        //nümunə 7
        final boolean condition = true;
        int i;
        if (condition) i = 20;
        int k = i;
        System.out.println(k);


        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a == true)
            if (b == true)
                if (c == true) System.out.println(1);
                else System.out.println(2);
            else if (a && (b=c)) System.out.println(3);
            else System.out.println(4);

            /*əgər fiqurlu mötərizə yoxdursa, else şərti ən içdəki (innermost) if`ə aiddir. Əlavə məlumat
üçün aşağıdakı linklərə baxa bilərsiniz:*/

    }

}
