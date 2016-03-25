import java.util.*;
public class number{
	
	String a;
	String b;

	ArrayList<Integer> aBig=new ArrayList<>();
	ArrayList<Integer> bBig=new ArrayList<>();

	ArrayList<String> aSBig=new ArrayList<>();
	ArrayList<String> bSBig=new ArrayList<>();

	ArrayList<Integer> adouble=new ArrayList<>();
	ArrayList<Integer> bdouble=new ArrayList<>();
	ArrayList<Integer> adddouble=new ArrayList<>();

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
			aSBig.add(String.valueOf(a.charAt(i)));
		}
	}
	public void BAaddtoList(){
		for(int i=a.length()-1;i>=0;i--){
			bSBig.add(bString.valueOf(.charAt(i)));
		}
	}
	public boolean Ajudgmentdouble(){
		return aSBig.contains(".");
	}
	//judment double
	public boolean Bjudgmentdouble(){
		return bSBig.contains(".");
	}
	//add to intlist
	public void aBigaddtoList(){	
		for(int i=0;i<=aSBig.size()-1;i++){
			aBig.add(Integer.parseInt(aSBig.get(i)));
		}		
	}
	public void bBigaddtoList(){	
		for(int i=0;i<=bSBig.size()-1;i++){
			bBig.add(Integer.parseInt(bSBig.get(i)));
		}		
	}
	public void printa(){		
		for(int ia = aBig.size()-1;ia >= 0; ia--){
			System.out.print(aBig.get(ia));
		}	
	}	
	public void printb(){
		for(int ia = bBig.size()-1;ia >= 0; ia--){
			System.out.print(bBig.get(ia));
		}
	}
	public void sizesame(){
		while(bBig.size()!=aBig.size()){
			if(bBig.size()>aBig.size())
				aBig.add(0);
			else
				bBig.add(0);			
		}		
	}
	public void add(){
		int carry=0;
		for(int i=0;i<=bBig.size()-1;i++){		
			int sum=aBig.get(i)+bBig.get(i);
			
			if(sum>=10){
				addBig.add(aBig.get(i)+bBig.get(i)-10+carry);
				carry=1;			
			}else{ 
				addBig.add(aBig.get(i)+bBig.get(i)+carry);
				carry=0;
			}
		}
		if(carry==1)
			addBig.add(1);
	}
	public void addprint(){
		for(int ia = addBig.size()-1;ia >= 0; ia--){
			System.out.print(addBig.get(ia));
		}
	}
	public void doubleaddA(){
		for(int i=0;i<=AjudgmentdoubleA()-1;i++)
		adouble.add(Integer.parseInt(aSBig.get(i)));

	}

	public void doubleaddB(){
		for(int i=0;i<=BjudgmentdoubleB()-1;i++)
		bdouble.add(Integer.parseInt(bSBig.get(i)));
	}

	public void sizesamedouble(){
		while(adouble.size()!=bdouble.size()){
			if(bdouble.size()>adouble.size())
				adouble.add(0);
			else
				bdouble.add(0);			
		}		
	}

	public void doubleadd(){
		int carry=0;
		for(int i=0;i<=adouble.size()-1;i++){		
			int sum=adouble.get(i)+bdouble.get(i);
			
			if(sum>=10){
				adddouble.add(adouble.get(i)+bdouble.get(i)-10+carry);
				carry=1;			
			}else{ 
				adddouble.add(adouble.get(i)+bdouble.get(i)+carry);
				carry=0;
			}
		}
		if(carry==1)
			adddouble.add(1);
	}
	public void adddoubleprint(){
		for(int ia = adddouble.size()-1;ia >= 0; ia--){
			System.out.print(adddouble.get(ia));
		}
	}

	

	

}
