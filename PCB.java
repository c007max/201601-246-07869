import java.util.Random;

public class PCB
{
	private String 	PCB_state;
	private int		PCB_ID ;
	private String	pgmCounter;
	private int		CPU_used;
	private int		CPU_max;
	private int		timeWaiting;
	
	private static int	PCB__K;
		
	// constructor methods
		
	public PCB ()
	{
		Random random__X	= new Random();

		PCB__K		+= 1 ;	//=====>	Increment the static variable for Process ID
		PCB_state	= "Ready" ;
		PCB_ID		= PCB__K ; 
		pgmCounter	= "" ;
		CPU_used	= 0 ;
		CPU_max		= random__X.nextInt(45) + 6 ;	// Assign max to be between 5 and 50
		timeWaiting	= 0 ;
	}	
		
	// default constructor
	
	public String showPCB()
	{
		return "state: " + PCB_state
			+ "\tID: "	+ Integer.toString(PCB_ID)
			//	+ "\tK: "	+ pgmCounter
			+ "\tCPU used: "	+ Integer.toString(CPU_used)	
			+ "\tCPU max: "	+ Integer.toString(CPU_max)					
			+ "\tWait: "	+ Integer.toString(timeWaiting)
			;
	}
		
	//	set methods
	
	public String get_state()
	{
		return PCB_state;
	}
	
	public int get_ID()
	{
		return PCB_ID;
	}
	
	public int get_CPU_used()
	{
		return CPU_used;
	}
	
	public int get_CPU_max()
	{
		return CPU_max;
	}	
	
	public String get_pgmCounter()
	{
		return pgmCounter;
	}	
	
	public int get_timeWaiting()
	{
		return timeWaiting;
	}	
	
	// Set methods , void returns no value

	public void set_state(String state0)
	{
		PCB_state	= state0 ;
	}
	
	public void set_CPU_used(int CPU0)
	{
		CPU_used	= CPU0 ;
	}

	public void add_CPU_used(int c0)
	{
		CPU_used	+= c0 ;
	}
	
	
	public void set_CPU_max(int CPU0)
	{
		CPU_max	= CPU0 ;
	}
	
	public void set_pgmCounter(String pgmCounter0)
	{
		pgmCounter	= pgmCounter0 ;
	}
	
	public void set_timeWaiting(int timeWaiting0)
	{
		timeWaiting	= timeWaiting0 ;
	}
	
	public void add_timeWaiting(int t0)
	{
		timeWaiting	+= t0 ;
	}
}