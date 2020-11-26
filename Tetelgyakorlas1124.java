package tetelgyakorlas1124;
/*
1. Két tömböt hozzunk létre -100 és + 100 közötti értéktartományban. 
    Az elemek száma random legyen 10 és 20 között. írassuk ki egymás alá helyiérték szerint (figyelve az előjelekre is)!
    Tehát a számok szóközzel tagolva egymás mellé kerüljenek tömbönként.
2. Hozz létre egy negativSzamok nevű tömböt és tedd bele mindkét tömbből a negatív számokat!
3. Írassuk ki a negatívSzamok tömb elemeinek összegét, átlagát!
*/
public class Tetelgyakorlas1124 
{
    public static void main(String[] args) 
    {   
       int interval = (int) (Math.random()*10)+10;
       int tomb1 [] = new int [interval];
       int tomb2 [] = new int [interval];
       int negativ [] = new int [interval*2];
       
       for (int i = 0; i < interval; i++) 
       {
            tomb1[i] = (int) (Math.random()*200)-100;           
            tomb2[i] = (int) (Math.random()*200)-100;               
        }
       
       System.out.print("\nA tömb1 elemei:");
       
       boolean szerepel = false;
        for (int i = 0; i < interval; i++) 
        {
            if (tomb1[i] == 0) 
            {
                szerepel = true;
                break;
            }
        }
        System.out.print(szerepel + " ");
       for (int i = 0; i < interval; i++) 
       {
            System.out.print(String.format("%,4d", tomb1[i])+" ");
        }
       
       System.out.print("\nA tömb2 elemei:");
       
       for (int i = 0; i < interval; i++) 
        {
            if (tomb2[i] == 0) 
            {
                szerepel = true;
                break;
            }
        }
        System.out.print(szerepel + " ");
       
       for (int i = 0; i < interval; i++) 
       {
            System.out.print(String.format("%,4d", tomb2[i])+" ");
        }
       
       int negativelem = 0;
       
       for (int i = 0; i < interval; i++) 
       {
            if (tomb1[i]<0) 
            {
                negativ[negativelem++] = tomb1[i];
                
            }
            if (tomb2[i]<0) 
            {
                negativ[negativelem++] = tomb2[i];
            }
        }
       
       int negativsum = 0;
       System.out.print("\n\nNegatív tömb elemei: ");
        
            if (negativelem > 0)
            {
                for (int i = 0; i < negativelem; i++) 
                {
                    System.out.print(negativ[i] + " ");
                    negativsum = negativsum + negativ[i];
                }
            }
            
            else
                
            {
                System.out.print("nincs negativ");
            }
            System.out.println("\nA negatív tömb összege: "+negativsum);
            System.out.println("A negatív tömb átlaga: "+(double) negativsum/negativelem);
            
            for (int i = 0; i < interval; i++) 
        {
            if (negativ[i] /5 == 0) 
            {
                szerepel = true; 
            }
            else 
            {
                szerepel = false;
            }
        } 
        if (szerepel = true) 
        {
            System.out.println("\nA negatív tömbben szerepel 5-el osztható elem"); 
        }
        else
        {
               System.out.println("\nA negatív tömbben nem szerepel 5-el osztható elem");
        }
       
        System.out.print(szerepel + " ");
        
    }
}
