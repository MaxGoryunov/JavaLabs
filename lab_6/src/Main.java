import stack.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.print();
        st.push(10);
        st.print();
        st.push(30);
        st.push(20);
        st.print();
        st.push(40);
        st.push(60);
        st.print();
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        st.pop();
        st.print();
    }
}