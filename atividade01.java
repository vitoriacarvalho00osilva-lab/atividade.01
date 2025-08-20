public class Atividade01 {
    public static void main(String[] args) {

        // Notas fixas para exemplo
        double[] notas = {10.0, 9.0, 7.0, 6.0, 8.0, 7.0, 10.0, 7.5};

        // Cálculo das médias bimestrais
        double b1 = (notas[0] + notas[1]) / 2;
        double b2 = (notas[2] + notas[3]) / 2;
        double b3 = (notas[4] + notas[5]) / 2;
        double b4 = (notas[6] + notas[7]) / 2;

        // Cálculo das médias semestrais
        double s1 = (b1 + b2) / 2;
        double s2 = (b3 + b4) / 2;

        // Cálculo da média final
        double mediaFinal = (s1 + s2) / 2;

        // Saída formatada
        System.out.println("\nPráticas\n");


        System.out.printf("1º Bimestre: %.1f\n", b1);
        System.out.printf("2º Bimestre: %.1f\n", b2);
        System.out.printf("1º Semestre: %.1f\n", s1);
        System.out.println("----------------------");
        System.out.printf("3º Bimestre: %.1f\n", b3);
        System.out.printf("4º Bimestre: %.1f\n", b4);
        System.out.printf("2º Semestre: %.1f\n", s2);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);
    }
}

