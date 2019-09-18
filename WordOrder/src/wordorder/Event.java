package wordorder;

public class Event {
		public People person;
		public Argument arg1;
		public Actions action;
		public Objects obj;
		public Argument arg2;
		public double probability;
		
		public Event(People p, Actions a, Objects o, double prob) {
			this.person = p;
			this.action = a;
			this.obj = o;
			this.probability = prob;
		}
	}