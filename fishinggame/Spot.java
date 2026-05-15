package enshuA6;

public class Spot {
    private String name;

    Spot(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
