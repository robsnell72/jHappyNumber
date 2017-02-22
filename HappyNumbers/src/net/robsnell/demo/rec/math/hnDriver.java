package net.robsnell.demo.rec.math;

public class hnDriver {
	public static void main(String[] args) {
		if (args.length == 0 || args[0] == "/standard"){
			for (int i=1;i<101;i++){
                HappyNumber hn = new HappyNumber(i);
                String msg = String.format("%1$d=>%2$s", i, hn.getIsHappy().toString());
                System.out.println(msg);
			}
		}
		else if (args[0] == "/parallel") {
// TBD
//            Parallel.For(0, 101,
//                    index =>  {
//                        HappyNumber hn = new HappyNumber(index);
//                        Console.WriteLine($"({index})=>{hn.isHappy}");
//                    }
//                  );
		}
	
		System.exit(0);
	}
}
