package calculadora;

public class Suma {
    
       float valor1, valor2, total;

    public Suma(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public float Sumar(){
    total = valor1 + valor2;
    return total;
    }
}
