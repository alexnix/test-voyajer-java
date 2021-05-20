public class MainJava {
    private String name;

    public MainJava(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] arg) {
        MainJava m = new MainJava("John Does");
        System.out.println("Hello " + m.getName());
    }
}
