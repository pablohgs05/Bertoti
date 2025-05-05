public class Teste {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();
        System.out.println(s1 == s2);
        s1.acao();
    }
}