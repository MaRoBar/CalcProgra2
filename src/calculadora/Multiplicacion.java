package calculadora;

public class Multiplicacion {
  
       float valor1, valor2, total;

    public Multiplicacion(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public float Multiplicar(){
    total = valor1 * valor2;
    return total;
    }
}
