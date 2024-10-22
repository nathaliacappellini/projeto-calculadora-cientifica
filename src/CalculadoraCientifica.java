import java.util.Scanner;
import operacoes.OperacoesBasicas;
import operacoes.FuncoesTrigonometricas;

/*To Do: 
- Algumas Funções Trigonométricas
- Logaritmos e Funções Exponenciais
- Fatorial e Combinações
- Suporte para cálculos com números complexos
- Funções Estatísticas
*/

// Classe Main para executar
public class CalculadoraCientifica {
    public static void main(String[] args) {
        // Instâncias
        OperacoesBasicas operacoes = new OperacoesBasicas();
        FuncoesTrigonometricas funcoesTrig = new FuncoesTrigonometricas();
        CalculadoraCientifica main = new CalculadoraCientifica();
        Scanner scanner = new Scanner(System.in);

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
                    System.out.println("Resultado da Adição: " + operacoes.somar(num1, num2));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    String resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 2: // Subtração
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerNumero(scanner);
                    System.out.print("Digite o segundo número: ");
                    num2 = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println("Resultado da Subtração: " + operacoes.subtrair(num1, num2));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 3: // Multiplicação
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerNumero(scanner);
                    System.out.print("Digite o segundo número: ");
                    num2 = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println("Resultado da Multiplicação: " + operacoes.multiplicar(num1, num2));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 4: // Divisão
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerNumero(scanner);
                    System.out.print("Digite o segundo número: ");
                    num2 = lerNumero(scanner);
                    try {
                        System.out.println(" ");
                        System.out.println("Resultado da Divisão: " + operacoes.dividir(num1, num2));
                        System.out.println(" ");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 5: // Raiz Quadrada
                    System.out.print("Digite um número: ");
                    double valor = lerNumero(scanner);
                    try {
                        System.out.println(" ");
                        System.out.println("Resultado da Raiz Quadrada: " + operacoes.raiz(valor));
                        System.out.println(" ");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 6: // Potência
                    System.out.print("Digite a base: ");
                    double base = lerNumero(scanner);
                    System.out.print("Digite o expoente: ");
                    double expoente = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println("Resultado da Potência: " + operacoes.potencia(base, expoente));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 7: // Módulo
                    System.out.print("Digite o primeiro número: ");
                    num1 = lerNumero(scanner);
                    System.out.print("Digite o segundo número: ");
                    num2 = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println("Resultado do Módulo: " + operacoes.modulo(num1, num2));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 8: // Seno
                    System.out.print("Digite o ângulo em graus: ");
                    double anguloSeno = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println(
                            "O resultado é aproximadamente: " + String.format("%.2f", funcoesTrig.sen(anguloSeno)));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 9: // Cosseno
                    System.out.print("Digite o ângulo em graus: ");
                    double anguloCosseno = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println(
                            "O resultado é aproximadamente: " + String.format("%.2f", funcoesTrig.cos(anguloCosseno)));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 10: // Tangente
                    System.out.println("Digite o ângulo em graus: ");
                    double anguloTangente = lerNumero(scanner);
                    System.out.println(" ");
                    System.out.println(
                            "O resultado é aproximadamente: " + String.format("%.2f", funcoesTrig.tan(anguloTangente)));
                    System.out.println(" ");

                    // Confirmando se o usuário deseja continuar
                    System.out.println("Deseja continuar? Sim ou Não:");
                    resposta = scanner.next();
                    if (resposta.equalsIgnoreCase("Sim")) {
                    } else {
                        escolha = 11;
                    } // Sair do loop
                    break;

                case 11: // Sair
                    System.out.println("Saindo da calculadora...");
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        } while (escolha != 11);

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
        System.out.println("7. Módulo");
        System.out.println("8. Seno");
        System.out.println("9. Cosseno");
        System.out.println("10. Tangente");
        System.out.println("11. Sair");
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
