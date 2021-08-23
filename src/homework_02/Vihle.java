package homework_02;

public class Vihle extends Engine{

    private int diametrVhile;
    private String material;


    public Vihle(int countcylinder, int diametrVhile, String material) {
        super(countcylinder);
        this.diametrVhile = diametrVhile;
        this.material = material;
    }

    public int getDiametrVhile() {
        return diametrVhile;
    }

    public void setDiametrVhile(int diametrVhile) {
        this.diametrVhile = diametrVhile;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Vihle{" +
                "diametrVhile=" + diametrVhile +
                ", material='" + material + '\'' +toString()+
                '}';
    }
}
