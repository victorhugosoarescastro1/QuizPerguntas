public class Principal {
    public static void main(String[] args) {
        Questao q1 = new Questao();

        q1.pergunta = "1- Qual o maior planeta do Sistema Solar?: ";
        q1.opcaoA = "a - Jupiter ";
        q1.opcaoB = "b - Marte";
        q1.opcaoC = "c - Mercúrio";
        q1.opcaoD = "d - Terra";
        q1.opcaoE = "e - Urano";
        q1.correta = "a";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);

        //proxima questao

        Questao q2 = new Questao();
        q2.pergunta = "2 - Quantos planetas existem no Sistema Solar?: ";
        q2.opcaoA = "a - 11";
        q2.opcaoB = "b - 12";
        q2.opcaoC = "c - 5";
        q2.opcaoD = "d - 7";
        q2.opcaoE = "e - 8";
        q2.correta = "e";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        q2.isCorreta(resposta);

        //proxima questao


        Questao q3 = new Questao();
        q3.pergunta = "3 - Qual a estrela presente no Sistema Solar?: ";
        q3.opcaoA = "a - Lua";
        q3.opcaoB = "b - Sol";
        q3.opcaoC = "c - Buraco Negro";
        q3.opcaoD = "d - Aurora Boreal";
        q3.opcaoE = "e - BON 67";
        q3.correta = "b";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        q3.isCorreta(resposta);

        //proxima questao


        Questao q4 = new Questao();
        q4.pergunta=" 4 - Quantas estrelas existem no Universo Observável?: ";
        q4.opcaoA = "a - 1 bilhão 600 milhoes 934 mil";
        q4.opcaoB = "b - 23 milhões e 500 mil ";
        q4.opcaoC = "c - 27 elevado a sétima pontência ";
        q4.opcaoD = "d - 498 milhões ";
        q4.opcaoE = "e - 7 × 10 elevado a 22";
        q4.correta = "e";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        q4.isCorreta(resposta);

        //proxima questao


        Questao q5 = new Questao();
        q5.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q5.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q5.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q5.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q5.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q5.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q5.correta = "d";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        q5.isCorreta(resposta);

    }
}
