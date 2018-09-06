package cadastro.de.empregados;
import java.util.Scanner;

 //* @author paulo

public class CadastroDeEmpregados {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int opcao;
        String nome;
        String departamento;
        double salario;
        Empregado emp1;
        Terceiro emp2;
        
        do{
            System.out.println("**********MENU**********");
            System.out.println("1 - Cadastrar empregado");
            System.out.println("2 - Alterar empregado");
            System.out.println("3 - Consultar empregado");
            System.out.println("4 - Excluir empregado");
            System.out.println("5 - Sair");
            System.out.println("************************");
            opcao = ler.nextInt();
            switch(opcao){
                case 1:
                    /*System.out.print("Digite o nome: ");
                    nome = ler.next();
                    System.out.print("Digite o departamento: ");
                    departamento = ler.next();
                    System.out.print("Digite o salário: R$");
                    salario = ler.nextDouble();
                    System.out.println("");
                    emp1 = new Empregado(nome, departamento, salario);*/
                    emp1 = new Empregado("Paulo", "Desenvolvimento", 1);

                    /*System.out.print("Digite o nome: ");
                    nome = ler.next();
                    System.out.println("");
                    emp2 = new Terceiro(nome);
                    emp2.setDepartamento("Vendas");*/
                    emp2 = new Terceiro("Lucia");
                    
                    System.out.println(emp1.getCodigo() + ": " + emp1.getNome() + " " + emp1.getDepartamento() + " " + emp1.getSalario());
                    System.out.println(emp2.getCodigo() + ": " + emp2.getNome() + " " + emp2.getClass());
                    
                    emp1.mostraEmp();
                    emp2.mostraEmp();
                    
                    emp2.teste();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao == 0);
    }
}
