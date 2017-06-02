//Hauria de ser saxo

func repe (base, basea, vel, tra, mul){
    for (aux = 0; aux < mul; ++aux) {
		Beat 4:4
		Speed n:vel
		Transport -tra
		Armor {#Sol3 #Fa3 #Re3 #Do3}
		Voice Organo | Sol.b Fall #La.n base | base Half La.b Sol.n Fa | Mi Raise $Mi Fa Twice Sol.c | if (aux = 0) { basea Fa.c Fa.b }
					 else { basea Twice Twice Twice Mi.sf Fall Half #Mi.r } |;
	}
}

func fin (){
	Beat 4:4
	Speed n:120
	Transport -6
	Armor {#Sol3 #Fa3 #Re3 #Do3}
	Voice Percusion | Mi.n Fa Si2.b | Sol.n Sol La Si | Si La Sol Fa | Mi Mi Fa Sol |;
	
}

func main() {

	nota = Si.n;
	notaa = Sol.n*;
	
	repe(nota, notaa, 120, 6, 2);

	Beat 4:4
	Speed n:120
	Transport -6
	Armor {#Sol3 #Fa3 #Re3 #Do3}
	Voice Guitarra |Fa.n Fa Sol Mi | 
	Voice Saxo |Fa.n Sol.c La Sol.n Mi | 
	Voice Trompa |Fa.n Sol.c La Sol.n Fa |;
	
	fin();
		
	Beat 4:4
	Speed n:120
	Transport -6
	Armor {#Sol3 #Fa3 #Re3 #Do3}
	Voice Shot | Fa.n* Mi.c Mi.b |;



}
