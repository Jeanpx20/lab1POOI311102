/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void main(String[] args) {
		
		//ejercicio 1.1
		if (6 < 6 * 5)
    
    System.out.print("Hello");
    System.out.print(" There");
    
    //imprime "Hello there"
    
    
    // Ejercicio 1.2
    
    int x=1, y=2, z=3;
		
		if (x>y)
		if (x>z)
		
		  System.out.println("1111");
		else
		  System.out.println("2222");
		  
	// No sale ningun resultado
	
	//Ejercicio 1.3
	
	int x=1, y=2, z=3;
	
	if (x < z)
	   System.out.println(" * ");
	 else if (x == z)
	   System.out.println(" & ");
	 else
     System.out.println(" $ ");
	
	//Imprime "*"
	
	
	//Ejericico 1.4
	
	int x=1, y=2, z=3;
	
	if (x<y)
	  System.out.println("####");
	else
	  System.out.println("&&&&");
	  System.out.println("****");
	  
	// Imprime "####
	//          ****"
	
	
	//Ejericio 1.5
	
	int x=1, y=2, z=3;
	
	if (x>y) 
	  System.out.println("####");
	else
	  System.out.println("&&&&");
	  System.out.println("****");
	  
	//Imprime "&&&&
	//         ****"
    
    //ejercicio 1.6
    
    int a1=100;  int a2=200;
		
		if (a1>100 && a2<=200)
		  System.out.println(a1+" "+a2+" "+(a1+a2));
		else
		  System.out.println(a1+" "+a2+" "+(2*a1-a2));
	
	//imprime "100 200 0"
	
	// Ejercicio 1.7
	
	int x=1, y=2, z=3;
		
	if (++x > y++ || x-- > 0)
		    
		     z++;
	  else
	       z--;
	 
	  System.out.println(x+" "+y+" "+z);
	  
	// imprime " 1 3 4"
		  
		
	}
}
