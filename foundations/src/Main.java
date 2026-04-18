import oop.BankInheritance;
import oop.InheritanceWorkers.Employee;
import oop.Overload;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Overload o = new Overload();
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age: " + tim.getAge() + "   ");
        System.out.println("Pay: " + tim.collectPay());
        BankInheritance b = new BankInheritance(12334,new BigDecimal(545545),"Dani",
                "dfsdf@ggg.com",4585132);
        System.out.println(o.convertToCentimeters(5,8));
        System.out.println(o.getDurationString(3945));
        System.out.println(b);
    }
}