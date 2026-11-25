package Bridge;

public class Main {
    public static void main(String[] args) {
        // La magia del Bridge: podemos combinar cualquier control con cualquier dispositivo
        
        System.out.println("=== Control Básico con Radio ===");
        ControlRemoto control1 = new ControlRemotoBasico(new Radio());
        probarControlRemoto(control1);
        
        System.out.println("\n=== Control Avanzado con TV ===");
        ControlRemotoAvanzado control2 = new ControlRemotoAvanzado(new TV());
        probarControlRemoto(control2);
        control2.mute();


        System.out.println("\n === Control Básico con TV ===");
        ControlRemoto control3 = new ControlRemotoBasico(new TV());
        probarControlRemoto(control3);

        
        System.out.println("\n === Control avanzado con Radio ===");
        ControlRemotoAvanzado control4 = new ControlRemotoAvanzado(new Radio());
        probarControlRemoto(control4);
        control4.record();
    
    }

    public static void probarControlRemoto(ControlRemoto control){
        control.togglePower();
        control.volumeUp();
        control.channelUp();
        control.volumeDown();
        control.channelDown();
        control.togglePower();

    }
}