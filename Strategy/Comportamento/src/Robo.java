public class Robo {
  private Comportamento strategy;

  public void setStrategy(Comportamento comportamento) {
    this.strategy = comportamento;
  }

  public void moverRobo() {
    strategy.mover();
  }
}
