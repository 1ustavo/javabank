public class Main {
    public static void main(String[] args) {


//        try (var conn = Conexao.getConnection()) {
//            System.out.println("✅ Conectado ao PostgreSQL!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    Cadastro c = new Cadastro();
    c.inserirPessoa("Gustavo", "gusta@gmail.com");
    }
}