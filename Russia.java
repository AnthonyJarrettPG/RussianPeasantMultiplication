import java.util.*;

public class Russia{

	public static void main(String[] args){
		int M = 100;
		int N = 100;

		int res = russianPeasantMulti(100, 100);

		boolean proof = res == M * N;
		System.out.println("Proof: " + proof);
	}

	public static int russianPeasantMulti(int M, int N){

		boolean flag = true;
		int result = 0;
		List<Integer> mDivList = new ArrayList<>();
		mDivList.add(M);
		
		List<Integer> nMultipliedList = new ArrayList<>();

		while(M != 1){
			Integer divNum = M / 2;
			mDivList.add(divNum);
			M = divNum;
		 }
		 System.out.println(mDivList);

		 int sum = N;
		 nMultipliedList.add(sum);
		 for(int i = 1; i < mDivList.size(); i++){
		 	sum *= 2;
		 	nMultipliedList.add(sum);
		 }
		 System.out.println(nMultipliedList);
		 for(int i = 0; i < mDivList.size(); i++){

		 	if(mDivList.get(i) % 2 == 1){
		 		result += nMultipliedList.get(i);
		 		boolean bool = mDivList.get(i) % 2 == 1;
		 	}
		 }

		 return result;
	}
}