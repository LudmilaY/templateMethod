/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraotemplatemethod;

import junit.framework.TestCase;
import padraotemplatemethod.Aluno;

/**
 *
 * @author user
 */
public class AlunoGraduacaoTest extends TestCase {
    
    Aluno aluno;
    
    public AlunoGraduacaoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        aluno = new AlunoGraduacao();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testGetEstado_AlunoGraduacao(){
        assertEquals("Colégio", aluno.getOrigem());
    }
    
}