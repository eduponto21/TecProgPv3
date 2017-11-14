package utfpr.ct.dainf.pratica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * @param <T> Tipo do ponto
 */
public class Poligonal<T extends Ponto2D> {

    private final List<T> vertices = new ArrayList<>();

    public int getN() {
        return vertices.size();
    }

    public T get(int i) {
        if (i < 0 || i >= vertices.size()) {
            throw new RuntimeException(String.format("get(%d): índice inválido", i));
        }
        return vertices.get(i);
    }

    public void set(int i, T p) {
        if (i < 0 || i > vertices.size()) {
            throw new RuntimeException(String.format("set(%d): índice inválido", i));
        }

        if (i == vertices.size()) {
            vertices.add(p);
        } else {
            vertices.set(i, p);
        }
    }

    public double getComprimento() {
        double comp = 0.0;
        Iterator<T> it1 = vertices.iterator();
        Iterator<T> it2 = vertices.iterator();
        it2.next();

        for (; it2.hasNext();) {
            T i = it1.next();
            T j = it2.next();
            comp += Math.sqrt(Math.pow(j.getX() - i.getX(), 2)
                    + Math.pow(j.getY() - i.getY(), 2)
                    + Math.pow(j.getZ() - i.getZ(), 2));

        }
        return comp;
    }

}
