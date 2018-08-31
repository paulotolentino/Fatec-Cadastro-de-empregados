package cadastro.de.empregados;
// @author paulo
public class Empregado {

    private static int count = 1;
    
    private int codigo;
    private String nome;
    private String departamento;
    private double salario;

    public Empregado(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        codigo = count++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }   
}
