package model;

 

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private Cidade cidade;
    private Estado estado;

    public Endereco() {
    }

   public Endereco(String logradouro, int numero, String complemento, String cep) {
      this.logradouro = logradouro;
      this.numero = numero;
      this.complemento = complemento;
      this.cep = cep;
      
   }

   public String getLogradouro() {
      return logradouro;
   }

   public Endereco setLogradouro(String logradouro) {
      this.logradouro = logradouro;
      return this;
   }

   public int getNumero() {
      return numero;
   }

   public Endereco setNumero(int numero) {
      this.numero = numero;
      return this;
   }

   public String getComplemento() {
      return complemento;
   }

   public Endereco setComplemento(String complemento) {
      this.complemento = complemento;
      return this;
   }

   public String getCep() {
      return cep;
   }

   public Endereco setCep(String cep) {
      this.cep = cep;
      return this;
   }

   public Cidade getCidade() {
      return cidade;
   }

   public Endereco setCidade(Cidade cidade) {
      this.cidade = cidade;
      return this;
   }

   public Estado getEstado() {
      return estado;
   }

   public Endereco setEstado(Estado estado) {
      this.estado = estado;
      return this;
   }
}