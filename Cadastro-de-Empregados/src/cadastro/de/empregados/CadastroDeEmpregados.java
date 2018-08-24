/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.de.empregados;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class CadastroDeEmpregados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        
        String nome = ler.next();
        String departamento = ler.next();
        double salario = ler.nextDouble();
        Empregado emp1;
        Empregado emp2;
        
        do{
            System.out.println("**********MENU**********");
            System.out.println("1 - Cadastrar empregado");
            System.out.println("2 - Alterar empregado");
            System.out.println("3 - Consultar empregado");
            System.out.println("4 - Excluir empregado");
            System.out.println("5 - Sair");
            System.out.println("************************");
            
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome: ");
                    nome = ler.next();
                    System.out.println("Digite o departamento: ");
                    departamento = ler.next();
                    System.out.println("Digite o salário: R$");
                    salario = ler.nextDouble();
                    
                    emp1 = new Empregado(nome, departamento, salario);

                    System.out.println("Digite o nome: ");
                    nome = ler.next();
                    System.out.println("Digite o departamento: ");
                    departamento = ler.next();
                    System.out.println("Digite o salário: R$");
                    salario = ler.nextDouble();
                    emp2 = new Empregado(nome, departamento, salario);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println(emp1.getCodigo() + ": " + emp1.getNome() + " " + emp1.getDepartamento() + " " + emp1.getSalario());
                    System.out.println(emp2.getCodigo() + ": " + emp2.getNome() + " " + emp2.getDepartamento() + " " + emp2.getSalario());
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida");
                
            
            }
        }while(opcao != 5);
        
    }
    
}
