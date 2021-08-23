package homework_02;

public class Engine {
   private int countcylinder;

    public Engine(int countcylinder) {
        this.countcylinder = countcylinder;
    }

    public int getCountcylinder() {
        return countcylinder;
    }

    public void setCountcylinder(int countcylinder) {
        this.countcylinder = countcylinder;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "countcylinder=" + countcylinder +
                '}';
    }
}
