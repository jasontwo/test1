public class a{
	public  static void main(String[] args){
		int [] arr = {12,15,48,65,48,11 };
		for(int i = 0;i < arr.length;i++){
			for(int j = i;j < arr.length;j++){
			if(arr[i] > arr[j]){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
		for(int i : arr){
			System.out.print(i+ " ");
		}
	}
}	
