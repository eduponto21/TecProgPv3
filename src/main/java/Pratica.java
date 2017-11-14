
import utfpr.ct.dainf.pratica.*;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica {

    public static void main(String[] args) {
           
        PoligonalFechada<PontoXZ> pol = new PoligonalFechada<>();
        pol.set(0, new PontoXZ(-3,2));
        pol.set(1, new PontoXZ(-3,6));
        pol.set(2, new PontoXZ(0,2));
        
        double comp = pol.getComprimento();
        
        System.out.println(String.format("Comprimento da poligonal  = %.3f", comp));
    }
    
}
