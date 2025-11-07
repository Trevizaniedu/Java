package tamagoshi;

public class Animal {

	private String nome;
	private int energia;
	private int saude;
	private int felicidade;
	private int higiene;

	public Animal(String nome) {
		this.nome = nome;
		this.energia = 100;
		this.felicidade = 100;
		this.saude = 100;
		this.higiene = 100;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public int getenergia() {
		return energia;
	}

	public void setenergia(int energia) {
		this.energia = energia;
	}

	public int getsaude() {
		return saude;
	}

	public void setsaude(int saude) {
		this.saude = saude;
	}

	public int getfelicidade() {
		return felicidade;
	}

	public void setfelicidade(int felicidade) {
		this.felicidade = felicidade;
	}

	public int gethigiene() {
		return higiene;
	}

	public void sethigiene(int higiene) {
		this.higiene = higiene;
	}

	public void brincar() {
		setfelicidade(felicidade + 10);
		setenergia(energia - 5);
		sethigiene(higiene - 5);
		System.out.println("brincou e está feliz");
	}

	public void comer() {
		setsaude(saude + 10);
		setenergia(energia + 10);
		System.out.println(nome + " está alimentado");
	}

	public void limpar() {
		sethigiene(100);
		sethigiene(higiene + 10);
		System.out.println(nome + " tomou banho e está limpo");
	}

	public void dormir() {
		setenergia(100);
		setenergia(energia + 20);
		System.out.println(nome + " dormiu e está descansado");

	}

	public void mostrasituação() {
		System.out.println("Energia: " + energia);
		System.out.println("Saúde: " + saude);
		System.out.println("Felicidade: " + felicidade);
		System.out.println("Higiene: " + higiene);

	}
}
