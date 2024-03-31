public class Employed {
    private Integer dni;
    private String name;
    private String surname;
    private Float salary;

    public Employed() {
    }

    public Employed(Integer dni, String name, String surname, Float salary) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public void annualSalary(Float salary){
        System.out.println("El salario anual es "+ salary*12);
    }

    public void upSalary(Float percent, Employed x){
        Float newSalary= ((x.salary*percent)/100)+salary;
        this.salary = newSalary;
    }

    public void showEmployed(Employed x){
        System.out.println("EMPLEADO-[DNI="+x.dni+"-NOMBRE="+x.name+"-APELLIDO="+x.surname+"-SALARIO="+x.salary+"]");
        System.out.println("__________________________________________________________________________");
    }
}
