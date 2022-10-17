public class Main {
	public static void main(String[] args) {
		Mahasiswa mahasiswa1 = new MahasiswaSi("Ucup");
		Mahasiswa mahasiswa2 = new MahasiswaTi("Otong");
		mahasiswa1.display();
		mahasiswa2.display();

		// Polymorphic
		Mahasiswa mahasiswa3 = new MahasiswaElektro("Maria");
		mahasiswa3.display();

		MahasiswaElektro Mahasiswa4 = new MahasiswaElektro("Mahmud");
		Mahasiswa4.display();
		Mahasiswa4.showoff();
		

		// Array list
		Mahasiswa[] kumpulanMahasiswa = new Mahasiswa[4];
		kumpulanMahasiswa[0] = mahasiswa1;
		kumpulanMahasiswa[1] = mahasiswa2;
		kumpulanMahasiswa[2] = mahasiswa3;
		kumpulanMahasiswa[3] = Mahasiswa4; 

		kumpulanMahasiswa[0].display();
		kumpulanMahasiswa[1].display();
		kumpulanMahasiswa[2].display();

		
		Mahasiswa4.showoff();

		// aplikasi
		mahasiswa1.belajarbersama(mahasiswa2);
		mahasiswa1.belajarbersama(mahasiswa3);
		mahasiswa1.belajarbersama(Mahasiswa4);

	}
}
