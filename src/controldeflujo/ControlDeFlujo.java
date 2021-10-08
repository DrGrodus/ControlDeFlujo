package controldeflujo;
/**
 *
 * @author Eber MD
 */
public class ControlDeFlujo {
     private int primos[] = new int[255];
     private int fibo[] = new int[255];
     
    public static void main(String[] args) {
        int var = 4;
        ControlDeFlujo Control = new ControlDeFlujo();
        // primer método calcular n primos, 
        // recibe el valor de var
        // sí es 100, el metodo devolverá 100 primos
        int arr[] = Control.cuentaPrimos(var); int i = 0;
        System.out.println("Estos son los primeros " + var +" números primos: ");
        do{
            System.out.print(arr[i]+","); // ciclo para solo imprimir los numeros pedidos
            i++;
        }while(arr[i] != 0);
        System.out.println("");
        
        // segundo método sucesion de fibonacci
        // también recibe el valor de var
        // sí es 100, el método devolverá 100 números
        int arr1[] = Control.sucesionFibonacci(var); int j = 0;
        System.out.println("Estos son los primeros " + var +" números de la sucesión de Fibonacci: ");
        do{
            System.out.print(arr1[j]+","); // ciclo para solo imprimir los numeros pedidos
            j++;
        }while(arr1[j] != 0);
        System.out.println("");
    }
    
    public int[] cuentaPrimos(int var){
        int num = 2; // la variable num contendrá los posibles numeros primos y compuestos
        int j = 0; // la variable j es para indexar los primos
        int varControl = 2; // tal como lo dice su nombre, filtrará los primos de los compuestos
        while(j != var){ // este ciclo se repite hasta que j sea igual que el valor solicitado
            if(num%1 == 0 && num%num == 0){ // el residuo de num/1 es igual a 0 y tambien sí el residuo de num entre sí mismo es igualmente cero
                if(num%varControl != 0){ // se comprueba que no haya más divisores válidos
                    primos[j] = num;j++;
                } else if (num == varControl){ // solo sí el numero es 2
                    primos[j] = num;j++;
                }
            }
            num++;
        }
        return primos;
    }
    
    public int[] sucesionFibonacci(int var){
        int num1 = 0; int num2 = 1;
        fibo[0] = num1; fibo[1] = num2; // los primeros dos números se ponen manualmente, por motivos prácticos
        for(int i = 2; i <= var+1; i++){ // el ciclo for empieza con dos más, debido a lo anterior
            fibo[i] = num1+num2; // se indexa el número siguiente
            num1 = fibo[i-1]; 
            num2 = fibo[i]; // se actualizan las variables para continuar con la sucesión
        }
        return fibo;
    }
    
}
