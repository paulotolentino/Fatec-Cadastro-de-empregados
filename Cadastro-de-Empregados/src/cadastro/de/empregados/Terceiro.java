package cadastro.de.empregados;

/**
 *
 * @author paulo
 */
public class Terceiro extends Empregado{

    public Terceiro(String nome) {
        super(nome);
    }
    
    public void mostraEmp(){
        System.out.println(super.getCodigo() + ": " + super.getNome());
    }
    
    public void teste(){
        mostraEmp();
        super.mostraEmp();
    }
    
}
