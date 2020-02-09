
public class bisiklet {

	Insan binmisInsan;
	
	public void bin(Insan gelenInsan)
	{
		if(binmisInsan==null)
		{
			binmisInsan=gelenInsan;
			System.out.println(binmisInsan.getIsim()+"	başarıyla bindi.");
		}
		else
		{
			System.out.println("Zaten " +binmisInsan.getIsim()+ " binmiş!");
		}
	}
	
	public void in()
	{
		if(binmisInsan==null)
		{
			System.out.println("Zaten bisiklet boş!");
		}
		else
		{
			System.out.println(binmisInsan.getIsim()+" başarıyla indi!");
			binmisInsan=null;
		}
	}
	
	
}
