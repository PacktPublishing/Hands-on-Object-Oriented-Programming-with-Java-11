package exceptions;

public class PropagationOfCheckedExceptions {

	void m(){  
		//By default, Checked Exceptions are not forwarded in calling chain (propagated).
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
		  PropagationOfCheckedExceptions obj=new PropagationOfCheckedExceptions();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
}
