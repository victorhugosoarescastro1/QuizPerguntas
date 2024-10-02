import java.util.Scanner;

public class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
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

    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.println("");
        return false;
    }

    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }

    public class Quiz {
        {

            System.out.println("Faculdade: Centro Universitário - Alfredo Nasser");
            System.out.println("Curso: Engenharia de Software");
            System.out.println("Turma: ESNB2");
            System.out.println("Aluno: Victor Hugo Soares Castro");
            System.out.println("Professor: Brenno Pimenta");
            System.out.println("Bem-vindo ao quiz de 15 perguntas sobre o tema 'Curiosidade'!");
            System.out.println(
                    "Você responderá a 15 perguntas de múltipla escolha sobre curiosidades interessantes e divertidas.");
            System.out.println();

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
            perguntas[2].pergunta = "Qual é a bebida mais consumida no mundo?: ";
            perguntas[2].opcaoA = "A) Café";
            perguntas[2].opcaoB = "B) Chá";
            perguntas[2].opcaoC = "C) Água";
            perguntas[2].opcaoD = "D) Leite";
            perguntas[2].opcaoE = "E) Suco";
            perguntas[2].correta = "C";

            perguntas[3] = new Questao();
            perguntas[3].pergunta = "Qual bebida é feita a partir da fermentação d milho?: ";
            perguntas[3].opcaoA = "A) Cerveja";
            perguntas[3].opcaoB = "B) Whisky";
            perguntas[3].opcaoC = "C) Rum";
            perguntas[3].opcaoD = "D) Pinga";
            perguntas[3].opcaoE = "E) Chicha";
            perguntas[3].correta = "E";

            perguntas[4] = new Questao();
            perguntas[4].pergunta = "Qual a principal bebida consumida na Alemanha?: ";
            perguntas[4].opcaoA = "A) Vodak";
            perguntas[4].opcaoB = "B) Vinho";
            perguntas[4].opcaoC = "C) Cerveja";
            perguntas[4].opcaoD = "D) Tequila";
            perguntas[4].opcaoE = "E) Champgne";
            perguntas[4].correta = "C";

            perguntas[5] = new Questao();
            perguntas[5].pergunta = "Qual é a bebida tradicional do Brasil feita a partir da cana-de-açúcar?: ";
            perguntas[5].opcaoA = "A) Vodka";
            perguntas[5].opcaoB = "B) Cerveja";
            perguntas[5].opcaoC = "C) Vinho";
            perguntas[5].opcaoD = "D) Cachaça";
            perguntas[5].opcaoE = "E) Rum";
            perguntas[5].correta = "D";

            perguntas[6] = new Questao();
            perguntas[6].pergunta = "Qual é a bebida fermentada feita a partir de uvas?: ";
            perguntas[6].opcaoA = "A) Cerveja";
            perguntas[6].opcaoB = "B) Whisky";
            perguntas[6].opcaoC = "C) Vodka";
            perguntas[6].opcaoD = "D) Vinho";
            perguntas[6].opcaoE = "E) Tequila";
            perguntas[6].correta = "D";

            perguntas[7] = new Questao();
            perguntas[7].pergunta = "Qual é o café mais caro do mundo?: ";
            perguntas[7].opcaoA = "A) Café com Leite";
            perguntas[7].opcaoB = "B) Café Expresso";
            perguntas[7].opcaoC = "C) Café Mocha";
            perguntas[7].opcaoD = "D) Café Kopi Luwak";
            perguntas[7].opcaoE = "E) Café Cappuccino";
            perguntas[7].correta = "D";

            perguntas[8] = new Questao();
            perguntas[8].pergunta = "Qual é o tipo de chá mais consumido no mundo?";
            perguntas[8].opcaoA = "A) Chá Preto";
            perguntas[8].opcaoB = "B) Chá Verde";
            perguntas[8].opcaoC = "C) Chá Branco";
            perguntas[8].opcaoD = "D) Chá Amarelo";
            perguntas[8].opcaoE = "E) Chá Oolong";
            perguntas[8].correta = "B";

            perguntas[9] = new Questao();
            perguntas[9].pergunta = "Qual é a bebida energética mais popular no mundo?";
            perguntas[9].opcaoA = "A) Red Bull";
            perguntas[9].opcaoB = "B) Monster";
            perguntas[9].opcaoC = "C) Rockstar";
            perguntas[9].opcaoD = "D) 5-Hour Energy";
            perguntas[9].opcaoE = "E) AMP";
            perguntas[9].correta = "A";

            perguntas[10] = new Questao();
            perguntas[10].pergunta = "Qual é o país que produz mais vinho no mundo?";
            perguntas[10].opcaoA = "A) França";
            perguntas[10].opcaoB = "B) Itália";
            perguntas[10].opcaoC = "C) Espanha";
            perguntas[10].opcaoD = "D) Portugal";
            perguntas[10].opcaoE = "E) Chile";
            perguntas[10].correta = "A";

            perguntas[11] = new Questao();
            perguntas[11].pergunta = "Qual é a marca de suco de laranja mais popular no Brasil?";
            perguntas[11].opcaoA = "A) Tropicana";
            perguntas[11].opcaoB = "B) Minute Maid";
            perguntas[11].opcaoC = "C) Simply";
            perguntas[11].opcaoD = "D) Dole";
            perguntas[11].opcaoE = "E) Del Valle";
            perguntas[11].correta = "E";

            perguntas[12] = new Questao();
            perguntas[12].pergunta = "Qual é o nome do equipamento utilizado para filtrar o café?";
            perguntas[12].opcaoA = "A) Cafeteira";
            perguntas[12].opcaoB = "B) Filtro de café";
            perguntas[12].opcaoC = "C) Moedor de café";
            perguntas[12].opcaoD = "D) Torrefadora de café";
            perguntas[12].opcaoE = "E) Filtro de água";
            perguntas[12].correta = "B";

            perguntas[13] = new Questao();
            perguntas[13].pergunta = "Qual é o tipo de açúcar mais comumente utilizado na produção de refrigerantes?";
            perguntas[13].opcaoA = "A) Açúcar branco";
            perguntas[13].opcaoB = "B) Açúcar mascavo";
            perguntas[13].opcaoC = "C) Açúcar de cana";
            perguntas[13].opcaoD = "D) Açúcar de beterraba";
            perguntas[13].opcaoE = "E) Xilitol";
            perguntas[13].correta = "A";

            perguntas[14] = new Questao();
            perguntas[14].pergunta = "Qual é o nome do popular coquetel brasileiro feito com cachaça, limão e açúcar?";
            perguntas[14].opcaoA = "A) Pilsner";
            perguntas[14].opcaoB = "B) Stout";
            perguntas[14].opcaoC = "C) IPA";
            perguntas[14].opcaoD = "D) Pale Ale";
            perguntas[14].opcaoE = "E) Caipirinha";
            perguntas[14].correta = "E";

            perguntas[15] = new Questao();
            perguntas[15].pergunta = "Qual é o nome do popular chá verde japonês?: ";
            perguntas[15].opcaoA = "A) Tropical";
            perguntas[15].opcaoB = "B) Matcha";
            perguntas[15].opcaoC = "C) Americano";
            perguntas[15].opcaoD = "D) Tequilla";
            perguntas[15].opcaoE = "E) Hortelã";
            perguntas[15].correta = "B";

            int corretas = 0;
            int incorretas = 0;

            for (int i = 0; i < 15; i++) {
                perguntas[i].escrevaQuestao();
                String resposta = perguntas[i].leiaResposta();
                if (perguntas[i].isCorreta(resposta)) {
                    corretas++;
                } else {
                    incorretas++;
                }
            }

            System.out.println("Você acertou " + corretas + " perguntas!");
            System.out.println("Você errou " + incorretas + " perguntas!");
            System.out.println("Porcentagem de questões acertadas: " + (corretas * 100 / 15) + "%");
        }
    }
}