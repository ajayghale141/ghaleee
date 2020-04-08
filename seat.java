class seat{
	String k;
	public seat(){
		kursi();
	}
	public void kursi(){
		System.out.println();
		for(int x=1; x<=9;x++){
			if(x==1){
				k = "A";
			}
			if(x==2){
				k = "B";
			}
			if(x==3){
				k = "C";
			}
			if(x==4){
				k="D";
			}
			if(x==5){
				k="E";
			}
			if(x==6){
				k="F";
			}
			if(x==7){
				k="G";
			}
			for(int y=1;y<=7;y++){
				if(x<=7){
					if(y==4){
					System.out.print("  |");
					}
					else{
					System.out.print(k+y+"|");
					}
				}
				else if(x==8){
					System.out.print(" ");
				}
				else if(x==9){
					System.out.print("===");
				}
			}
		System.out.println("");
	}
	
}
}