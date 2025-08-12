public class Main {
    public static void main(String[] args) {
        int lista[] = {42,7,9,3,25};
        int p;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] < lista[j]){
                    p = lista[i];
                    lista[i] = lista[j];
                    lista[j] = p;
                }
            }
        }
        for (int i = 0; i < lista.length ; i++) {
            System.out.println(lista[i]);
        }
    }
}