public class Main {
    // Método principal que o Java executa primeiro
    public static void main(String[] args) {

        // Cria um relógio no formato brasileiro (24 horas)
        Clock brlClock = new BRLClock();

        // Define os segundos, minutos e horas
        brlClock.setSecund(0);
        brlClock.setMinute(0);

        // Colocamos 25 horas de propósito.
        // A lógica do nosso 'setHour' corrigido vai transformar isso em 00 (meia-noite).
        brlClock.setHour(25);

        // Imprime a hora do relógio brasileiro. O getTime() agora retorna um texto (String).
        System.out.println("Hora Brasil: " + brlClock.getTime());

        // Aqui a mágica acontece:
        // 1. Criamos um relógio americano: new USClock()
        // 2. Chamamos o método convert() e passamos o OBJETO brlClock para dentro dele.
        // 3. O convert() calcula tudo e retorna o próprio relógio americano ajustado.
        // 4. Chamamos o getTime() para pegar o texto formatado (ex: "12:00:00 AM") e imprimimos.
        System.out.println("Hora EUA: " + new USClock().convert(brlClock).getTime());
    }
}