//Moonriver a Flauta

func repeat(tempo) {
   Beat 3:4
   Speed n:tempo

   Voice Flauta | Si.n* La.c Sol.c Fa.c | Sol.b Do.n | Si.n* La.c Sol.c Fa.c 
                | Sol.b Do.n | Re.b*~ |;
   
}


func main() {
    
   yeray = Sol.b*;
   
   ferran = Mi;
    
   Beat 4:4
   Speed n:120
   
   Armor {$La3 $Si3 $Mi4 $La1 $Si1 $Mi2}

	Voice Piano | Quiet.n [(Si4, Sol4).n Si.c] [(¬La4, #Fa4).n Si3.c] ($La4, ¬Fa4).n 
		| (Sol4, Mi4).n~ [(Sol4, Mi4).n Mi4.c~] [Mi4.n Fa4.c] Sol4.n 
		| (Fa4, Do4).n~ [(Fa4, Do4).n (Do4, ¬La3, $Sol3, Fa3).c~] (Do4, ¬La3, $Sol3, Fa3).b 
		| Quiet.n [(Mi4, Do4).n $Sol3.c] [(Mi4, Do4, Sol3).n Fa4.c] (Mi4, Do4).n
		| (Sol4, Si3).n~ [(Sol4, Si3).n (Si3, Sol3).c~] [(Si3, Sol3).n Do4.c] [(Si3, Sol3).c Do4.c Mi4.c] 
		| (Fa4, Do4, La3).n [($Sol4, La3).n Fa4.c] [(Sol4, Do4, La3).n Fa4.c] (Mi4, La3).n 
		| (Mi4, Si3, Sol3).n [(Sol4, Re4).c Do4.c Si3.c] [Sol3.n Fa3.c] Mi3.n 
		| [La4.f ¬La.sc* Fa4.c Do4.c] [La3.f ¬La3.sc*~ La3.c La3.c] Si3.c* Si3.sc Do4.c* Do4.sc
		|  (Re4, La3).n [Do4.n (Si3, Re3).c~] (Si3, Re3).b| [¬La3.c Fa3.c La3.c] [Si3.c Sol4.c Si3.c] [¬Si3.c La4.c Si3.c] [Do4.c ¬La4.c Do4.c]
		| (Si4, Re4).n (Si3, Mi3).n (Si3, ¬Mi3).n (Si3, Fa3).n | [(Sol4, Sol3).c (Si4, Si3).c (Si4, Si3).c] (Si4, Si3).b [(Do5, Do4).n (Si4, Si3).c] 
		| (Sol4, Sol3).n (Si4, Si3).b* | [(Sol4, Sol3).c (Si4, Si3).c (Si4, Si3).c] (Si4, Si3).b [(Do5, Do4).n (Si4, Si3).c] 
		| (Sol4, Sol3).n Si3.n ¬La3.n #Sol3.n | [(Sol4, Sol3).c (Si4, Si3).c (Si4, Si3).c] (Si4, Si3).b [(Do5, Do4).n (Si4, Si3).c] 
		| (Sol4, Sol3).n (Si4, Si3).b* | [(Sol4, Sol3).c (Si4, Si3).c (Si4, Si3).c] (Si4, Si3).b [(Do5, Do4).n (Si4, Si3).c] 
		|(Sol4, Sol3).n (Mi4, Mi3).n Re3.n $Re3.n | Do4.c* Re4.sc Mi4.c* Re4.sc $Sol4.sc Fa4.sc Mi4.c~ Mi4.n 
		| [($Sol4, Si3).c Fa4.c Mi4.c] [Fa4.c Mi4.c Re4.c] (Si3, Re3).n Quiet.n | 2z||: Si4.c* Sol4.sc Fa4.c* Mi4.sc Do4.c* Re4.sc Mi4.n 
		|  Si4.c* Sol4.sc Fa4.c* Mi4.sc Do4.c* Mi4.sc Si4.n | Do4.c* Mi4.sc Si3.n Do4.c* Re4.sc Mi4.c* La4.sc 
		| Sol4.c* Sol4.sc Fa4.c* Mi4.sc Fa4.b | Si4.c* Sol4.sc Fa4.c* Mi4.sc Do4.c* Re4.sc Mi4.n | Si4.c* Sol4.sc Fa4.c* Mi4.sc Do4.c* Mi4.sc Si3.n 
		| if (Time = 1) { Do4.c* Mi4.sc Si3.n Do4.c* Re4.sc Mi4.c* La4.sc } else{ Do4.c* Mi4.sc Si3.c* Si3.sc Do4.c* Re4.sc Mi4.c* La4.sc} 
		| if (Time = 1) { Sol4.c* Mi4.sc Fa4.c* Re4.sc Mi4.b } else { Sol4.c* Mi4.sc Fa4.c* Re4.sc Mi4.b } :|| 
		Quiet.n [(Mi4, Do4).n $Sol3.c] [(Mi4, Do4).n Fa4.c] (Mi4, Do4).n 
		| (Sol4, Si3).n~ [(Sol4, Si3).n (Si3, Sol3).c~] [(Si3, Sol3).n Do4.c] [(Si3, Sol3).c Do4.c Mi4.c] 
		| (Fa4, Do4, La3).n [($Sol4, La3).n Fa4.c] [(Sol4, Do4, La3).n Fa4.c] (Mi4, La3).n 
		| (Mi4, Si3, Sol3).n [(Sol4, Re4).c Do4.c Si4.c] [Sol3.n Fa3.c] Mi3.n 
		| [La4.f ¬La4.sc* Fa4.c Do4.c] [La3.f ¬La3.sc*~ La3.c La3.c] Si3.c* Si3.sc Do4.c* Do4.sc 
		| (Re4, La3).n [Do4.n (Si3, Re3).c~] (Si3, Re3).b | [¬La3.c Fa4.c La3.c] [Si3.c Sol4.c Si3.c] [¬Si3.c La4.c Si3.c] [Do4.c ¬La4.c Do4.c] 
		| (Si4, Re4).n (Si3, Mi3).n (Si3, ¬Mi3).n (Si3, Fa3).n |;
   
}
