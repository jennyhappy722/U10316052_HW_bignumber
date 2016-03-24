import java.util.*;
public class number{
	
	String a;
	String b;

	ArrayList<Integer> aBig=new ArrayList<>();
	ArrayList<Integer> bBig=new ArrayList<>();

	ArrayList<Object> aSBig=new ArrayList<>();
	ArrayList<Object> bSBig=new ArrayList<>();

	ArrayList<Integer> adouble=new ArrayList<>();
	ArrayList<Integer> bdouble=new ArrayList<>();

	number(){
		Scanner input=new Scanner(System.in);
		System.out.print("請輸入兩數");
		a=input.nextLine();
		b=input.nextLine();
		AaddtoList();
		BAaddtoList();
	}


	
	public void AaddtoList(){

		for(int i=a.length()-1;i>=0;i--){
			aSBig.add(a.charAt(i));
		}

		for(int ia = aSBig.size()-1;ia >= 0; ia--){
			System.out.print(aSBig.get(ia));
		}
		
	}

	public void BAaddtoList(){

		for(int i=a.length()-1;i>=0;i--){
			bSBig.add(b.charAt(i));
		}

		for(int ia = bSBig.size()-1;ia >= 0; ia--){
			System.out.print(bSBig.get(ia));
		}
	}

	public 
	
	public String geta(){
		return a;
	}

	public String getb(){
		return a;
	}
}
