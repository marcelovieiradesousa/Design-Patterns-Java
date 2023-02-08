public class Test {
  public static void main(String[] args) {
    SingletonLazy objLazy;
    SingletonLazyHolder objLazyHolder;
    SingletonEager objEager;
    
    objLazy = SingletonLazy.getInstancia();
    System.out.println(objLazy);
    objLazy = SingletonLazy.getInstancia();
    System.out.println(objLazy);

    objLazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(objLazyHolder);
    objLazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(objLazyHolder);

    objEager = SingletonEager.getInstancia();
    System.out.println(objEager);
    objEager = SingletonEager.getInstancia();
    System.out.println(objEager);
}
}