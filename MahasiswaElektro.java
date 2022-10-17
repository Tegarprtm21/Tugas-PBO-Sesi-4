public class MahasiswaElektro extends Mahasiswa{
	String type = "Elektro";

	MahasiswaElektro(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}

	void showoff(){
		System.out.println("Saya Mahasiswa Elektro!!");
	}
}
