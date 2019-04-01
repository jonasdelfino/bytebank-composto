
public class TestaBanco {

	public static void main(String[] args) {
		Cliente jonas = new Cliente();
		
		jonas.nome = "Jonas Delfino";
		jonas.cpf = "999.999.999-99";
		jonas.profissao = "Estagiário";
		
		Conta contaDoJonas = new Conta();
		contaDoJonas.deposita(100);
		System.out.println();
		
		contaDoJonas.titular = jonas;
		System.out.println(contaDoJonas.titular.nome);
		
	}
}
