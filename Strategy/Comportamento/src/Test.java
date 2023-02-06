public class Test {
  public static void main(String[] args) {
    Comportamento normal = new ComportamentoNormal();
    Comportamento agressivo = new ComportamentoAgressivo();
    Comportamento defensivo = new ComportamentoDefensivo();

    Robo optimusRobo = new Robo();

    optimusRobo.setStrategy(defensivo);
    optimusRobo.moverRobo();

    optimusRobo.setStrategy(normal);
    optimusRobo.moverRobo();

    optimusRobo.setStrategy(agressivo);
    optimusRobo.moverRobo();


  }
}
