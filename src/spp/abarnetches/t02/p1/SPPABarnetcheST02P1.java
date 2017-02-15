/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.abarnetches.t02.p1;

import java.util.Scanner;

/**
 *
 * @author albertobarnetche
 */
public class SPPABarnetcheST02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO public static void main(String[] args) {
        // PROGRAMA DE SUELDO PARA TRABAJADORES:
        int categorias;
        categorias = solicitarNumeroCategorias();
        mostrarSalarioHorasExtras(categorias);
        mostrarMenu(categorias);
    }
    
    public static void mostrarSalarioHorasExtras(int categoiras){
        int contador, salarioExtra;
        contador = 0;
        salarioExtra = 30;
        System.out.println("==========================================================");
        System.out.println("    SALARIO DE HORAS EXTRA POR CATEGORIA DE TRABAJADOR    ");
        System.out.println("==========================================================");
        contador = 0;
        do {
        contador++;
        System.out.println(contador + ".- CATEGORIA #0" + contador + " ==== $" + salarioExtra);
        salarioExtra = (salarioExtra + 10);
        } while (contador < categoiras);
    }
    
    public static int solicitarNumeroCategorias(){
        int categorias;
        do {
        System.out.println("Ingresar el numero de categorias en las"
                          +" cuales se dividiran los trabajadores;");
        Scanner entradaNumeroCategorias = new Scanner(System.in);
        categorias = entradaNumeroCategorias.nextInt();
        if (categorias > 8){
            System.out.println("ERROR - Por favor introduzca un numero de categorias"
                             + " menor o igual a 8");
        } else {
            
        }
        } while (categorias > 8);
        return categorias;
    }
    
    public static void mostrarMenu(int categorias){
        int opcion, contador;
        contador = 0;
        categorias = categorias;
        System.out.println("=============================");
        System.out.println("   SALARIO DE TRABAJADORES   ");
        System.out.println("=============================");
        System.out.println("Seleccionar la categoria de la cual se desee calcular el salario del trabajador de dicha categoria:");
        do {
        contador++;
        System.out.println(contador + ".-Categoria #0" + contador);
        } while (contador < categorias);
        Scanner entradaOpcion = new Scanner(System.in);
        opcion = entradaOpcion.nextInt();
        switch (opcion){
            case 1:
                int sueldoBase1, horasExtrasTrabajadas1;
                sueldoBase1 = solicitarSueldoBase1();
                horasExtrasTrabajadas1 = horasExtrasTrabajadas1();
                calcularSalario1(sueldoBase1, horasExtrasTrabajadas1);
                break;
            case 2:
                int sueldoBase2, horasExtrasTrabajadas2;
                sueldoBase2 = solicitarSueldoBase2();
                horasExtrasTrabajadas2 = horasExtrasTrabajadas2();
                calcularSalario2(sueldoBase2, horasExtrasTrabajadas2);
                break;
            case 3:
                int sueldoBase3, horasExtrasTrabajadas3;
                sueldoBase3 = solicitarSueldoBase3();
                horasExtrasTrabajadas3 = horasExtrasTrabajadas3();
                calcularSalario3(sueldoBase3, horasExtrasTrabajadas3);
                break;
            case 4:
                int sueldoBase4, horasExtrasTrabajadas4;
                sueldoBase4 = solicitarSueldoBase4();
                horasExtrasTrabajadas4 = horasExtrasTrabajadas4();
                calcularSalario4(sueldoBase4, horasExtrasTrabajadas4);
                break;
            case 5:
                int sueldoBase5, horasExtrasTrabajadas5;
                sueldoBase5 = solicitarSueldoBase5();
                horasExtrasTrabajadas5 = horasExtrasTrabajadas5();
                calcularSalario5(sueldoBase5, horasExtrasTrabajadas5);
                break;
            case 6:
                int sueldoBase6, horasExtrasTrabajadas6;
                sueldoBase6 = solicitarSueldoBase6();
                horasExtrasTrabajadas6 = horasExtrasTrabajadas6();
                calcularSalario6(sueldoBase6, horasExtrasTrabajadas6);
                break;
            case 7:
                int sueldoBase7, horasExtrasTrabajadas7;
                sueldoBase7 = solicitarSueldoBase7();
                horasExtrasTrabajadas7 = horasExtrasTrabajadas7();
                calcularSalario7(sueldoBase7, horasExtrasTrabajadas7);
                break;
            case 8:
                int sueldoBase8, horasExtrasTrabajadas8;
                sueldoBase8 = solicitarSueldoBase8();
                horasExtrasTrabajadas8 = horasExtrasTrabajadas8();
                calcularSalario8(sueldoBase8, horasExtrasTrabajadas8);
                break;
        }
        preguntaContinuidad();
    }
    
    public static int solicitarSueldoBase1(){
        int sueldoBase1;
        System.out.println("Ingresar sueldo base de la categoria #01:");
        Scanner entradaSueldoBase = new Scanner(System.in);
        sueldoBase1 = entradaSueldoBase.nextInt();
        return sueldoBase1;
    }
    
    public static int solicitarSueldoBase2(){
        int sueldoBase2;
        System.out.println("Ingresar sueldo base de la categoria #02:");
        Scanner entradaSueldoBase = new Scanner(System.in);
        sueldoBase2 = entradaSueldoBase.nextInt();
        return sueldoBase2;
    }
    
    public static int solicitarSueldoBase3(){
        int sueldoBase3;
        System.out.println("Ingresar sueldo base de la categoria #03:");
        Scanner entradaSueldoBase = new Scanner(System.in);
        sueldoBase3 = entradaSueldoBase.nextInt();
        return sueldoBase3;
    }
    
    public static int solicitarSueldoBase4(){
        int sueldoBase4;
        System.out.println("Ingresar sueldo base de la categoria #04:");
        Scanner entradaSueldoBase = new Scanner(System.in);
        sueldoBase4 = entradaSueldoBase.nextInt();
        return sueldoBase4;
    }
    
    public static int solicitarSueldoBase5(){
        int sueldoBase5;
        System.out.println("Ingresar sueldo base de la categoria #05:");
        Scanner entradaSueldoBase = new Scanner(System.in);
        sueldoBase5 = entradaSueldoBase.nextInt();
        return sueldoBase5;
    }
    
    public static int solicitarSueldoBase6(){
        int sueldoBase6;
        System.out.println("Ingresar sueldo base de la categoria #06:");
        Scanner entradaSueldoBase = new Scanner(System.in);
        sueldoBase6 = entradaSueldoBase.nextInt();
        return sueldoBase6;
    }
    
    public static int solicitarSueldoBase7(){
        int sueldoBase7;
        System.out.println("Ingresar sueldo base de la categoria #07:");
        Scanner entradaSueldoBase = new Scanner(System.in);
        sueldoBase7 = entradaSueldoBase.nextInt();
        return sueldoBase7;
    }
    
    public static int solicitarSueldoBase8(){
        int sueldoBase8;
        System.out.println("Ingresar sueldo base de la categoria #08:");
        Scanner entradaSueldoBase = new Scanner(System.in);
        sueldoBase8 = entradaSueldoBase.nextInt();
        return sueldoBase8;
    }
    
    public static int horasExtrasTrabajadas1(){
        int horasExtrasTrabajadas1;
        System.out.println("Ingrese el numero de Horas Extras trabajadas por el trabajador:");
        Scanner entradaHorasExtrasTrabajadas = new Scanner(System.in);
        horasExtrasTrabajadas1 = entradaHorasExtrasTrabajadas.nextInt();
        return horasExtrasTrabajadas1;
    }
    
    public static int horasExtrasTrabajadas2(){
        int horasExtrasTrabajadas2;
        System.out.println("Ingrese el numero de Horas Extras trabajadas por el trabajador:");
        Scanner entradaHorasExtrasTrabajadas = new Scanner(System.in);
        horasExtrasTrabajadas2 = entradaHorasExtrasTrabajadas.nextInt();
        return horasExtrasTrabajadas2;
    }
    
    public static int horasExtrasTrabajadas3(){
        int horasExtrasTrabajadas3;
        System.out.println("Ingrese el numero de Horas Extras trabajadas por el trabajador:");
        Scanner entradaHorasExtrasTrabajadas = new Scanner(System.in);
        horasExtrasTrabajadas3 = entradaHorasExtrasTrabajadas.nextInt();
        return horasExtrasTrabajadas3;
    }
    
    public static int horasExtrasTrabajadas4(){
        int horasExtrasTrabajadas4;
        System.out.println("Ingrese el numero de Horas Extras trabajadas por el trabajador:");
        Scanner entradaHorasExtrasTrabajadas = new Scanner(System.in);
        horasExtrasTrabajadas4 = entradaHorasExtrasTrabajadas.nextInt();
        return horasExtrasTrabajadas4;
    }
    
    public static int horasExtrasTrabajadas5(){
        int horasExtrasTrabajadas5;
        System.out.println("Ingrese el numero de Horas Extras trabajadas por el trabajador:");
        Scanner entradaHorasExtrasTrabajadas = new Scanner(System.in);
        horasExtrasTrabajadas5 = entradaHorasExtrasTrabajadas.nextInt();
        return horasExtrasTrabajadas5;
    }
    
    public static int horasExtrasTrabajadas6(){
        int horasExtrasTrabajadas6;
        System.out.println("Ingrese el numero de Horas Extras trabajadas por el trabajador:");
        Scanner entradaHorasExtrasTrabajadas = new Scanner(System.in);
        horasExtrasTrabajadas6 = entradaHorasExtrasTrabajadas.nextInt();
        return horasExtrasTrabajadas6;
    }
    
    public static int horasExtrasTrabajadas7(){
        int horasExtrasTrabajadas7;
        System.out.println("Ingrese el numero de Horas Extras trabajadas por el trabajador:");
        Scanner entradaHorasExtrasTrabajadas = new Scanner(System.in);
        horasExtrasTrabajadas7 = entradaHorasExtrasTrabajadas.nextInt();
        return horasExtrasTrabajadas7;
    }
    
    public static int horasExtrasTrabajadas8(){
        int horasExtrasTrabajadas8;
        System.out.println("Ingrese el numero de Horas Extras trabajadas por el trabajador:");
        Scanner entradaHorasExtrasTrabajadas = new Scanner(System.in);
        horasExtrasTrabajadas8 = entradaHorasExtrasTrabajadas.nextInt();
        return horasExtrasTrabajadas8;
    }
    
    public static void calcularSalario1(int sueldoBase1, int horasExtrasTrabajadas1){
        int salarioCalculado;
        salarioCalculado = ((sueldoBase1) + (horasExtrasTrabajadas1 * 30));
        System.out.println("El sueldo total del trabajador es: " + salarioCalculado);
    }
    
    public static void calcularSalario2(int sueldoBase2, int horasExtrasTrabajadas2){
        int salarioCalculado;
        salarioCalculado = ((sueldoBase2) + (horasExtrasTrabajadas2 * 40));
        System.out.println("El sueldo total del trabajador es: " + salarioCalculado);
    }
    
    public static void calcularSalario3(int sueldoBase3, int horasExtrasTrabajadas3){
        int salarioCalculado;
        salarioCalculado = ((sueldoBase3) + (horasExtrasTrabajadas3 * 50));
        System.out.println("El sueldo total del trabajador es: " + salarioCalculado);
    }
    
    public static void calcularSalario4(int sueldoBase4, int horasExtrasTrabajadas4){
        int salarioCalculado;
        salarioCalculado = ((sueldoBase4) + (horasExtrasTrabajadas4 * 60));
        System.out.println("El sueldo total del trabajador es: " + salarioCalculado);
    }
    
    public static void calcularSalario5(int sueldoBase5, int horasExtrasTrabajadas5){
        int salarioCalculado;
        salarioCalculado = ((sueldoBase5) + (horasExtrasTrabajadas5 * 70));
        System.out.println("El sueldo total del trabajador es: " + salarioCalculado);
    }
    
    public static void calcularSalario6(int sueldoBase6, int horasExtrasTrabajadas6){
        int salarioCalculado;
        salarioCalculado = ((sueldoBase6) + (horasExtrasTrabajadas6 * 80));
        System.out.println("El sueldo total del trabajador es: " + salarioCalculado);
    }
    
    public static void calcularSalario7(int sueldoBase7, int horasExtrasTrabajadas7){
        int salarioCalculado;
        salarioCalculado = ((sueldoBase7) + (horasExtrasTrabajadas7 * 90));
        System.out.println("El sueldo total del trabajador es: " + salarioCalculado);
    }
    
    public static void calcularSalario8(int sueldoBase8, int horasExtrasTrabajadas8){
        int salarioCalculado;
        salarioCalculado = ((sueldoBase8) + (horasExtrasTrabajadas8 * 100));
        System.out.println("El sueldo total del trabajador es: " + salarioCalculado);
    }
    
    public static void preguntaContinuidad(){
        int opcion;
        System.out.println("¿Desea seguir ejecutando el programa?");
        System.out.println("1.- SI");
        System.out.println("2.- NO");
        Scanner entradaOpcion = new Scanner(System.in);
        opcion = entradaOpcion.nextInt();
        switch (opcion){
            case 1:
                int categorias;
                categorias = solicitarNumeroCategorias();
                mostrarSalarioHorasExtras(categorias);
                mostrarMenu(categorias);
                break;
            case 2:
                System.exit(0);
        }
    }
    
}
    
    

