
package model;

public class Aluno extends Pessoa implements Crud{
    
    
    private int matricula;
    private String responsavel;
    
    public Aluno() {}

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void salvar() {
        
    }

    public void salvar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
