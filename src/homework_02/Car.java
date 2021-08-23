package homework_02;

public class Car  extends Vihle{

    private int yearBorn;
    private int hoursStrong;


    public Car(int countcylinder, int diametrVhile, String material, int yearBorn, int hoursStrong) {
        super(countcylinder, diametrVhile, material);
        this.yearBorn = yearBorn;
        this.hoursStrong = hoursStrong;
    }



    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public int getHoursStrong() {
        return hoursStrong;
    }

    public void setHoursStrong(int hoursStrong) {
        this.hoursStrong = hoursStrong;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearBorn=" + yearBorn +
                ", hoursStrong=" + hoursStrong+" Countcylinder="+ getCountcylinder()+" DiametrVhile="+getDiametrVhile()+" Material="+getMaterial()+
                '}';
    }
}
