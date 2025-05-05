public class Teste {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new Soma());
        System.out.println("Soma: " + contexto.executar(5, 3));
        contexto = new Contexto(new Subtracao());
        System.out.println("Subtração: " + contexto.executar(5, 3));
    }
}