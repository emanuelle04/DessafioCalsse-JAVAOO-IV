public class Usuario{
  public int id;
  private String nome;  
  private String logradouro; 
  private int l_numero; 
  private String cep; 
  private String bairro; 
  private String cidade; 
  private String estado; 
  private String telefone; 
  public NumeroCadastro cpf_cnpj; //Enum 
  private int numcpf_cnpj; 

  Usuario(String n, String l, int l_n, String c, String b, String cid, String uf, String tel, NumeroCadastro c_c, int numc_c ){
    setNome(n);
    setLogradouro(l);
    setLNumero(l_n);
    setCEP(c);
    setBairro(b);
    setCidade(cid);
    setEstado(uf);
    setTelefone(tel);
    cpf_cnpj = c_c;
    setNumCPF_CNPJ(numc_c);
  }
 public int addId(int contador){return contador++;}
 public void setId(int i) { id = i; }
 public void setNome(String n) { nome = n; }
 public void setLogradouro(String l) {logradouro = l; }
 public void setLNumero(int l_n) { l_numero = l_n; }
 public void setCEP(String c) { cep = c; }
 public void setBairro(String b) {bairro = b; }
 public void setCidade(String cid) { cidade = cid; }
 public void setEstado(String uf) {estado = uf; }
 public void setTelefone(String tel) {telefone = tel; }
 public void setNumCPF_CNPJ(int numc_c) {numcpf_cnpj= numc_c; }


 public int getId() { return id; }
 public String getNome() { return nome; }
 public String getLogradouro() { return logradouro; }
 public int getLNumero() { return l_numero; }
 public String getCEP() { return cep; }
 public String getBairro() { return bairro; }
 public String getCidade() { return cidade; }
 public String getEstado() { return estado; }
 public String getTelefone() { return telefone; }
 public NumeroCadastro getCPF_CNPJ(){return cpf_cnpj;}
 public int getNumCPF_CNPJ() { return numcpf_cnpj; }



}