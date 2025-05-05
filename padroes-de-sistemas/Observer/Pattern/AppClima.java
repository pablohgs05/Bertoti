public class AppClima implements Observer {
    @Override
    public void atualizar(double temp) {
        System.out.println("App Clima: Temperatura atual é " + temp);
    }
}