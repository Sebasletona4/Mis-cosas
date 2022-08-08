package ejercicio;

import java.util.Scanner;
public class Ejercicio {

    private static final int ITERACIONES = 10;
     

   public static void main(String[] args) {
          while (true) {
            System.out.println("\n\n\n\n");
            int op = 0;
            System.out.println("MENU");
            System.out.println("1. Aritmetica");
            System.out.println("2. Trigonometria");
            System.out.println("3. Estadistica");
            System.out.println("4. Cálculo");
            System.out.println("5. Salir");
            System.out.print("Ingrese un numero: ");
        
            Scanner scan2 = new Scanner(System.in);
            op = scan2.nextInt();

            switch (op) {
                case 1:
                    Aritmetica();
                    break;
                case 2:
                    Trigonometria();
                    break;
                case 3:
                    Estadística();
                    break;
                case 4:
                    Cálculo();
                    break;
                case 5:
                    System.out.println("Adios!!");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida, por favor, ingrese nuevamente");
                    break;
            }
        }

    }

    public static void Aritmetica() {
        boolean seguirEnMenu = true;
        while (seguirEnMenu) {
            System.out.println("\n\n");
            int opcion = 0;
            System.out.println("ARITMETICAS");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Regresar");
            System.out.print("Ingrese un numero: ");
            
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    Scanner dato = new Scanner(System.in);
                    int numero1 = dato.nextInt();
                    System.out.print("\nIngrese el segundo numero: ");
                    Scanner dato2 = new Scanner(System.in);
                    int numero2 = dato2.nextInt();
                    int resultado = numero1 + numero2;
                    System.out.println("\nLa suma es: " + resultado);
                    Scanner espera = new Scanner(System.in);
                    String esperando = espera.nextLine();
                    break;
                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    Scanner dat = new Scanner(System.in);
                    int num1 = dat.nextInt();
                    System.out.print("\nIngrese el segundo numero: ");
                    Scanner dat2 = new Scanner(System.in);
                    int num2 = dat2.nextInt();
                    int diferencia = num1 - num2;
                    System.out.println("\nLa resta es: " + diferencia);
                    Scanner espera1 = new Scanner(System.in);
                    String esperando1 = espera1.nextLine();
                    break;
                case 3:
                    System.out.print("Ingrese el primer numero: ");
                    Scanner multiplicador = new Scanner(System.in);
                    int num3 = multiplicador.nextInt();
                    System.out.print("\nIngrese el segundo numero: ");
                    Scanner multiplicando = new Scanner(System.in);
                    int num4 = multiplicando.nextInt();
                    int producto = num3 * num4;
                    System.out.println("\nLa multiplicación es: " + producto);
                    Scanner espera2 = new Scanner(System.in);
                    String esperando2 = espera2.nextLine();
                    break;
                case 4:
                    System.out.print("Ingrese el primer numero: ");
                    Scanner divisor = new Scanner(System.in);
                    int num5 = divisor.nextInt();
                    System.out.print("\nIngrese el segundo numero: ");
                    Scanner dividendo = new Scanner(System.in);
                    int num6 = dividendo.nextInt();
                    int cociente = num5 / num6;
                    System.out.println("\nLa división es: " + cociente);
                    Scanner espera3 = new Scanner(System.in);
                    String esperando3 = espera3.nextLine();
                    break;    
                case 5:
                    System.out.print("Ingrese la base: ");
                    Scanner base = new Scanner(System.in);
                    int num7 = base.nextInt();
                    System.out.print("\nIngrese el exponente: ");
                    Scanner exponente = new Scanner(System.in);
                    int num8 = exponente.nextInt();
                    int respuesta = 1;
                    while (num8 != 0) {
                    respuesta = respuesta * num7;
                    num8--;
        }
                    System.out.println("\nEl resultado es =  " + respuesta);
                    break;      
                case 6:
                    seguirEnMenu = false;
                default:
                    System.out.println("Opcion no valida, por favor, ingrese nuevamente");
                    break;
            }
        }
    }
    
    
    
    public static void Trigonometria() {
        boolean seguirEnMenu = true;
        while (seguirEnMenu) {
            System.out.println("\n\n");
            int opcion = 0;
            System.out.println("TRIGONOMETRIA");
            System.out.println("1. Seno");
            System.out.println("2. Coseno");
            System.out.println("3. Tangente");
            System.out.println("4. Regresar");
            System.out.print("Ingrese un numero: ");
            
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();
            double x = 0.0;
            double resultado = 0.0;

            switch (opcion) {
                case 1:
                    System.out.print("\n Ingrese un número: ");
                    x = scan.nextDouble();
                    resultado = seno(x);
                    System.out.println("\nSeno(" + x + ") = " + resultado);
                    break; 
                case 2:
                    System.out.print("\n Ingrese un número: ");
                    x = scan.nextDouble();
                    
                    break;
                case 3:
                    
                    break;      
                case 4:
                    seguirEnMenu = false;
                default:
                    System.out.println("Opcion no valida, por favor, ingrese nuevamente");
                    break;
            }
        }
    }

    private static double potencia(double x, double y){
        double resultado = 1;

        for(int i = 0; i<y; i++){
            resultado = resultado*x;
        
        }

        return resultado;
    }
   
    
    private static double factorial(double x){
        double resultado = 1;

        for(double i = x; i>1; i-- ){
            resultado = resultado * i;
        
        }

        return resultado;

    }



    private static double sumatoria(int x, int y){
        int resultado = 0;
        
        for(int i = 0; i<y; i++){

            resultado = resultado+x;

        }

        return resultado;
    }

    private static double seno(double x){


        double resultado = 0;
        
        for(int i = 0; i<ITERACIONES; i++){

            double numerador = potencia(-1,i)*potencia(x,2*i+1);
            double denominador = factorial(2*i+1);
            resultado +=(numerador/denominador);
        }

        return resultado;

    }


    public static void Estadística() {
        boolean seguirEnMenu = true;
        while (seguirEnMenu) {
            System.out.println("\n\n");
            int opcion = 0;
            System.out.println("ESTADÍSTICA");
            System.out.println("1. Media");
            System.out.println("2. Moda");
            System.out.println("3. Varianza");
            System.out.println("4. Desviación Estandar");
            System.out.println("5. Regresar");
            System.out.print("Ingrese un numero: ");
            
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    int datos;

                    System.out.print("Ingrese tamaño del vector");
                    Scanner leer = new Scanner(System.in);
                    datos = leer.nextInt();

                    int suma = 0;
                    int prom = 0; 
                    int dato = 0;
                    
                    for(int i=1; i<= datos; i++){
                        System.out.println("Ingrese los datos del vector: ");
                        dato = leer.nextInt();
                        int tabla [][] = new int[1][datos];
                        suma = suma + dato;
                    }

                    prom = suma / datos;
                    System.out.println("La media es: "+prom );

                    break; 
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    
                    break;      
                case 4:
                    
                    break;
                case 5:
                    seguirEnMenu = false;
                default:
                    System.out.println("Opcion no valida, por favor, ingrese nuevamente");
                    break;
            }
        }
    }    
    
    
    
        public static void Cálculo() {
        boolean seguirEnMenu = true;
        while (seguirEnMenu) {
            System.out.println("\n\n");
            int opcion = 0;
            System.out.println("CÁLCULO");
            System.out.println("1. Resolver sistema de ecuaciones lineales NxN con Gauss-Jordan");
            System.out.println("2. Regresar");
            System.out.print("Ingrese un numero: ");
            
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;       
                case 2:
                    seguirEnMenu = false;
                default:
                    System.out.println("Opcion no valida, por favor, ingrese nuevamente");
                    break;
            }
        }
    }
}
