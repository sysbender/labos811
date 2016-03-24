package file_example;



//implémentation d'une file (queue) à l'aide d'une liste doublement chainée.
public class File
{
	private int taille;
	private Element premier = null, dernier = null;

	public int size()
	{
		return taille;
	}

	public String toString()
	{
		String s = "[";
		Element t = premier;
		while (t!=null)
		  {
		  	s = s + t.data;
		  	t = t.next;
		  	if (t!=null)
		  	  s = s + ",";
		  }
		s = s + "]";
		return s;
	}

	public boolean ajouter(Object x)
	{
		if (x==null) return false;
		Element nouveau = new Element();
		nouveau.data = x;
		nouveau.next = null;
		nouveau.previous = dernier;	//nouveau.setPrevious(dernier);

		if (dernier != null)
		  dernier.next = nouveau;
		else
		  premier = nouveau;
		dernier = nouveau;
		taille++;
		return true;
	}
	public Object enlever()
	{
		if (premier == null)  //file vide
		  return null;
		Object x = premier.data;
		premier = premier.next;  //premier = premier.getNext();
		if (premier == null)
		  dernier = null;
		else
		  premier.previous = null;
		taille--;
		return x;
	}

  private class Element
	{
	  public Object data;
	  public Element next, previous;
	}
}