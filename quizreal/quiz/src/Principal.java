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

        Questao q6 = new Questao();
        q6.pergunta ="6 - A crosta, o manto e o núcleo são camadas de qual planeta?: ";
        q6.opcaoA = "a - Marte.";
        q6.opcaoB = "b - Saturno";
        q6.opcaoC = "c - Sol";
        q6.opcaoD = "d - Terra";
        q6.opcaoE = "e - Mercúrio";
        q6.correta = "d";

        q6.escrevaQuestao();
        resposta = q6.leiaResposta();
        q6.isCorreta(resposta);

        Questao q7 = new Questao();
        q7.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q7.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q7.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q7.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q7.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q7.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q7.correta = "d";

        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        q7.isCorreta(resposta);

        Questao q8 = new Questao();
        q8.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q8.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q8.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q8.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q8.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q8.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q8.correta = "d";

        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        q8.isCorreta(resposta);

        Questao q9 = new Questao();
        q9.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q9.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q9.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q9.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q9.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q9.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q9.correta = "d";

        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        q9.isCorreta(resposta);

        Questao q10 = new Questao();
        q10.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q10.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q10.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q10.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q10.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q10.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q10.correta = "d";

        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        q10.isCorreta(resposta);

        Questao q11 = new Questao();
        q11.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q11.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q11.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q11.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q11.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q11.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q11.correta = "d";

        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        q11.isCorreta(resposta);

        Questao q12 = new Questao();
        q12.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q12.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q12.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q12.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q12.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q12.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q12.correta = "d";

        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        q12.isCorreta(resposta);

        Questao q13 = new Questao();
        q13.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q13.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q13.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q13.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q13.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q13.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q13.correta = "d";

        q13.escrevaQuestao();
        resposta = q13.leiaResposta();
        q13.isCorreta(resposta);

        Questao q14 = new Questao();
        q14.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q14.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q14.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q14.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q14.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q14.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q14.correta = "d";

        q14.escrevaQuestao();
        resposta = q14.leiaResposta();
        q14.isCorreta(resposta);

        Questao q15 = new Questao();
        q15.pergunta ="5 - Quais são os nomes corretos da fases da lua?: ";
        q15.opcaoA = "a - Nova, Crescente, Cheia e Mingua.";
        q15.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q15.opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        q15.opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        q15.opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        q15.correta = "d";

        q15.escrevaQuestao();
        resposta = q15.leiaResposta();
        q15.isCorreta(resposta);
    }
}
