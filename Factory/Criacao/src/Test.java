public class Test {
  public static void main(String[] args) {
    Computer pc = ComputerFactory.getComputer("PC", "8GB", "1TB", "intel5");
    Computer server = ComputerFactory.getComputer("Server", "16GB", "4TB", "intel3");

    System.out.println("PC:::"+pc.getClass());
    System.out.println("SERVER:::"+server.getClass());
  }
}
