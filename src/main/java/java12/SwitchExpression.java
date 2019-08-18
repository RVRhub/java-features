package java12;

import java.time.DayOfWeek;

//javac --enable-preview --release 12  SwitchExpression.java
//java --enable-preview SwitchExpression

public class SwitchExpression {
    public static void main(String[] args) {

        DayOfWeek day = DayOfWeek.SUNDAY;

  /*      String activity = switch(day) {
            case SUNDAY -> "Relax";
            default -> "Work";
        };

        System.out.println(activity);
  */
    }
}
