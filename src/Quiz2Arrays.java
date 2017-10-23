import javax.swing.JOptionPane;

//Ricarda Hill
//October 23, 2017
//Quiz 2: Arrays


public class Quiz2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing an array
		
		// create an array
		//int [] randomArray = {4, 6, 3, 8, 10, 11, 2, 15};
		int [] randomArray = {23, 100, 54, 65, 79, 234, 55};
		int sorted = randomArray.length;
		
		//1. Sort array
		//find the highest
		while(sorted > 0) {
			int max = randomArray[0];
			//keep track of where max is
			int maxIndex = 0;
			
			for (int i =0; i < sorted; i++) {
				if (randomArray[i] > max) {
					max = randomArray[i];
					maxIndex = i;		
				}
			}
			//move to the end and swap
			int hold = randomArray[sorted - 1];
			randomArray[sorted - 1] = max;
			randomArray[maxIndex] = hold;
			
			//update sorted variable
			sorted--;
		}
		//print my array
		for (int i = 0; i < randomArray.length; i++) {
			//JOptionPane.showMessageDialog(null, randomArray[i]);
			System.out.println(randomArray[i]);
		}
		//2. Find the range of values (highest - lowest)
		int range = randomArray[randomArray.length - 1] - randomArray[0];
		System.out.println("The range is: " + range);
		
	}

}
