public class Main {
    public static void main(String[] args) {
    
        Funcionario funcionario = new Funcionario("Pedro Tezza", "12345678909", 3000.00);

        
        System.out.println("Informações do Funcionário:");
        funcionario.exibirInformacoes();

        
        System.out.println("\nAtualizando o salário para 3500.00...");
        funcionario.setSalario(3500.00);
        funcionario.exibirInformacoes();

        
        System.out.println("\nTentando definir um salário inválido (-1000.00)...");
        funcionario.setSalario(-1000.00);
        funcionario.exibirInformacoes();

       
        System.out.println("\nAumentando o salário em 10%...");
        funcionario.aumentarSalario(10);
        funcionario.exibirInformacoes();

        
        String cpfParaValidar = funcionario.getCpf();
        if (funcionario.validadooDeCpf(cpfParaValidar)) {
            System.out.println("\nCPF válido!");
        } else {
            System.out.println("\nCPF inválido!");
        }
    }
}
    

