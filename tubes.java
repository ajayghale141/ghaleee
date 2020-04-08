import java.util.Scanner;
import java.util.ArrayList;
class tubes{
	int tiket;
	int loop=1;
	int harga = 30000;
	String kursi;
	String film;
	String jam;
	ArrayList<data> arrTiket = new ArrayList<>();
	Scanner inp = new Scanner(System.in);
	data db = new data(kursi, jam, film, harga);
	public static void main(String[] wasd){
		tubes tb = new tubes();
		tb.menu();
	}
	void menu(){
		do{
			System.out.println("\n"+db.getTanggal());
			System.out.println(db.getWaktu());
			System.out.println("\n\tXXI TICKET TRANSMART");
			System.out.println("\n\t[1] Suzzana: Bernafas Dalam Kubur");
			System.out.println("\t[2] Fantastic Beasts: The Crimes Of Grindelwald");
			System.out.println("\t[3] Bohemian Rhapsody");
			System.out.println("\t[4] A Man Called Ahok");
			System.out.print("\nPilih Film [1-4]	: ");
			int pilih = inp.nextInt();
			if(pilih >= 4){
				System.out.println("Pilihan Tidak Valid");
				loop=0;
			}
			else{
				switch(pilih){
					case 1:
					jamSuzzana();
					loop=0;
					break;
					case 2:
					jamFantasctic();
					loop=0;
					break;
					case 3:
					jamBohemian();
					loop=0;
					break;
					/*case 4:
					jamAhok();
					loop=0;
					break;*/
				}
			}
		}
		while(loop==0);
	}
	void jamSuzzana(){
		film f = new film();
		f.suzzana();
			System.out.println("\n\tPILIH JAM TAYANG	: ");
			System.out.println("\n\t[1] 11:30 AM");
			System.out.println("\t[2] 02:05 PM");
			System.out.println("\t[3] 04:40 PM");
			System.out.println("\t[4] 07:15 PM");
			System.out.println("\t[5] 09:50 PM");
			System.out.println("\t[6] Menu Utama");
			System.out.print("\nPilih Jam Tayang : ");
			int pilih = inp.nextInt();
			if(pilih >=5){
			System.out.println("Pilihan Tidak Valid");
			loop=0;
			}
			else{
				switch(pilih){
					case 1:
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 0;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "SUZANNA: BERNAFAS DALAM KUBUR";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
					case 2:
						System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
						boolean isFound=false;
							for (int a=0; a< arrTiket.size(); a++){
								if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
								}
							}
							if (!isFound){
								film = "SUZANNA: BERNAFAS DALAM KUBUR";
								jam = "11:30 PM";
								data db = new data(kursi, jam, film, harga);
								arrTiket.add(db);
								db.viewTiket();
							}
						x++;
						}
					break;
					}
					while(loop==0);
					case 3 :
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "SUZANNA: BERNAFAS DALAM KUBUR";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
					case 4 :
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "SUZANNA: BERNAFAS DALAM KUBUR";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
					case 5 :
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "SUZANNA: BERNAFAS DALAM KUBUR";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
				}
			}
		}
		
		void jamFantasctic(){
			film f = new film();
			f.fantastic();
			System.out.println("\n\tPILIH JAM TAYANG	: ");
			System.out.println("\n\t[1] 11:30 AM");
			System.out.println("\t[2] 02:05 PM");
			System.out.println("\t[3] 04:40 PM");
			System.out.println("\t[4] 07:15 PM");
			System.out.println("\t[5] 09:50 PM");
			System.out.println("\t[6] Menu Utama");
			System.out.print("\nPilih Jam Tayang : ");
			int pilih = inp.nextInt();
			if(pilih >=5){
			System.out.println("Pilihan Tidak Valid");
			loop=0;
			}
			else{
				switch(pilih){
					case 1:
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 0;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "FANTASTIC BEAST: THE CRIMES OF GRINDELWALD";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
					case 2:
						System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
						boolean isFound=false;
							for (int a=0; a< arrTiket.size(); a++){
								if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
								}
							}
							if (!isFound){
								film = "FANTASTIC BEAST: THE CRIMES OF GRINDELWALD";
								jam = "11:30 PM";
								data db = new data(kursi, jam, film, harga);
								arrTiket.add(db);
								db.viewTiket();
							}
						x++;
						}
					break;
					}
					while(loop==0);
					case 3 :
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "FANTASTIC BEAST: THE CRIMES OF GRINDELWALD";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
					case 4 :
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "FANTASTIC BEAST: THE CRIMES OF GRINDELWALD";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
					case 5 :
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "FANTASTIC BEAST: THE CRIMES OF GRINDELWALD";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
				}
			}
		}
		
		void jamBohemian(){
			film f = new film();
			f.bohemian();
			System.out.println("\n\tPILIH JAM TAYANG	: ");
			System.out.println("\n\t[1] 11:30 AM");
			System.out.println("\t[2] 02:05 PM");
			System.out.println("\t[3] 04:40 PM");
			System.out.println("\t[4] 07:15 PM");
			System.out.println("\t[5] 09:50 PM");
			System.out.println("\t[6] Menu Utama");
			System.out.print("\nPilih Jam Tayang : ");
			int pilih = inp.nextInt();
			if(pilih >=5){
			System.out.println("Pilihan Tidak Valid");
			loop=0;
			}
			else{
				switch(pilih){
					case 1:
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 0;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "BOHEMIAN RHAPSODY";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
					case 2:
						System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
						boolean isFound=false;
							for (int a=0; a< arrTiket.size(); a++){
								if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
								}
							}
							if (!isFound){
								film = "BOHEMIAN RHAPSODY";
								jam = "11:30 PM";
								data db = new data(kursi, jam, film, harga);
								arrTiket.add(db);
								db.viewTiket();
							}
						x++;
						}
					break;
					}
					while(loop==0);
					case 3 :
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "BOHEMIAN RHAPSODY";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
					case 4 :
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "BOHEMIAN RHAPSODY";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
					case 5 :
					System.out.print("Jumlah Tiket	: ");
					tiket = inp.nextInt();
					do{
						int x = 1;
						while(x<tiket){
						seat s = new seat();
						System.out.print("\nPilih Kursi		: ");
						kursi = inp.next();
							boolean isFound=false;
								for (int a=0; a< arrTiket.size(); a++){
									if (kursi.equals(arrTiket.get(a).getKursi())){
									System.out.println("\n\tKursi "+ kursi +" sudah digunakan");
									isFound=true;
									loop=0;
									}
								}
								if (!isFound){
									film = "BOHEMIAN RHAPSODY";
									jam = "11:30 PM";
									data db = new data(kursi, jam, film, harga);
									arrTiket.add(db);
									db.viewTiket();
								}
							x++;
						}
						break;
						}
						while(loop==0);
				}
			}
		}
	}