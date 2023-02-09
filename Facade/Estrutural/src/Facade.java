public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = Cep.getInstance().recuperarCidade(cep);
        String estado = Cep.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
