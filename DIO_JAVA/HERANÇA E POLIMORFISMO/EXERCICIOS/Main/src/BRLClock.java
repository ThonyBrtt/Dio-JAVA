// 'non-sealed' reabre a hierarquia, pois o pai (Clock) é selado.
public non-sealed class BRLClock extends Clock {

    // Sobrescreve o método de conversão obrigatório.
    @Override
    public Clock convert(final Clock clock) {
        // Segundos e minutos são iguais em qualquer lugar do mundo
        this.secund = clock.getSecund();
        this.minute = clock.getMinute();

        // Pattern Matching: verifica qual é o TIPO do relógio que foi passado no parâmetro.
        switch (clock) {
            case USClock usClock -> {
                // Se for um relógio americano (12h), precisamos transformar em 24h.
                // Verifica se é período da tarde/noite (PM)
                if (usClock.getPeriodIndicator().equals("PM")) {
                    // Se for 12 PM (meio-dia), a hora no Brasil é 12 mesmo.
                    // Se for 1 PM a 11 PM, soma 12 (ex: 1 PM vira 13, 2 PM vira 14).
                    this.hour = (usClock.getHour() == 12) ? 12 : usClock.getHour() + 12;
                } else {
                    // Se for AM (manhã/madrugada).
                    // Se for 12 AM (meia-noite), no Brasil é 00. Senão, mantém a hora normal (1 a 11).
                    this.hour = (usClock.getHour() == 12) ? 0 : usClock.getHour();
                }
            }
            case BRLClock brlClock -> {
                // Se já for um relógio brasileiro, só copia a hora direto.
                this.hour = brlClock.getHour();
            }
        }

        // Retorna o próprio objeto BRLClock modificado.
        return this;
    }
}