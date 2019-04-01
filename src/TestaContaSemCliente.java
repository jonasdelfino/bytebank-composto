
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		//Outra forma de instanciar o Cliente em paralelo com a Conta
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
	}
}

		/* Criando objeto Cliente
		 * Cliente marcela = new Cliente();
			marcela.nome = "Marcela";
			marcela.cpf = "000.000.000-00";
			marcela.profissao = "Secretaria";
			contaDaMarcela.titular = marcela;
			*/