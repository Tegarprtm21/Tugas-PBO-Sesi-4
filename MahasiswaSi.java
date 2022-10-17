public class MahasiswaSi extends Mahasiswa{
	String type = "Si";

	MahasiswaSi(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}
}