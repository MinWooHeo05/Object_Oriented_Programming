class Monitor {
    private String size;
    private String color;
    private String power;

    public Monitor(String size, String color, String power) {
        this.size = size;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println();
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String coolerColor;
    private String power;

    public Computer(String cpu, String memory, String hdd, String coolerColor, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.coolerColor = coolerColor;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println();
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hdd);
        System.out.println("Color: " + coolerColor);
        System.out.println("Power: " + power);
        System.out.println();
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
        System.out.println();
    }

    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Monitor m = new Monitor("32 inch", "Black", "45W");
        Computer c = new Computer("Core i7", "32GB", "2TB", "White", "700W");
        PersonalComputer pc = new PersonalComputer(c, m);
        pc.turnOn();
        pc.printInfo();
    }
}
