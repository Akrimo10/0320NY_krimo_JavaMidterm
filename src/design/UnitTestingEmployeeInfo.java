package design;

public class UnitTestingEmployeeInfo {

    public static void main(String[] args) {
        // Use this class to write unit tests for all user-defined methods that you have implemented in this package.
        EmployeeInfo employeeInfoConstructor1 = new EmployeeInfo();
        EmployeeInfo employeeInfoConstructor2 = new EmployeeInfo(1);
        EmployeeInfo employeeInfoConstructor3 = new EmployeeInfo("Akli",2);

        EmployeeInfo employeeInfo = new EmployeeInfo();

        employeeInfo.sickTime();

        employeeInfo.nestedMethod();

        EmployeeInfo.setCompanyName("Timberland");
        System.out.println(EmployeeInfo.getCompanyName());

        EmployeeInfo.calculateEmployeeBonus(4);
        EmployeeInfo.calculateEmployeePension();

    }
}
