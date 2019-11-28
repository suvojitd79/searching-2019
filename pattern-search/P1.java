import java.util.*;
public class P1{
	
	public static int[] computePrefix(char[] nums){

		if(nums == null) return null; // exception

		int[] temp = new int[nums.length];

		if(nums.length == 0) return temp; // exception

		temp[0] = 0;

		int i = 0, j = 1;

		while(j < nums.length){


			if(nums[i] == nums[j]){
				temp[j] = i + 1;
				i++;
			}else{

				while(i > 0){

					i = temp[i-1];
	
					if(nums[j] == nums[i]) { 
						break;
					}

				}	

				if(nums[i] == nums[j]){
					temp[j] = i + 1;
					i++;
				}else
					temp[j] = 0;
			}

			j++;
		}

		return temp;
	}

	// O(m+n)
	public static int[] search(char[] text, char[] pattern){


		if(text == null || pattern == null || pattern.length > text.length || (text.length == 0 && pattern.length == 0)) return null; // not valid

		// O(n)
		int[] prefix = computePrefix(pattern);

		int i = 0, j = 0;	

		while(i < text.length){

			if(text[i] == pattern[j]){
				i++;
				j++;

				// got it
				if(j == pattern.length) break;

			}else{

				if(j != 0){

					j = prefix[j-1];

				}else{

					i++;

				}

			}

		}

		if(j == pattern.length) {

			return new int[]{i-pattern.length,i-1};

		}

		return null;

	}	


	public static void main(String... args){


		String text = "suvojit@gmail.com";
		String pattern = "gmail.co0";


		System.out.println(Arrays.toString(search(text.toCharArray(), pattern.toCharArray())));

	}


}