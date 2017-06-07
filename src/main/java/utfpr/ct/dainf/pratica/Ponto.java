package utfpr.ct.dainf.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Ponto {
    private double x, y, z;

    public Ponto() {
    }

    public Ponto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    /**
     * Retorna o nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double dist(Ponto p) {
        return Math.sqrt(Math.pow(p.x-x,2)
            + Math.pow(p.y-y,2) + Math.pow(p.z-z,2));
    }

    @Override
    public String toString() {
        return String.format("%s(%f,%f,%f)", getNome(), x, y, z);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean eq = false;
        if (obj != null && obj instanceof Ponto) {
            Ponto p = (Ponto) obj;
            eq = x == p.x && y == p.y && z == p.z;
        }
        return eq;
    }   

}
