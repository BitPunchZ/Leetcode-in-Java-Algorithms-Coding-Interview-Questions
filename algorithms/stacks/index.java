
class Stack { 
	ArrayList<Integer>st;


	Stack() { 
		st = new ArrayList<Integer>();
	} 

	void push(int x) { 
		st.add(x);
	} 

	int pop() { 
        if(st.size()==0){
            return null;
        }
        int lastElement =  st.get(st.size()-1);
        st.remove(st.size()-1);
        return lastElement;
	} 

	int peek() { 
		if(st.size()==0){
            return null;
        }
        return st.get(st.size()-1);
	} 

    int getLength() {
        return st.size();
    }
} 

// Driver code 
class Main { 
	public static void main(String args[]) 
	{ 
		Stack s = new Stack(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 
		System.out.println(s.pop() + " Popped from stack"); 
	} 
} 
