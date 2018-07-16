public class Main {

    public static void main(String[] args){

        Salary s = new Salary("Lorcan Bermingham","120 cluin bui Carlow",3,3600.00);
        Employee e = new Salary("Sinead Brennan","Killinure Tullow Carlow",1,2400.00);
        System.out.println("Call Mail Check--------------------");
        s.mailCheck();
        System.out.println("Call Mail Check using employee ref number--------------------");
        e.mailCheck();

    }
}
