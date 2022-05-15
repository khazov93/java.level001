package Lesson05;

public class Sotrudnick {
    private String name;
    private String second_name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int birthdayYear;
    private static final int CURRENT_YEAR = 2022;

    // конструктор класса
    public Sotrudnick(String name, String second_name,
                      String position,String email,
                      String phone,
                      int salary,int birthdayYear){
        this.name = name;
        this.second_name = second_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.birthdayYear = birthdayYear;
    }
    // метод возвращающий информацию об объекте

    int getAge () {return CURRENT_YEAR - birthdayYear;}

    int getSalary() {return salary;}

    String getInfo()
    {
        return this.name + " " +
                this.second_name + ", " +
                this.position + ". Email:  " +
                this.email + ". Phone: "+
                this.phone + ". Age: " +
                getAge() + ". Salary: " +
                getSalary() + " rub";
    }
}
