package day0513;
import java.io.*;
public class FileEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx7 pattern");
			System.exit(0);
		}
		String currDir = System.getProperty("user.dir");
		
		File dir = new File(currDir);
		final String pattern = args[0];
		//String[] list (FilenameFilter filter
		String[] files = dir.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {//name으로 받은 문자열에 입력한 패턴이 있으면 true 없으면 false
				return name.indexOf(pattern) != -1;
			}
		});
		
		for (int i=0; i < files.length; i++) {
			System.out.println(files[i]);
		}

	}

}
