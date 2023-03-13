public class Main {
    public static void main(String[] args) {
        SuperDepartment department = new HRDepartment();
        System.out.println(department.departmentName());
        System.out.println(department.getWorkDeadline());
        System.out.println(department.isTodayAHoliday());
        System.out.println(department.todaysWork());
        System.out.println("\n\n\n\n");

        SuperDepartment department1 = new AdminDepartment();
        System.out.println(department1.departmentName());
        System.out.println(department1.todaysWork());
        System.out.println(department1.isTodayAHoliday());
        System.out.println(department1.getWorkDeadline());
        System.out.println("\n\n\n\n");

        SuperDepartment department2 = new TechDepartment();
        System.out.println(department2.departmentName());
        System.out.println(department2.getWorkDeadline());
        System.out.println(department2.todaysWork());
        System.out.println(department2.isTodayAHoliday());
        System.out.println("\n\n\n\n");
    }
}
