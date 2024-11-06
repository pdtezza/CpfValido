public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    Funcionario(String nome, String cpf, double salario)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome()
    {
        return nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setSalario(double novoSalario)
    {
        if(novoSalario > 0)
        {
            salario = novoSalario;
        }
        else{
            System.out.println("Erro, salário inválido!");
        }
    }

    public void aumentarSalario(double percentual)
    {
        if(percentual >=0){
            salario = salario + (salario * percentual/100);
        }
        else {
            System.out.println("Erro, percentual inválido");
        }
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Salário: " + salario);

    }
    public boolean validadooDeCpf(String cpf){

        cpf = cpf.replaceAll("\\D", "");

    
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int[] numeros = new int[11];
        for (int i = 0; i < 11; i++) {
            numeros[i] = Character.getNumericValue(cpf.charAt(i));
        }

       
        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += numeros[i] * (10 - i);
        }
        int digito1 = 11 - (soma1 % 11);
        if (digito1 >= 10) digito1 = 0;

       
        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += numeros[i] * (11 - i);
        }
        int digito2 = 11 - (soma2 % 11);
        if (digito2 >= 10) digito2 = 0;

        
        return digito1 == numeros[9] && digito2 == numeros[10];
    }


}
