package Part_7;

public class Users {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Users(String name, String city) {
        this.name = name;
        this.city = city;

    }
}
