//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("<<<<< Guia de objetos I = Modelado e implementacion >>>>>");

        System.out.println("[ENUNCIADO 1]");
        /*Inicializar un objeto Rectángulo estableciendo ancho y alto.*/
        Rectangle r1= new Rectangle(20f,10f);
        /*Imprimir por pantalla el alto y ancho.*/
        System.out.println("El ancho del rectangulo es "+ r1.getBroad()+" y el alto es "+ r1.getHigh());
        /*Imprimir por pantalla el área y perímetro.*/
        r1.Area(r1.getBroad(),r1.getHigh());
        r1.Perimeter(r1.getBroad(),r1.getHigh());
        System.out.println("\n");
        /*Modificar el alto y el ancho de la instancia.*/
        r1.setBroad(30f);
        r1.setHigh(20f);
        /*Imprimir por pantalla nuevamente el cálculo del área y perímetro*/
        r1.Area(r1.getBroad(),r1.getHigh());
        r1.Perimeter(r1.getBroad(),r1.getHigh());
        System.out.println("\n");
        /* Inicializar un objeto Rectángulo con los valores por defecto y verificar.*/
        r1.InitParameter();
        r1.Area(r1.getBroad(),r1.getHigh());
        r1.Perimeter(r1.getBroad(),r1.getHigh());
        System.out.println("\n");

        System.out.println("[ENUNCIADO 2]");
        /*Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
        25000.*/
        Employed e1=new Employed(23456345,"Carlos","Gutierrez",25000f);
        /*Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
        27500.*/
        Employed e2= new Employed(34234123,"Ana","Sanchez",27500f);
        /*Imprima ambos objetos por pantalla*/
        e1.showEmployed(e1);
        e2.showEmployed(e2);
        /*Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        salario anual del mismo.*/
        e1.upSalary(15f,e1);
        System.out.println("Nuevo salario de Carlos Gutierrez");
        e1.showEmployed(e1);
        System.out.println("\n");

        System.out.println("[ENUNCIADO 3]");
        /*Inicialice el objeto con los atributos necesarios*/
        Item item1 = new Item(1,"Lapicera",10,250f);
        /*Imprima por pantalla el objeto inicializado.*/
        item1.printItem(item1);
        System.out.println("\n");

        System.out.println("[ENUNCIADO 4]");
        /*Inicialice una cuenta con un monto inicial de 15000.*/
        Bank b1=new Bank();
        b1.setId(1);
        b1.setBalance(15000f);
        b1.setName("Santander");
        b1.account(b1);
        /*Realice una operación de crédito de 2500*/
        b1.credit(2500f,b1);
        b1.account(b1);
        /*Realice una operación de compra de 1500*/
        b1.debit(1500f,b1);
        b1.account(b1);
        /*Realice una operación de compra de 30000.*/
        b1.debit(30000f,b1);
        b1.account(b1);

        System.out.println("[ENUNCIADO 5]");
        /*Instanciar el objeto y probar los métodos creados.*/
        Hour h1=new Hour(01,23,55);

        }
    }
