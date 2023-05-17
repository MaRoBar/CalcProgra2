package calculadora;

public class Resta {
       float valor1, valor2, total;

    public Resta(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public float Restar(){
    total = valor1 - valor2;
    return total;
    }
}
