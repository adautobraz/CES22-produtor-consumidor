
public class Consumidor extends Thread{
	Buffer b;
	String nome;
	
	public void run(){
		char x;
		System.out.println("Consumidor: " + nome + "procura tais itens: ");
		try {
			while ((x = b.get()) != '\032')
				System.out.print(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Consumidor (Buffer b, String name){
		this.nome = name;
		this.b = b;
	}
}

