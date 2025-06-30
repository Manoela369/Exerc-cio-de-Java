public class Main{
    public static void main (String [] args){
        String nomeFilme = "Star Wars: o Império contra ataca";
        String sinopse = "Filme de ficção científica";
        int notaFilme = 10;

        System.out.printl("""
                Nome do Filme: %s
                Sinopse: %s
                Nota do filme: %d
                """.fomatted (nomeFilme,sinopse,notaFilme));
    }
}