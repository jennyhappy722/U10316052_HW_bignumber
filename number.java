//u10316052
import java.util.*;
public class number{
	
	String a;
	String b;

	ArrayList<Integer> aBig=new ArrayList<>();//int
	ArrayList<Integer> bBig=new ArrayList<>();//int
	ArrayList<Integer> addBig=new ArrayList<>();//intsum
	ArrayList<String> aSBig=new ArrayList<>();//String judgment wheater.
	ArrayList<String> bSBig=new ArrayList<>();//String judgment wheater

	ArrayList<Integer> adouble=new ArrayList<>();//.double
	ArrayList<Integer> bdouble=new ArrayList<>();//.double
	ArrayList<Integer> adddouble=new ArrayList<>();
	//input constrtor
	number(){
		Scanner input=new Scanner(System.in);
		System.out.print("請輸入兩數，讓兩數加總");
		a=input.nextLine();
		b=input.nextLine();
	}
	//add to list
	public void AaddtoList(){
		for(int i=a.length()-1;i>=0;i--){
			aSBig.add(String.valueOf(a.charAt(i)));
		}
	}
	//add to list
	public void BAaddtoList(){
		for(int i=a.length()-1;i>=0;i--){
			bSBig.add(bString.valueOf(b.charAt(i)));
		}
	}
	//judment double
	public boolean Ajudgmentdouble(){
		return aSBig.contains(".");
	}
	//judment double
	public boolean Bjudgmentdouble(){
		return bSBig.contains(".");
	}
	//judment double
	public int BjudgmentdoubleB(){
		if(Bjudgmentdouble())
		return bSBig.indexOf(".");
		else
		return 0;
	}
	//judment double
	public int AjudgmentdoubleA(){
		if(Ajudgmentdouble())
		return aSBig.indexOf(".");
		else
		return 0;
	}
	//add to intlist
	public void aBigaddtoList(){
		if(Ajudgmentdouble()){
			for(int i=AjudgmentdoubleA()+1;i<=aSBig.size()-1;i++){
				aBig.add(Integer.parseInt(aSBig.get(i)));
			}
		}else{	
			for(int i=0;i<=aSBig.size()-1;i++){
				aBig.add(Integer.parseInt(aSBig.get(i)));
			}
		}		
	}
	public void bBigaddtoList(){	
	//add to intlist
	public void bBigaddtoList(){
		if(Ajudgmentdouble()){
			for(int i=BjudgmentdoubleB()+1;i<=bSBig.size()-1;i++){
				bBig.add(Integer.parseInt(bSBig.get(i)));
			}
		}else{			
			for(int i=0;i<=bSBig.size()-1;i++){
				bBig.add(Integer.parseInt(bSBig.get(i)));
			}
		}		
	}
	//printa
	public void printa(){		
		for(int ia = aBig.size()-1;ia >= 0; ia--){
			System.out.print(aBig.get(ia));
		}	
	}
	//printb
	public void printb(){
		for(int ia = bBig.size()-1;ia >= 0; ia--){
			System.out.print(bBig.get(ia));
		}
	}
	//let same size
	public void sizesame(){
		while(bBig.size()!=aBig.size()){
			if(bBig.size()>aBig.size())
				aBig.add(0);
			else
				bBig.add(0);			
		}		
	}
	//int add
	public void add(){
		int carry=0;
		int sum=aBig.get(0)+bBig.get(0)+doubleadd();
			
		if(sum>=10){
			addBig.add(sum-10);
			carry=1;			
		}else{ 
			addBig.add(sum);
			carry=0;
		}
		for(int i=1;i<=bBig.size()-1;i++){		
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
	//addtodoublea
	public void doubleaddA(){
		for(int i=0;i<=AjudgmentdoubleA()-1;i++)
		adouble.add(Integer.parseInt(aSBig.get(i)));

	}
	//add to double blist
	public void doubleaddB(){
		for(int i=0;i<=BjudgmentdoubleB()-1;i++)
		bdouble.add(Integer.parseInt(bSBig.get(i)));
	}
	//doublesamesize
	public void sizesamedouble(){
		while(adouble.size()!=bdouble.size()){
			if(bdouble.size()>adouble.size())
				adouble.add(0);
			else
				bdouble.add(0);			
		}		
	}
	//doubleadd return carry to int
	public int doubleadd(){
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
			return 1;
		else
			return 0;
	}
	//print sum
	public void adddoubleprint(){
		for(int ia = (adddouble.size()-1)/2;ia >= 0; ia--){
			System.out.print(adddouble.get(ia));
		}
	}

	

	

}
