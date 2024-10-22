package operacoes;

// Classe para definir métodos de funções trigonométricas
public class FuncoesTrigonometricas {
    public double sen(double angulo) { // Calcular Seno
        return Math.sin(Math.toRadians(angulo));
    }

    public double cos(double angulo) { // Calcular Cosseno
        return Math.cos(Math.toRadians(angulo));
    }

    public double tan(double angulo) { // Calcular Tangente
        return Math.tan(Math.toRadians(angulo));
    }
}
