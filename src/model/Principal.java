
package model;

public class Principal {
    public static void main(String[] args) {
        
        Professor p = new Professor();
        
        p.setMatricula(222);
        p.setNome("João Carlos");
        p.setDisciplina("Programção");
        
        System.out.println(p.toString());
    }
    
}
