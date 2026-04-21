package keyword;

public class Client {
    private static String staticName;
    private String name;

    public String getStaticName() {
        return staticName;
    }

    public void setStaticName(final String paran){
        staticName = paran;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
