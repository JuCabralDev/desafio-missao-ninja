package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeialowecase = aldeia.toLowerCase(); // ToLowerCase vai colocar tudo em caixa baixa/minusculo
        System.out.println(aldeialowecase);

    }
}
