package utfpr.ct.dainf.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class PontoXZ extends Ponto2D {

    public PontoXZ() {
    }

    public PontoXZ(double x, double z) {
        super(x, 0, z);
    }

    @Override
    public String toString() {
        return String.format("%s(%f,%f)", getNome(), getX(), getZ());
    }
    
}
