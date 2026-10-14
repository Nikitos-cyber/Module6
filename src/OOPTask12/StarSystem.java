package OOPTask12;

public class StarSystem {
    private String starName;
    private int quantityOfPlanets;
    private long age;

    public StarSystem(String starName, int quantityOfPlanet, long age) {
        this.starName = starName;
        this.quantityOfPlanets = quantityOfPlanet;
        this.age = age;
    }

    public String getStarName() {
        return starName;
    }

    public int getQuantityOfPlanets() {
        return quantityOfPlanets;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public void setQuantityOfPlanets(int quantityOfPlanets) {
        this.quantityOfPlanets = quantityOfPlanets;
    }

    public String getInfo(){
        StringBuilder stb = new StringBuilder();
        stb.append("{").append(" ").append(starName).append(" ").append(quantityOfPlanets).append(" ").append(age).append(" ").append("}");
        return String.valueOf(stb);
    }
}
