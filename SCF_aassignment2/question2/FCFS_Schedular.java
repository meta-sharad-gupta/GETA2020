import java.util.InputMismatchException;
import java.util.Scanner;

public class FCFS_Schedular {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//used for taking the input parameters

		while(true){
			try{
				System.out.print("Enter the number of process : ");
				int numberOfProcess = input.nextInt();
				int array[][] = new int[numberOfProcess][2];		

				for(int index = 0 ; index < numberOfProcess ; index++){
					System.out.print("Enter Arrival Time for Process"  +  (index+1)  +" : ");
					array[index][0] = input.nextInt();
					System.out.print("Enter Burst Time for Process"  +  (index+1)  +" : ");
					array[index][1] = input.nextInt();
				}
				//sorting of all processes
				int sortingVariable;
				for(int index = 0 ; index < numberOfProcess ; index++){
					for(int index2 = 0 ; index2 < numberOfProcess-1-index ; index2++){
						if(array[index2][0] > array[index2+1][0]){
							sortingVariable = array[index2+1][0];
							array[index2+1][0] = array[index2][0];
							array[index2][0] = sortingVariable;
							sortingVariable = array[index2+1][1];
							array[index2+1][1] = array[index2][1];
							array[index2][1] = sortingVariable;
						}
					}
				}
				//Displaying all the process
				Display(array,numberOfProcess);

				while(true){
					try{
						System.out.println("\nCalculate : ");
						System.out.println("1.Completion time for each process\n2.Waiting time for each process\n3.Turn around time for each process\n4.Average waiting time\n5.Maximum waiting time\n6.Display all the process\n7.Exit");

						int choiceOfProcess=input.nextInt();
						switch(choiceOfProcess){

						case 1:
							int completiontime[] = completionTime(array,numberOfProcess);
							for(int index = 0 ; index < numberOfProcess ; index++)
								System.out.println("\nCompletion Time for Process "  +  (index+1)  +  " : "  +  completiontime[index]);
							break;

						case 2:
							int waitingtime[] = waitingTime(array,numberOfProcess);
							for(int index = 0 ; index < numberOfProcess ; index++)
								System.out.println("\nWaiting Time for Process "  +  (index+1)  +  " : "  +  waitingtime[index]);
							break;

						case 3:
							int turnaroundtime[] = turnAroundTime(array,numberOfProcess);
							for(int index = 0 ; index < numberOfProcess ; index++)
								System.out.println("Turn around time for Process "  +  (index+1)  +  " : "  +  turnaroundtime[index]);
							break;

						case 4:
							System.out.println("Average wait time of all process is : "  +  averageWaitingTime(array,numberOfProcess));
							break;

						case 5:
							System.out.println("Maximum wait time in all process is : "  +  maxWaitingTime(array,numberOfProcess));
							break;

						case 6:
							Display(array,numberOfProcess);
							break;
						case 7:
							System.exit(0);

						default:
							System.out.println("\nEnter a Valid Choice.");
						}
					}
					catch(InputMismatchException e){
						System.out.println("\nEnter Valid Data.");
						input.next();
					}
				}
			}
			catch(InputMismatchException e){
				System.out.println("\nEnter Valid Data.");
				input.next();
			}
		}
	}
	/**
	 * Display each Process
	 * @param array : for getting values of process
	 * @param numberofprocess : for getting number of processes
	 */
	static void Display(int arr[][],int numberOfProcess){
		System.out.println("\nProcess			Arrival Time		Burst Time");
		for(int index = 0 ; index < numberOfProcess ; index++){
			System.out.print(index + 1);
			for(int index2 = 0 ; index2 < 2 ; index2++){
				System.out.print("			"  +  arr[index][index2]);		
			}
			System.out.println();
		}
	}
	/**
	 * Completion Time for each Process
	 * @param array : for getting values of process
	 * @param numberofprocess : for getting number of processes
	 */
	static int[] completionTime(int array[][] , int numberOfProcess){

		int completiontime[] = new int[numberOfProcess];
		completiontime[0]=array[0][1]+array[0][0];

		for(int index = 1 ; index < numberOfProcess ; index++){
			if(array[index][0] < completiontime[index-1]){
				completiontime[index] = completiontime[index-1] + array[index][1];
			}
			else{
				completiontime[index] = array[index][1] + array[index][0];
			}
		}
		return completiontime;

	}
	/**
	 * waiting Time for each Process
	 * @param array : for getting values of process
	 * @param numberofprocess : for getting number of processes
	 */
	static int[] waitingTime(int array[][],int numberOfProcess){

		int previousBurstTime = array[0][1] , previousArrivalTime = array[0][0] ;
		int waitingtime[] = new int[numberOfProcess] ;

		waitingtime[0] = 0 ;   //for first process waiting time = 0

		for(int index = 1 ; index < numberOfProcess ; index++){
			previousArrivalTime = previousArrivalTime + array[index][0];
			if(previousArrivalTime < previousBurstTime)
				waitingtime[index] = previousBurstTime - array[index][0];
			else
				waitingtime[index] = 0;
			previousBurstTime = previousBurstTime + array[index][1];	
		}
		return waitingtime;
	}
	/**
	 * Turn around time for each Process
	 * @param array : for getting values of process
	 * @param numberofprocess : for getting number of processes
	 */
	static int[] turnAroundTime(int array[][],int numberOfProcess){
		int turnAroundTime[] = new int[numberOfProcess] ;
		int completiontime[] = completionTime(array,numberOfProcess);
		for(int index = 0 ; index < numberOfProcess ; index++)
			turnAroundTime[index] = completiontime[index]-array[index][0];

		return turnAroundTime;
	}
	/**
	 * Average waiting time for all Process
	 * @param array : for getting values of process
	 * @param numberofprocess : for getting number of processes
	 */
	static int averageWaitingTime(int array[][],int numberOfProcess){

		int waitingtime[]=waitingTime(array,numberOfProcess);
		int totalWaitingTime = 0 , averageWaitingTime;                                        
		for(int index = 1 ; index < numberOfProcess ; index++)
			totalWaitingTime=waitingtime[index];

		return averageWaitingTime=(totalWaitingTime/numberOfProcess);

	}
	/**
	 * Maximum waiting time from all Process
	 * @param array : for getting values of process
	 * @param numberofprocess : for getting number of processes
	 */
	static int maxWaitingTime(int array[][],int numberOfProcess){
		int maxwaitingtime=0;
		int waitingtime[]=waitingTime(array,numberOfProcess);
		for(int index = 1 ; index < numberOfProcess ; index++){
			if(maxwaitingtime < waitingtime[index]){
				maxwaitingtime = waitingtime[index];
			}
		}
		return maxwaitingtime;


	}





}
