public class EstacaoMeteorologica {
    private double temperatura;
    private AppClima app;
    private PainelDisplay display;

    public EstacaoMeteorologica() {
        app = new AppClima();
        display = new PainelDisplay();
    }

    public void setTemperatura(double temp) {
        this.temperatura = temp;
        app.atualizar(temp);
        display.atualizar(temp);
    }
}