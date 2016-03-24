package file_example;

public class Demo
 {
 	public static void main(String s[])
 	 {
 	 	File f = new File();
 	 	
 	 	f.ajouter(new Integer(54));
 	 	f.ajouter(new Integer(44));
 	 	f.ajouter(new Integer(28));
 	 	System.out.println(f);
                
 	 	f.enlever();
 	 	System.out.println(f);
 	 	f.enlever();
 	 	f.ajouter(new Integer(99));
 	 	System.out.println(f);
 	 	f.enlever();
 	 	System.out.println(f);
 	 	f.enlever();
 	 	System.out.println(f);
 	 	f.enlever();
 	 	System.out.println(f);
 	 }
 }
 