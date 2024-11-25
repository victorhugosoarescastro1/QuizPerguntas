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
        q7.pergunta ="7 - Qual o nome dado à morte de uma estrela? ";
        q7.opcaoA = "a - Morte Nuclear";
        q7.opcaoB = "b - Explosão Vermelha";
        q7.opcaoC = "c - SuperNova";
        q7.opcaoD = "d - Império";
        q7.opcaoE = "e - HiperEstrela";
        q7.correta = "c";

        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        q7.isCorreta(resposta);

        Questao q8 = new Questao();
        q8.pergunta ="8 - Qual é o nome da primeira missão de viagem a Lua? ";
        q8.opcaoA = "a - Apollo 11.";
        q8.opcaoB = "b - Operação Espacial.";
        q8.opcaoC = "c - Corrida Armamentista.";
        q8.opcaoD = "d - Apolo 73.";
        q8.opcaoE = "e - Novo Horizonte.";
        q8.correta = "a";

        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        q8.isCorreta(resposta);

        Questao q9 = new Questao();
        q9.pergunta ="9 - Qual foi o primeiro Homem a pisar na Lua?: ";
        q9.opcaoA = "a - Michael Collins.";
        q9.opcaoB = "b - Sérgio Sacani.";
        q9.opcaoC = "c - Vinicius Júnior";
        q9.opcaoD = "d - Edwin 'Buzz' Aldrin.";
        q9.opcaoE = "e - Neil Armstrong.";
        q9.correta = "e";

        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        q9.isCorreta(resposta);

        Questao q10 = new Questao();
        q10.pergunta ="10 - Qual a principal composição de um cometa??: ";
        q10.opcaoA = "a - Poeira cósmica, enxofre, calcário, cálcio e metais sedimentar.";
        q10.opcaoB = "b - Hidrogênio, hélio, metais sólidos e ozônio.";
        q10.opcaoC = "c - Rochas, ouro, silício e gelo.";
        q10.opcaoD = "d - Gelo, poeira cósmica, fragmentos rochosos e compostos orgânicos.";
        q10.opcaoE = "e - Poeira cósmica, enxofre e metais líquidos.";
        q10.correta = "d";

        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        q10.isCorreta(resposta);

        Questao q11 = new Questao();
        q11.pergunta ="11 - Quais destes planetas do sistema solar podem ter chuvas de diamantes?: ";
        q11.opcaoA = "a - Vênus, Marte, Júpiter e Urano.";
        q11.opcaoB = "b - Júpiter, Saturno, Urano e Netuno.";
        q11.opcaoC = "c - Mercúrio e Vênus.";
        q11.opcaoD = "d - Netuno e Marte.";
        q11.opcaoE = "e - Urano, Neturno, Jupiter.";
        q11.correta = "b";

        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        q11.isCorreta(resposta);

        Questao q12 = new Questao();
        q12.pergunta ="12 - Quais os fatores que influenciam para que os planetas sejam redondos?: ";
        q12.opcaoA = "a - Composição do planeta e a força da gravidade";
        q12.opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        q12.opcaoC = "c - Período de rotação do planeta e vácuo.";
        q12.opcaoD = "d - Órbita de translação e sedimentar do planeta";
        q12.opcaoE = "e - Força da atração da gravidade e massa do planeta";
        q12.correta = "e";

        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        q12.isCorreta(resposta);

        Questao q13 = new Questao();
        q13.pergunta ="13 - O Sol é?: ";
        q13.opcaoA = "a - Estrela velha.";
        q13.opcaoB = "b - Estrela de meia idade.";
        q13.opcaoC = "c - Estrela Nova.";
        q13.opcaoD = "d - Foto Estrela.";
        q13.opcaoE = "e - HiperNova.";
        q13.correta = "b";

        q13.escrevaQuestao();
        resposta = q13.leiaResposta();
        q13.isCorreta(resposta);

        Questao q14 = new Questao();
        q14.pergunta ="14 - Qual é a velocidade da luz, aproximadamente?: ";
        q14.opcaoA = "a - 500.000 km/s.";
        q14.opcaoB = "b - 300.000 km/s.";
        q14.opcaoC = "c - 500.000 km/h.";
        q14.opcaoD = "d - 1.000.000 km/h.";
        q14.opcaoE = "e - N/D.";
        q14.correta = "b";

        q14.escrevaQuestao();
        resposta = q14.leiaResposta();
        q14.isCorreta(resposta);

        Questao q15 = new Questao();
        q15.pergunta ="15 - Qual é a maior estrela já encotrada, em tamanho?: ";
        q15.opcaoA = "a - LBV 1806-20 (Sagitário).";
        q15.opcaoB = "b - R136a1 (Nebulosa da Tarântula).";
        q15.opcaoC = "c - VY Canis Majoris (Cão Maior).";
        q15.opcaoD = "d - Antares (Escorpião).";
        q15.opcaoE = "e - Sol.";
        q15.correta = "c";

        q15.escrevaQuestao();
        resposta = q15.leiaResposta();
        q15.isCorreta(resposta);
    }
}
