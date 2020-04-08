import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;
class data{
	int harga;
	String jam;
	String film;
	String kursi;
	public data(String kursi, String jam, String film, int harga){
		this.harga=harga;
		this.kursi=kursi;
		this.jam=jam;
		this.film=film;
	}
	public void setFilm(){
		this.film=film;
	}
	public void setJam(){
		this.jam=jam;
	}
	public void setKursi(){
		this.kursi=kursi;
	}
	public void setHarga(){
		this.harga=harga;
	}
	public String getFilm(){
		return film;
	}
	public String getJam(){
		return jam;
	}
	public String getKursi(){
		return kursi;
	}
	public int getHarga(){
		return harga;
	}
	public void viewTiket(){
		System.out.println("\n=======================================");
		System.out.println("   TICKET XXI");
		System.out.println("\n\tJam Tayang: "+getJam());
		System.out.println("\t"+getFilm());
		System.out.println("\tSeat	:"+getKursi());
		System.out.println("\tRp."+getHarga());
		System.out.println("\n   Enjoy..");
		System.out.println("=======================================");
	}
	public String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
     
    public String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 
}