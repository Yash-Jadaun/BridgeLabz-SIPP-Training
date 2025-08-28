package Generics.LambdaExpression;

interface LightAction {
    void execute();
}

class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Motion detected: Turning on lights.");
        LightAction night = () -> System.out.println("Night mode: Dim lights activated.");
        LightAction voice = () -> System.out.println("Voice command: Party lights on!");

        motion.execute();
        night.execute();
        voice.execute();
    }
}
