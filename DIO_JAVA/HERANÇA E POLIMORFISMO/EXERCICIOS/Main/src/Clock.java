// 'sealed' significa que esta classe é selada.
// 'permits' restringe quais classes podem ser filhas dela (apenas BRLClock e USClock).
public sealed abstract class Clock permits BRLClock, USClock {

    // Variáveis protegidas para que as classes filhas possam acessá-las diretamente.
    protected int hour;
    protected int minute;
    protected int secund;

    // --- GETTERS E SETTERS ---

    public int getHour() {
        return hour;
    }

    // Define a hora com uma trava de segurança.
    public void setHour(int hour) {
        // Se a hora for 24 ou mais, zera para representar meia-noite (00:00).
        if (hour >= 24) {
            this.hour = 0;
            return; // Interrompe a execução do método aqui
        }
        this.hour = hour; // Se for menor que 24, salva a hora normalmente
    }

    public int getMinute() {
        return minute;
    }

    // Define os minutos com trava de segurança.
    public void setMinute(int minute) {
        // Um relógio não tem "60 minutos", ele volta para o zero e viraria a hora.
        // Aqui estamos apenas zerando caso passe de 59.
        if (minute >= 60) {
            this.minute = 0;
            return;
        }
        this.minute = minute;
    }

    public int getSecund() {
        return secund;
    }

    // Define os segundos com a mesma trava dos minutos.
    public void setSecund(int secund) {
        if (secund >= 60) {
            this.secund = 0;
            return;
        }
        this.secund = secund;
    }

    // --- MÉTODOS DE FORMATAÇÃO E RETORNO ---

    // Método auxiliar (protegido) para formatar números menores que 10.
    // Exemplo: se for 9, retorna "09". Se for 15, retorna "15".
    protected String format(int value) {
        return value <= 9 ? "0" + value : String.valueOf(value);
    }

    // Método que devolve a hora pronta para exibir na tela.
    // O erro antigo era que isso retornava 'Clock'. Agora retorna 'String' corretamente.
    public String getTime() {
        // Concatena formatando HH:MM:SS
        return format(hour) + ":" + format(minute) + ":" + format(secund);
    }

    // Método abstrato: obriga as classes filhas a criarem suas próprias regras de conversão.
    abstract Clock convert(Clock clock);
}