package ui.objects;

public class Clubs {
    private String name;
    private int point;

    public Clubs (String name, int point){
        this.name = name;
        this.point = point;
    }

    public Clubs() {
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", point=" + point;
    }
}
