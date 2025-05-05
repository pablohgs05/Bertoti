public class Teste {
    public static void main(String[] args) {
        Contexto ctx = new Contexto();
        System.out.println("Soma: " + ctx.executar("soma", 5, 3));
        System.out.println("Subtração: " + ctx.executar("subtracao", 5, 3));
    }
}