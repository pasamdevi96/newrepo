package gitproject;

public class NaturalNumbers {
	public boolean naturalNumberOrNot(int[] arr) {
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0 || arr[i]>=0) {
				count++;
				}
		}
		if(count==arr.length) {
		return true;
		}else {
			return false;
		}
		}
	

	public static void main(String[] args) {
		NaturalNumbers nn=new NaturalNumbers();
		int[] arr= {1,5,6,7,6};
		System.out.println(nn.naturalNumberOrNot(arr));
		}
}
