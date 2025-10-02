import java.sql.Connection;
import java.sql.PreparedStatement;

public class Cadastro {
    public void inserirPessoa(String nome, String email, String password) {
        String sql = "INSERT INTO public.pessoa (nome, email, password ) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.executeUpdate();

            System.out.println("Pessoa cadastrada!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}