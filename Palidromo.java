public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita una palabra por teclado
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        // Convierte la palabra a minúsculas y elimina espacios
        palabra = palabra.toLowerCase().replaceAll("\\s+", "");

        
        boolean esPalindromo = true;
        int longitud = palabra.length();
      
        //Aca va dando una cantidad de vueltas n exponencial, osea su grado de complejidad es n^a la longitud
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra NO es un palíndromo.");
        }

        scanner.close();
    }
}
