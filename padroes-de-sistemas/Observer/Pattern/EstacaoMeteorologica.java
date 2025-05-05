import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements Subject {
    private List<Observer> observadores = new ArrayList<>();
    private double temperatura;

    @Override
    public void registrar(Observer o) {
        observadores.add(o);
    }

    @Override
    public void remover(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificar() {
        for (Observer o : observadores) {
            o.atualizar(temperatura);
        }
    }

    public void setTemperatura(double temp) {
        this.temperatura = temp;
        notificar();
    }
}