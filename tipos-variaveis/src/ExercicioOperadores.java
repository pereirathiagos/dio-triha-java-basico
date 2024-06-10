public class ExercicioOperadores {

    public static void main(String[] args) {
        // Atribuição
        int numero = 10;

        // Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // Operador unário
        int valor = 5;
        System.out.println(-valor);
        valor++;
        System.out.println(valor++);
        System.out.println(valor);
        System.out.println(++valor);
        boolean verdadeiro = true;
        System.out.println(!verdadeiro);

        // Operador ternário
        int a = 5;
        int b = 6;
        String resultadoTernario = (a == b) ? "verdadeiro" : "falso";
        System.out.println(resultadoTernario);

        // Relacionais
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        // Comparações avançadas
        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); // true

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); // false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); // true

        // equals
        System.out.println(nome1.equals(nome2)); // true
        System.out.println(nome2.equals(nome3)); // true
        System.out.println(nome3.equals(nome4)); // true

        // Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2)
            System.out.println("Os dois valores precisam ser verdadeiros");

        if (condicao1 || condicao2)
            System.out.println("Um dos valores precisa ser verdadeiro");

        // Expressões lógicas avançadas
        int numeroA = 1;
        int numeroB = 1;

        if (numeroA == 2 & numeroB++ == 2)
            System.out.println("As duas condições são verdadeiras");

        System.out.println("O numeroA agora é " + numeroA);
        System.out.println("O numeroB agora é " + numeroB);
    }
}
