package utfpr.ct.dainf.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class PontoXY extends Ponto2D {

    public PontoXY() {
    }

    public PontoXY(double x, double y) {
        super(x, y, 0);
    }
    
    @Override
    public String toString() {
        return String.format("%s(%f,%f)", getNome(), getX(), getY());
    }
    
}
