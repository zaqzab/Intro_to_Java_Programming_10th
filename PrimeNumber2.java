public class PrimeNumber2 {
	public static void main(String[] agrs) {
		final int NUBMER_OF_PRIMES = 500;
		final int NUBMER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		
		System.out.println("The first 50 prime nubmers are \n");
		
		while (count < NUBMER_OF_PRIMES) {
			
			boolean isPrime = true;
			
			for (int divisor = 2; divisor <= number /2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
					
				}
				
			}
			
			if (isPrime){
				count++;
				
				if (count % NUBMER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);	
				}
				else {
					System.out.print(number + " ");
				}
			}
			number++;
		}
	}
	

}
