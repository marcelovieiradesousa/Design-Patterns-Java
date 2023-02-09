public class Cep {
  private static Cep cep = new Cep();

  private Cep(){
    super();
  }

  public static Cep getInstance(){
    return cep;
  }

  public String recuperarCidade(String cep){
    return "BH";
  }
  public String recuperarEstado(String cep){
    return "MG";
  }
}
