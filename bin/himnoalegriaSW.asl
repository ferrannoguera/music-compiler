//Hauria de ser saxo

func repe (base, basea, vel, tra, mul){
	aux = 0;
	while(aux<mul){
		Beat 4:4
		Speed n:vel
		Transport tra
		Armor {#Sol3 #Fa3 #Re3 #Do3}
		Voice Piano | Sol.b Fall #La.n base | base Half La.b Sol.n Fa | Mi Raise $Mi Fa Twice Sol.c | if (aux = 0) { basea Fa.c Fa.b }
					 else { basea Twice Twice Twice Mi.sf Fall Half #Mi.r } |;
		aux = aux +1;
	}
}

func fin (){
	Beat 4:4
	Speed n:120
	Transport 7
	Armor {#Sol3 #Fa3 #Re3 #Do3}
	Voice Piano | Mi.n Fa Si2.b | Sol.n Sol La Si | Si La Sol Fa | Mi Mi Fa Sol |;
	
}

func main() {

	nota = Si.n;
	notaa = Sol.n*;
	
	repe(nota, notaa, 120, 7, 2);

	Beat 4:4
	Speed n:120
	Transport 7
	Armor {#Sol3 #Fa3 #Re3 #Do3}
	Voice Piano |Fa.n Fa Sol Mi | 
	Voice Piano |Fa.n Sol.c La Sol.n Mi | 
	Voice Piano |Fa.n Sol.c La Sol.n Fa |;
	
	fin();
		
	Beat 4:4
	Speed n:120
	Transport 7
	Armor {#Sol3 #Fa3 #Re3 #Do3}
	Voice Piano | Fa.n* Mi.c Mi.b |;



}
