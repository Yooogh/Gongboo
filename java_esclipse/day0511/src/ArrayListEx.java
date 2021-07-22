import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<E> list = new ArrayList();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");
		System.out.println(list);
		
		list.add(0, "000");
		System.out.println(list);
		
		System.out.println("index=="+list.indexOf("333"));
		
		list.remove("333");
		System.out.println(list);
		
		System.out.println(list.remove("333"));
		System.out.println(list);
		System.out.println("index="+list.indexOf("333"));
		
		for(int i=0; i<list.size(); i++)
			list.set(i, i+"");
		
		System.out.println("{");
		for(int i=0;i<list.size(); i++)
			System.out.print(list.get(i)+", ");
		System.out.println("}");
		
		for(int i=0; i<list.size(); i++)
			list.remove(i);
		System.out.println(list);
		
		for(int i=list.size()-1; i>=0; i--)//remove를 for문으로 쓸 때는 마지막 요소부터 거꾸로 올라가며 삭제
			list.remove(i);
		System.out.println(list);

	}

}
