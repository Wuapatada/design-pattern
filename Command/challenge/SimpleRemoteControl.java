class SimpleRemoteControl {

    private final Light light;

    public SimpleRemoteControl(Light light) {
        this.light = light;
    }

    public void pressButtonOn() {
        light.turnOn();
    }

    public void pressButtonOff() {
        light.turnOff();
    }
}
