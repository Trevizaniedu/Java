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
		if (energia > 100) {
			this.energia = 100;
		} else if (energia < 0) {
			this.energia = 0;
		} else {
			this.energia = energia;
		}
	}

	public int getsaude() {
		return saude;
	}

	public void setsaude(int saude) {
		if (saude > 100) {
			this.saude = 100;
		} else if (saude < 0) {
			this.saude = 0;
		} else {
			this.saude = saude;
		}
	}

	public int getfelicidade() {
		return felicidade;
	}

	public void setfelicidade(int felicidade) {
		if (felicidade > 100) {
			this.felicidade = 100;
		} else if (felicidade < 0) {
			this.felicidade = 0;
		} else {
			this.felicidade = felicidade;
		}
	}

	public int gethigiene() {
		return higiene;
	}

	public void sethigiene(int higiene) {
		if (higiene > 100) {
			this.higiene = 100;
		} else if (higiene < 0) {
			this.higiene = 0;
		} else {
			this.higiene = higiene;
		}
	}

	public void brincar() {
		setfelicidade(felicidade + 10);
		setenergia(energia - 5);
		sethigiene(higiene - 5);
		System.out.println(nome + " brincou e está feliz!");
	}

	public void comer() {
		setsaude(saude + 10);
		setenergia(energia + 10);
		System.out.println(nome + " está alimentado!");
	}

	public void limpar() {
		sethigiene(higiene + 10);
		System.out.println(nome + " tomou banho e está limpo!");
	}

	public void dormir() {
		setenergia(energia + 20);
		System.out.println(nome + " dormiu e está descansado!");
	}

	public void mostrasituação() {
		System.out.println("------ SITUAÇÃO DE " + nome.toUpperCase() + " ------");
		System.out.println("Energia: " + energia);
		System.out.println("Saúde: " + saude);
		System.out.println("Felicidade: " + felicidade);
		System.out.println("Higiene: " + higiene);
		System.out.println("----------------------------------");
	}
}
