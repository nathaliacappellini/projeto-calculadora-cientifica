package pct_Operacoes;

//Classe para definir métodos com as operações básicas
public class OperacoesBasicas {
    public double somar(double a, double b) { // Somar dois números
        return a + b;
    }

    public double subtrair(double a, double b) { // Subtrair dois números
        return a - b;
    }

    public double multiplicar(double a, double b) { // Multiplicar dois números
        return a * b;
    }

    public double dividir(double a, double b) { // Dividir dois números
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }

    public double raiz(double a) { // Calcular a raiz quadrada de um número
        if (a < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de número negtivo.");
        }
        return Math.sqrt(a);
    }

    public double potencia(double base, double expoente) { // Calcular um número elevado a outro
        return Math.pow(base, expoente);
    }

    public double modulo(double a, double b){
        return a % b;
    }
}
