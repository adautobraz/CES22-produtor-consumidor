
public class Principal {
	
	public static void main (String args[]){
		Buffer buffer = new Buffer();
		String arquivo = "C:/CTC-20/table 8.txt";
		Produtor prod = new Produtor(arquivo, buffer,"Três");
		Consumidor consum1, consum2;
		consum1 = new Consumidor(buffer,"Um");
		consum2 = new Consumidor(buffer,"Dois");
		prod.start();
		consum1.start();
		consum2.start();		
		
	}

}
