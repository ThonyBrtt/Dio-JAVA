public class Main {
    public static void main(String[] args){
        String minhaMensagem = "COMER TEU CU";

        Message[] servicos = {
                new SMS(),
                new Email(),
                new Network(),
                new WhatsApp()
        };

        for (Message servico : servicos) {
            servico.ReceiveMessage(minhaMensagem);
        }
    }
}

