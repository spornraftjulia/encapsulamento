public class Cliente {

    public static void main(String[] args) {
        
        Conta conta = new Conta();

        conta.setNumero(45);
        conta.setSalario(50000);
        conta.setNome("Julia");

        System.out.println(conta.getNumero());
        System.out.println(conta.getSalario());
        System.out.println(conta.getNome());
    }

}