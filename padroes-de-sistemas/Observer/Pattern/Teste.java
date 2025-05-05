public class Teste {
    public static void main(String[] args) {
        EstacaoMeteorologica est = new EstacaoMeteorologica();
        est.registrar(new AppClima());
        est.registrar(new PainelDisplay());
        est.setTemperatura(25.5);
    }
}