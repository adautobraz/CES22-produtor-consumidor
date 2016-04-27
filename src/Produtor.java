import java.io.FileInputStream;

public class Produtor extends Thread {
	Buffer b;
	FileInputStream fs;
	public void run (){
		int x;
		try{
			while ((x=fs.read()) != -1)
				b.put((char) x );
			b.put('\032');
		}catch (Exception e){
			System.err.println("Não pude ler");
			System.exit(1);
		}
	}
	
	Produtor(String fname, Buffer b){
		this.b = b;
		try{
			fs = new FileInputStream(fname);
		}catch (Exception e){
			fs = null;
			System.err.println("Não pude abrir " + fname);
			System.exit(1);
		}
	}
}
