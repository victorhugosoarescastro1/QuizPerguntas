public class Principal {
    public static void main(String[] args) {
        Questao q1 = new Questao();
        q1.pergunta="1- Qual a Indepência do Brasil?";
        q1.opcaoA="a - 1500";
        q1.opcaoB="b - 1709";
        q1.opcaoC="c - 1302";
        q1.opcaoD="d - ";
        q1.opcaoE="e - 18";
        q1.correta="e";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);

        //proxima questao


        Questao q2 = new Questao();
        q2.pergunta="1-quantos planetas existem no sistema solar?";
        q2.opcaoA="a - 11";
        q2.opcaoB="b - 12";
        q2.opcaoC="c - 5";
        q2.opcaoD="d - 7";
        q2.opcaoE="e - 8";
        q2.correta="e";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        q2.isCorreta(resposta);

        //proxima questao


        Questao q3 = new Questao();
        q3.pergunta="1-quem descobriu o brasil?";
        q3.opcaoA="a - pedro alvares cabral";
        q3.opcaoB="b - jair messias bolsonaro";
        q3.opcaoC="c - jucelino kubtchek";
        q3.opcaoD="d - donald trump";
        q3.opcaoE="e - bob chartlon";
        q3.correta="a";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        q3.isCorreta(resposta);

        //proxima questao


        Questao q4 = new Questao();
        q4.pergunta="1-quantas estrelas existem no universo observável?";
        q4.opcaoA="a - 1 bilhao 600 milhoes 934 mil";
        q4.opcaoB="b - 23 milhoes e 500 mil ";
        q4.opcaoC="c - 27 elevado a setima pontencia ";
        q4.opcaoD="d - 498 milhoes ";
        q4.opcaoE="e - 7 × 10 elevado a 22";
        q4.correta="e";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        q4.isCorreta(resposta);

        //proxima questao


        Questao q5 = new Questao();
        q5.pergunta="1-quando aconteceu o atentado de 11 de setembro  ?";
        q5.opcaoA="a - 14 de novembro";
        q5.opcaoB="b - 11 de janeiro ";
        q5.opcaoC="c - 32 de setembro  ";
        q5.opcaoD="d - 11 de setembro ";
        q5.opcaoE="e - ontem";
        q5.correta="d";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        q5.isCorreta(resposta);

    }
}
