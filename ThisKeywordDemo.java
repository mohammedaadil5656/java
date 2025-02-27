public class ThisKeywordDemo {
    private String name;

    public ThisKeywordDemo(String name) {
        this.name = name; // 'this.name' refers to the instance variable
    }

    public void printName() {
        String name = "Local Name"; // Local variable
        System.out.println("Local Name: " + name);
        System.out.println("Instance Name: " + this.name); // 'this.name' refers to the instance variable
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo("John");
        obj.printName();
    }
}