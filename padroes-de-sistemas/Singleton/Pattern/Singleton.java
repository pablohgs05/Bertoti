public class Singleton {
    private static Singleton instancia;
    private Singleton() {}
    public static synchronized Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
    public void acao() {
        System.out.println("Ação do Singleton");
    }
}