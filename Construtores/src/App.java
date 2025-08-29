public class App {
    public static void main(String[] args) {
        Aluno a = new Aluno(
            "Júlia",
            "2025.13.info",
            "123456789", 
            "89994129138"
            );
        Aluno b = new Aluno(
            "Luísa", 
            "2025.24.info",
            "123456787652",
            "123454322"
            );
        a.apresentar();
        b.apresentar();
    }
}
