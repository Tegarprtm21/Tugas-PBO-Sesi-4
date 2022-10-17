public class MahasiswaTi extends Mahasiswa{
	String type = "Ti";

	MahasiswaTi(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}
}

