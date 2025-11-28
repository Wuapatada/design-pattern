public class Main {

    public static void main(String[] args) {
        System.out.println("=== Usando control remoto SIN Command ===");

        Light livingRoomLight = new Light();
        SimpleRemoteControl remote = new SimpleRemoteControl(livingRoomLight);

        remote.pressButtonOn();
        remote.pressButtonOff();
    }
}
