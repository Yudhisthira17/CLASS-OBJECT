
public class main {

	
	public static void main(String[] args) {
		kotak kotakHitam = new kotak();
		
		kotakHitam.setPanjang(20);
		kotakHitam.setLebar(10);
		
		kotakHitam.hitungLuas();
		kotakHitam.hitungKeliling();
	
		System.out.println("Panjang : " + kotakHitam.getPanjang());
		System.out.println("Lebar : " + kotakHitam.getLebar());
		System.out.println("LuasKotak : " + kotakHitam.getLuas());
		System.out.println("KelilingKotak " + kotakHitam.getKeliling());
		System.out.println("___________________________________________");
				
		{
			//Hasil Mahasiswa
			mahasiswa mhs1 = new mahasiswa();
			mhs1.setNama("Yudhisthira");
			mhs1.setNim("D0217501");
			mhs1.setAlamat("Tapalang");
			mhs1.setGolonganDarah("B");
			mhs1.setStatus("Mahasiswa");
			mhs1.setTinggiBadan(162);
			mhs1.setBeratBadan(52);
			
			System.out.println("Nama : " + mhs1.getNama());
			System.out.println("Nim : " + mhs1.getNim());
			System.out.println("Alamat : " + mhs1.getAlamat());
			System.out.println("GolonganDarah : " + mhs1.getGolonganDarah());
			System.out.println("Status : " + mhs1.getStatus());
			System.out.println("TinggiBadan : " + mhs1.getTinggiBadan());
			System.out.println("BeratBadan : " + mhs1.getBaratBadan());
			System.out.println("---------------------------------------------");

			System.out.println("------Object Kelas node------");
			//membuat object darikelas node
			node node = new node();
			
			//method setter node
			node.label = "pramuka";
			node.Value = 1;
			
			//method getter node
			System.out.println("Nama Label : " + node.getlabel());
			System.out.println("jumlah label : " + node.getValue());
			
			
			//membuat object darikelas stack
			stack stack = new stack();
			System.out.println("------Object Kelas stack------");
			stack.value[0] = "yudhisthira";
			stack.value[1] = "yudhis";
			stack.value[2]= "thira";
			stack.value[4]= "yudhi";
			stack.value[5]= "yudhi";
			stack.value[6]= "yudhi";
			stack.value[7]= "yudhi";
			stack.value[8]= "yudhi";
			stack.value[9]= "yudhi";
			stack.value[10]= "yudhi";
			stack.value[11]= "yudhi";
			stack.value[12]= "yudhi";
			stack.value[13]= "yudhi";
			stack.value[14]= "thira";
			stack.value[15]= "yudhi";
			stack.value[16]= "yudhi";
			stack.value[17]= "yudhi";
			stack.value[18]= "yudhi";
			stack.value[19]= "yudhi";
			stack.value[20]= "yudhi";
			stack.value[21]= "yudhi";
			stack.value[22]= "yudhi";
			stack.value[23]= "yudhi";
			stack.value[24]= "yudhi";
			stack.value[25]= "yudhi";
			stack.value[26]= "yudhi";
			stack.value[27]= "yudhi";
			stack.value[28]= "yudhi";
			stack.value[29]= "yudhi";
			stack.value[30]= "yudhi";
			stack.value[31]= "yudhi";
			stack.value[32]= "yudhi";
			stack.value[33]= "yudhi";
			stack.value[34]= "yudhi";
			stack.value[35]= "yudhi";
			stack.value[36]= "yudhi";
			stack.value[37]= "yudhi";
			stack.value[38]= "yudhi";
			stack.value[39]= "yudhi";
			stack.value[40]= "yudhi";
			stack.value[41]= "yudhi";
			stack.value[42]= "yudhi";
			stack.value[43]= "yudhi";
			stack.value[44]= "yudhi";
			stack.value[45]= "yudhi";
			stack.value[46]= "yudhi";
			stack.value[47]= "yudhi";
			stack.value[48]= "yudhi";
			stack.value[49]= "yudhi";
			stack.value[50]= "yudhi";
			stack.value[51]= "yudhi";
			stack.value[52]= "yudhi";
			stack.value[53]= "yudhi";
			stack.value[54]= "yudhi";
			stack.value[55]= "yudhi";
			stack.value[56]= "yudhi";
			stack.value[57]= "yudhi";
			stack.value[58] = "yudhi";
			stack.value[59]= "yudhi";
			stack.value[60]= "yudhi";
			stack.value[61]= "yudhi";
			stack.value[62]= "yudhi";
			stack.value[63]= "yudhi";
			stack.value[64]= "yudhi";
			stack.value[65]= "yudhi";
			stack.value[66]= "yudhi";
			stack.value[67]= "yudhi";
			stack.value[68]= "yudhi";
			stack.value[69]= "yudhi";
			stack.value[70]= "yudhi";
			stack.value[71]= "yudhi";
			stack.value[72]= "yudhi";
			stack.value[73]= "yudhi";
			stack.value[74]= "yudhi";
			stack.value[75]= "yudhi";
			stack.value[76]= "yudhi";
			stack.value[77]= "yudhi";
			stack.value[78]= "yudhi";
			stack.value[79]= "yudhi";
			stack.value[80]= "yudhi";
			stack.value[81]= "yudhi";
			stack.value[82]= "yudhi";
			stack.value[83]= "yudhi";
			stack.value[84]= "yudhi";
			stack.value[85]= "yudhi";
			stack.value[86]= "yudhi";
			stack.value[87]= "yudhi";
			stack.value[88]= "yudhi";
			stack.value[89]= "yudhi";
			stack.value[90]= "yudhi";
			stack.value[91]= "yudhi";
			stack.value[92]= "yudhi";
			stack.value[93]= "yudhi";
			stack.value[94]= "yudhi";
			stack.value[95]= "yudhi";
			stack.value[96]= "yudhi";
			stack.value[97]= "yudhi";
			stack.value[98]= "yudhi";
			stack.value[99]= "yudhi";
			
			
			for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};


		}

	}
}
