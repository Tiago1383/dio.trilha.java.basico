public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está Ligada ?: " + smartTv.ligada);
        System.out.println("Canal Atual ?: " + smartTv.canal);
        System.out.println("Volume Atual ?: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Satus - A TV está Ligada ?: " + smartTv.ligada);
    }
}
