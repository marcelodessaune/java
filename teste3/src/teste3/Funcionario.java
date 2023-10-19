package teste3;

public class Funcionario {
    private String nome;
    private String matricula;
    private float salario;

    public Funcionario(String nome, String matricula, float salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }
    public void statusF(){
        System.out.println("=================");
        System.out.println("Nome do Funcionário: " + this.nome);
        System.out.println("Matrícula do Funcionário: " + this.matricula);
        System.out.println("Salário do Funcionário:R$ " + this.salario);
    }
}
