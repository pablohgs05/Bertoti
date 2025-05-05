public class Contexto {
    private Estrategia estrategia;

    public Contexto(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public int executar(int a, int b) {
        return estrategia.execute(a, b);
    }
}