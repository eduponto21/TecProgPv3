package utfpr.ct.dainf.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class PontoYZ extends Ponto2D {

    public PontoYZ() {
    }

    public PontoYZ(double y, double z) {
        super(0, y, z);
    }
    
    @Override
    public String toString() {
        return String.format("%s(%f,%f)", getNome(), getY(), getZ());
    }

}
