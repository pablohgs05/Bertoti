public class PainelDisplay implements Observer {
    @Override
    public void atualizar(double temp) {
        System.out.println("Display: Mostrando temperatura " + temp);
    }
}