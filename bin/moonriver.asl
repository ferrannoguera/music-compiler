//Moonriver a Flauta

func repeat() {
   Beat 3:4
   Speed n:120

   Voice Flauta | Si.n* La.c Sol.c Fa.c | Sol.b Do.n | Si.n* La.c Sol.c Fa.c 
                | Sol.b Do.n | Re.b*~ | Re.b Mi.n | Do.b* |;
   
}


func main() {
   Beat 3:4
   Speed n:120
   
   Voice Flauta | Sol.b* | Re4.n Do4.b |;
   
   repeat();
   
   Beat 3:4
   Speed n:120
   Voice Flauta | Sol.n Mi.n* Re.c | Do.b* | Sol.n Mi.n* Re.c | Do.n Mi.n Sol.n | 
                Do4.n Si.n* La.c | Si.n La.n* Sol.c | La.b* | Sol.b* | Re4.n Do4.b |; 
                
   repeat();
   
   Beat 3:4
   Speed n:120         
   Voice Flauta | Mi.b Sol.n | Do4.b* | Re.b Do.n | Sol.b Do.n | Si.n* La.c Sol.c Fa.c 
                | Sol.b Do.n | Si.n* La.c Sol.c Fa.c | Sol.b* | Do.b* | Fa.n Re.b~ 
                | Re.b Mi.n | Do.b* |;
   
}
