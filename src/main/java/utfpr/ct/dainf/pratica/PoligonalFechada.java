/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.pratica;

/**
 *
 * @author a1906399
 */
public class PoligonalFechada<T extends Ponto2D> extends Poligonal {

    @Override
    public double getComprimento() {
        double comp = super.getComprimento();
        T j = (T) super.get(0);
        T i = (T) super.get(super.getN() - 1);

        comp += Math.sqrt(Math.pow(j.getX() - i.getX(), 2)
                + Math.pow(j.getY() - i.getY(), 2)
                + Math.pow(j.getZ() - i.getZ(), 2));

        return comp;
    }

}
