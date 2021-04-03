public class Colaborador extends Usuario{
  public String cargo_colaborador;

 Colaborador(String n, String l, int l_n, String c, String b, String cid, String uf, String tel, NumeroCadastro c_c, int numc_c, String cargo){
    super(n, l, l_n, c, b, cid, uf, tel, c_c, numc_c);
    cargo_colaborador = cargo;
  }
}