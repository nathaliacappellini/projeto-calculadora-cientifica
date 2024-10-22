import java.util.Scanner;

/*To Do: 
- Módulo
- Algumas Funções Trigonométricas
- Logaritmos e Funções Exponenciais
- Fatorial e Combinações
- Suporte para cálculos com números complexos
- Funções Estatísticas
*/

//Classe Calculadora para definir métodos
class Operacoes {
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

// Classe Main para executar
public class CalculadoraCientifica {
    public static void main(String[] args) {
        // Instâncias
        Operacoes Operacoes = new Operacoes();
        Scanner scanner = new Scanner(System.in);
        CalculadoraCientifica main = new CalculadoraCientifica();

        int escolha;

        do {
            escolha = main.escolhaDeOperacao(scanner);
            switch (escolha) {

                case 1: // Adição
                    System.out.print("Digite o primeiro número: ");
                    double num1 = lerNumero(scanner);
                    System.out.print("Digite o segundo número: ");
                    double num2 = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println("Resultado da Adição: " + Operacoes.somar(num1, num2));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    String resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 10;
                    } // Sair do loop
                    break;

                case 2: // Subtração
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerNumero(scanner);
                    System.out.print("Digite o segundo número: ");
                    num2 = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println("Resultado da Subtração: " + Operacoes.subtrair(num1, num2));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 10;
                    } // Sair do loop
                    break;

                case 3: // Multiplicação
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerNumero(scanner);
                    System.out.print("Digite o segundo número: ");
                    num2 = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println("Resultado da Multiplicação: " + Operacoes.multiplicar(num1, num2));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 10;
                    } // Sair do loop
                    break;

                case 4: // Divisão
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerNumero(scanner);
                    System.out.print("Digite o segundo número: ");
                    num2 = lerNumero(scanner);
                    try {
                        System.out.println(" ");
                        System.out.println("Resultado da Divisão: " + Operacoes.dividir(num1, num2));
                        System.out.println(" ");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 10;
                    } // Sair do loop
                    break;

                case 5: // Raiz Quadrada
                    System.out.print("Digite um número: ");
                    double valor = lerNumero(scanner);
                    try {
                        System.out.println(" ");
                        System.out.println("Resultado da Raiz Quadrada: " + Operacoes.raiz(valor));
                        System.out.println(" ");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 10;
                    } // Sair do loop
                    break;

                case 6: // Potência
                    System.out.print("Digite a base: ");
                    double base = lerNumero(scanner);
                    System.out.print("Digite o expoente: ");
                    double expoente = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println("Resultado da Potência: " + Operacoes.potencia(base, expoente));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 10;
                    } // Sair do loop
                    break;

                case 7: // Seno
                    System.out.print("Digite o ângulo em graus: ");
                    double anguloSeno = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println(
                            "O resultado é aproximadamente: " + String.format("%.2f", Operacoes.sen(anguloSeno)));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 10;
                    } // Sair do loop
                    break;

                case 8: // Cosseno
                    System.out.print("Digite o ângulo em graus: ");
                    double anguloCosseno = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println(
                            "O resultado é aproximadamente: " + String.format("%.2f", Operacoes.cos(anguloCosseno)));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 10;
                    } // Sair do loop
                    break;

                case 9: // Tangente
                    System.out.println("Digite o ângulo em graus: ");
                    double anguloTangente = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println(
                            "O resultado é aproximadamente: " + String.format("%.2f", Operacoes.tan(anguloTangente)));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 10;
                    } // Sair do loop
                    break;

                case 10: // Sair
                    System.out.println("Saindo da calculadora...");
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        } while (escolha != 10);

        scanner.close();
    }

    // Método para receber a escolha do usuário
    public int escolhaDeOperacao(Scanner scanner) {
        mostrarInterfaceCalculadora();
        return scanner.nextInt();
    }

    // Método para printar a interface da Calculadora
    public void mostrarInterfaceCalculadora() {
        System.out.println("--------------------------");
        System.out.println("Calculadora Científica: ");
        System.out.println("--------------------------");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Raiz Quadrada");
        System.out.println("6. Potência");
        System.out.println("7. Seno");
        System.out.println("8. Cosseno");
        System.out.println("9. Tangente");
        System.out.println("10. Sair");
        System.out.println("--------------------------");
        System.out.println("Escolha uma operação: ");
    }

    // Método para verificar as entradas de números
    public static double lerNumero(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um número válido: ");
            scanner.next(); // descarta a entrada inválida
        }
        return scanner.nextDouble();
    }
}
