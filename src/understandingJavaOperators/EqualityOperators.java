package understandingJavaOperators;

import java.io.File;

public class EqualityOperators {
    // Müqayisə operatoru ( == and != ) əsas bu 3 hal üçün istifadə edilir:

   /*   İki numeric primitiv tipi müqayisə etmək üçün; əgər müqayisə olunan dəyərlər fərqli
    tipdə olarsa, yüksək olanının tipinə çevirilib sonra müqayisə olunurlar.
            5 == 5.0 returns true since the left side is promoted to a double.
        İki boolean dəyəri müqayisə etmək üçün;
        null və String dəyərlər də daxil olmaqla iki obyekti müqayisə etmək üçün.*/
   public static void main(String[] args) {

//
//       boolean x = true == 3; // does not compile
//       boolean y = false != "true"; // does not compile
//       boolean z = 3 == "3"; // does not compile
       boolean k = false;
       boolean m = (k = true);
       System.out.println(m); // Outputs true

       /*İki obyekti müqayisə etdikdə isə obyektlərin özləri deyil onların referansları müqayisə olunur.
İki referans ancaq o zaman bərabər olur ki, onlar ya eyni obyektə işarə edir ya da null`a:*/

       File x = new File("myFile.txt");
       File y = new File("myFile.txt");
       File z = x;
       System.out.println(x == y); // false
       System.out.println(x == z); // true
       String a = null;
       String b = null;
       System.out.println(a==b); // true
   }
}
