package chapter8_9;

public class Employee {
    
    private static int count = 0; //nr i punenjesve
    private String firstName;
    private String lastName;

    //inicializimi i employy dhe inkrementimi me 1 i count

    public Employee(String firsName, String lastName) {
        this.firstName = firsName;
        this.lastName = lastName;

        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n", firsName,lastName,count);

    }

    //get firstName
    public String getFirstName() {
        return firstName;
    }

    //get last name
    public String getLastName() {
        return lastName;
    }

     //static method to get static count variable

    public static int getCount() {
        return count;
    }

    
    public static void main(String[] args) {

        System.out.printf("nr i punonjesve para instantiation: %d%n", Employee.getCount());

        //krijimi i dy objekteve
        Employee e1 = new Employee("migel", "cepele");
        Employee e2 = new Employee("sdaldnf", "dsjlkns");

        System.out.printf("count pas krijimit te 2 objekteve:(npm thirrjes nga objektet) %d%n", 
         e1.getCount());
         System.out.printf("count pas krijimit te 2 objekteve:(npm thirrjes nga objektet) %d%n", 
         e2.getCount());
         System.out.printf("count pas krijimit te 2 objekteve:(npm thirrjes nga klasa) %d%n", 
         Employee.getCount());
        
    }




}
