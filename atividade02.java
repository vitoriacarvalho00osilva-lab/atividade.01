public class Atividade02 {
    public static void main(String[] args) {

        // Temperatura fixa em Celsius para exemplo
        double celsius = 30.0;

        // Conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Saída formatada
        System.out.println("\nPráticas\n");
        System.out.printf("Temperatura em Celsius: %.1f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.1f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
    }
}
