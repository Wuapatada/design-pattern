public class Main {

    public static void main(String[] args) {
        System.out.println("=== Usando control remoto CON Command ===");

        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        SimpleRemoteControl remote = new SimpleRemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
