package CodProjet;
import java.time.LocalDate;
import java.util.Scanner;

public class Cadastro1 {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private int id;
    private String senha;
    private String rua;
    private String bairro;
    private String estado;
    private int numero;
    private String cep;
    private String cargo;

    public Cadastro1 (String nome, String cpf, LocalDate dataNascimento, int id, String senha, String rua, String bairro,
                    String estado, int numero, String cep, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.id = id;
        this.senha = senha;
        this.rua = rua;
        this.bairro = bairro;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
        this.cargo = cargo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Data de Nascimento (formato: yyyy-mm-dd): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

        System.out.print("ID: ");
        int id = scanner.nextInt();

        System.out.print("Senha: ");
        String senha = scanner.next();

        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        Cadastro1 cadastro = new Cadastro1(nome, cpf, dataNascimento, id, senha, rua, bairro, estado, numero, cep, cargo);

        // Exemplo de exibição dos dados cadastrados
        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + cadastro.getNome());
        System.out.println("CPF: " + cadastro.getCpf());
        System.out.println("Data de Nascimento: " + cadastro.getDataNascimento());
        System.out.println("ID: " + cadastro.getId());
        System.out.println("Senha: " + cadastro.getSenha());
        System.out.println("Rua: " + cadastro.getRua());
        System.out.println("Bairro: " + cadastro.getBairro());
        System.out.println("Estado: " + cadastro.getEstado());
        System.out.println("Número: " + cadastro.getNumero());
        System.out.println("CEP: " + cadastro.getCep());
        System.out.println("Cargo: " + cadastro.getCargo());
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    static class nome {

        public nome() {
        }
    }

    static class cpf {

        public cpf() {
        }
    }
}