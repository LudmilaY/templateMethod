/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraotemplatemethod;

import junit.framework.TestCase;

/**
 *
 * @author user
 */
public class AlunoPosGraduacaoTest extends TestCase {
    
    Aluno aluno;
    
    public AlunoPosGraduacaoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        aluno = new AlunoPosGraduacao();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testGetEstado_AlunoPosGraduacao(){
        assertEquals("Faculdade", aluno.getOrigem());
    }
    
}
