package calculadora;

public class Division {

    float valor1, valor2, total;

    public Division(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public float Dividir(){
    total = valor1 / valor2;
    return total;
    }
}
