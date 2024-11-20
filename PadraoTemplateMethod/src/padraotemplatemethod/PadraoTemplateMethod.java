/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraotemplatemethod;

/**
 *
 * @author user
 */
public class PadraoTemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlunoGraduacao aluno1 = new AlunoGraduacao();
        aluno1.setNome("Grupinho");
        aluno1.setInstituicaoOrigem(" CTU");
        
        AlunoPosGraduacao aluno2 = new AlunoPosGraduacao();
        aluno2.setNome("Bolado");
        aluno2.setInstituicaoOrigem(" UFJF");
        
        System.out.println(aluno1.getDadosAluno());
        System.out.println(aluno2.getDadosAluno());
    }
    
}
