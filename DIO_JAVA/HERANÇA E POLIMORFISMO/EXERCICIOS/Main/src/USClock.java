public non-sealed class USClock extends Clock {

    // Variável exclusiva do relógio americano para guardar "AM" ou "PM"
    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPeriodIndicator(String periodIndicator) {
        this.periodIndicator = periodIndicator;
    }

    public void setAfterMidDay() {
        this.periodIndicator = "PM";
    }

    public void setBeforMidDay() {
        this.periodIndicator = "AM";
    }

    // Sobrescrevendo o setHour do pai (Clock) para tratar a regra americana.
    @Override
    public void setHour(int hour) {
        // Se for 00 ou passar de 24, é meia-noite (12 AM no formato EUA)
        if (hour == 0 || hour >= 24) {
            this.hour = 12;
            this.periodIndicator = "AM";

            // Se for exatamente 12, é meio-dia (12 PM)
        } else if (hour == 12) {
            this.hour = 12;
            this.periodIndicator = "PM";

            // Se for maior que 12 (13 a 23), subtrai 12 e vira PM (ex: 14 - 12 = 2 PM)
        } else if (hour > 12) {
            this.hour = hour - 12;
            this.periodIndicator = "PM";

            // Se for entre 1 e 11, mantém o número e é AM (manhã)
        } else {
            this.hour = hour;
            this.periodIndicator = "AM";
        }
    }

    // Implementação da conversão para o relógio americano
    @Override
    Clock convert(final Clock clock) {
        this.secund = clock.getSecund();
        this.minute = clock.getMinute();

        switch (clock) {
            case USClock usClock -> {
                // Se já for um relógio dos EUA, só copia tudo.
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> {
                // Se for um relógio do Brasil (24h), pegamos a hora dele...
                // e passamos para o NOSSO setHour() que acabamos de sobrescrever acima.
                // Ele já vai fazer a matemática toda de subtrair 12 e colocar AM/PM automático!
                this.setHour(brlClock.getHour());
            }
        }
        return this;
    }

    // Sobrescreve o método getTime para adicionar o "AM" ou "PM" no final.
    @Override
    public String getTime() {
        // super.getTime() chama o método da classe pai (que formata o 00:00:00).
        // Depois concatenamos um espaço e o indicador.
        return super.getTime() + " " + this.periodIndicator;
    }
}