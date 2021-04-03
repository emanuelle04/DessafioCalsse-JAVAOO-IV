class Main {
     
  public static void main(String[] args) {
    int contador = 0;

    Associado associado0 = new Associado("Teste Nome Associado", "Rua dos Associados",1000,"50890-300","Asses","Nossa Senhora da Associação","AS", "98888-9800", NumeroCadastro.CPF, 1928837262, "Ativo", 1);
    contador++;
    associado0.id = associado0.addId(contador);

    Colaborador colaborador01 = new Colaborador("Teste Nome Colaborador", "Rua dos Colaboradores", 200 ,"50890-400","Asses","Nossa Senhora da Colaboração","CB", "98888-9811", NumeroCadastro.CNPJ, 19826, "CEO");
    contador++;
    colaborador01.id = colaborador01.addId(contador);
    System.out.println(associado0.id);
    System.out.println(colaborador01.id);
  }
}