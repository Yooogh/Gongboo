
public class StringBuffferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer ("01");
		StringBuffer sb2 = sb.append(23); //결과값이 자기자신을 되돌려줌 -> 레퍼런스가 늘어남
		sb.append('4').append(56);
		System.out.println(sb);
		System.out.println(sb2);
		
		StringBuffer sb3 = sb.append(78);
		sb.append(9.0);
		System.out.println("sb="+sb);
		System.out.println("sb2="+sb2);
		System.out.println("sb3="+sb3);
		System.out.println("sb="+sb.deleteCharAt(10));
		System.out.println("sb="+sb.delete(3,6));
		System.out.println("sb="+sb.insert(3, "abc"));
		System.out.println("sb="+sb.replace(6, sb.length(), "END"));
		
		System.out.println("capacity="+sb.capacity());
		System.out.println("length="+sb.length());

	}

}
