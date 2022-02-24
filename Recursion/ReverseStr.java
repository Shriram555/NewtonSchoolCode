class ReverseStr{
	public static int first=1;
	public static int last=1;
	public static void printOcc(String str , int idx ,char element ){
	if(idx==str.length()){
		System.out.println(first);
		System.out.println(last);
	}
		char fchar = str.charAt(idx);
	if(fchar==element){
		if(first==-1){
			first=idx;
		
		}else{
			last=idx;
		}
	}
	printOcc(str, idx+1, element);
	}
 	public static void main(String args[]){
		String str="abcdafsaagsfaoj";
       printOcc(str, 0, 'a');
	}
}