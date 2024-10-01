import java.util.Scanner;

public class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.println("");
        return false;
    }

    public void escrevaQuestao(){
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }

public class Quiz{
    public static void main(String[] args) {

        System.out.println("Faculdade: Centro Universitário - Alfredo Nasser");
        System.out.println("Aluno: Victor Hugo Soares Castro");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Bem-vindo ao quiz de 15 perguntas sobre o tema 'Curiosidade'!");
        System.out.println("Você responderá a 15 perguntas de múltipla escolha sobre curiosidades interessantes e divertidas.");
        System.out.println()

        Questao[] perguntas = new Questao[15];

        perguntas[1] = new Questao();
        perguntas[1].pergunta = "Qual o nome da bebida que também pode ser chamada de H20?: ";
        perguntas[1].opcaoA = "A) Pepsi";
        perguntas[1].opcaoB = "B) Coca Cola";
        perguntas[1].opcaoC = "C) Água";
        perguntas[1].opcaoD = "D) Guaraná";
        perguntas[1].opcaoE = "E) Sprite";
        perguntas[1].correta = "C"; 

        perguntas[2] = new Questao();
        perguntas[2].pergunta = "Qual o nome da bebida mais consumida no mundo?: "

}

