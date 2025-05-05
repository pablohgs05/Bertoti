public class Contexto {
    public int executar(String operacao, int a, int b) {
        if ("soma".equals(operacao)) {
            return a + b;
        } else if ("subtracao".equals(operacao)) {
            return a - b;
        }
        return 0;
    }
}