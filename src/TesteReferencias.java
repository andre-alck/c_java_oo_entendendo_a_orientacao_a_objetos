
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira conta:\t" + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		segundaConta.saldo += 100;

		System.out.println("saldo da primeira conta:\t" + primeiraConta.saldo);
		System.out.println("saldo da segunda conta:\t" + segundaConta.saldo);

		System.out.println(primeiraConta == segundaConta);

	}
}
